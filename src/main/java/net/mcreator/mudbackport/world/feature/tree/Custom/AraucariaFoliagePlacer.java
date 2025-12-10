package net.mcreator.mudbackport.world.feature.tree.Custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.mcreator.mudbackport.init.MudBackportModBlocks;
import net.mcreator.mudbackport.init.MudBackportModFoliagePlacers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.Random;
import java.util.function.BiConsumer;

public class AraucariaFoliagePlacer  extends FoliagePlacer {
    public static final Codec<AraucariaFoliagePlacer> CODEC = RecordCodecBuilder.create((placer) ->
            foliagePlacerParts(placer).apply(placer, AraucariaFoliagePlacer::new));

    public AraucariaFoliagePlacer(IntProvider p_161411_, IntProvider p_161412_) {
        super(p_161411_, p_161412_);
    }

    @Override
    protected FoliagePlacerType<?> type() {return MudBackportModFoliagePlacers.ARAUCARIA_FOLIAGE_PLACER.get();}

    @Override
    protected void createFoliage(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> biConsumer, Random random, TreeConfiguration configuration, int p_161426_, FoliageAttachment attachment, int p_161428_, int p_161429_, int p_161430_) {
        Direction direction;

        tryPlaceLeaf(level, biConsumer, random, configuration, attachment.pos());

        if (attachment.radiusOffset() == 1)
        {
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().above());
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().north());
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().south());
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().west());
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().east());
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().above().north(2));
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().above().south(2));
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().above().west(2));
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().above().east(2));
        }

        if (attachment.radiusOffset() >= 10) direction = Direction.values()[attachment.radiusOffset()-10];
        else direction = Direction.values()[attachment.radiusOffset()];


        if (attachment.radiusOffset() != 0 && attachment.radiusOffset() != 1) {
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().relative(direction, 1));
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().relative(direction, -1).relative(direction.getClockWise(), 1));
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().relative(direction, -1).relative(direction.getClockWise(), -1));

            if (attachment.radiusOffset()< 10){
                TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().relative(direction.getClockWise(), 1));
                TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().relative(direction.getClockWise(), -1));
            }
            if (attachment.doubleTrunk()){
                TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().relative(direction, 2).above());

                if (attachment.radiusOffset()< 10){
                    TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().relative(direction, -1).relative(direction.getClockWise(), 2).above());
                    TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().relative(direction, -1).relative(direction.getClockWise(), -2).above());
                    TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().relative(direction, 1).relative(direction.getClockWise(), 2).above());
                    TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().relative(direction, 1).relative(direction.getClockWise(), -2).above());
                }
                else{
                    TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().relative(direction.getClockWise(), 2).above());
                }
            }
        }

        if (attachment.radiusOffset() == 0){
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().north());
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().south());
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().west());
            TryPlaceLeafAndNeedles(level, biConsumer, random, configuration, attachment.pos().east());
        }
    }


    @Override
    public int foliageHeight(Random p_68568_, int p_68569_, TreeConfiguration p_68570_) {
        return 0;
    }

    @Override
    protected boolean shouldSkipLocation(Random p_68562_, int p_68563_, int p_68564_, int p_68565_, int p_68566_, boolean p_68567_) {
        return false;
    }
    private void TryPlaceLeafAndNeedles(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> biConsumer, Random random, TreeConfiguration configuration, BlockPos pos)
    {
        tryPlaceLeaf(level, biConsumer, random, configuration, pos);
        if (level.isStateAtPosition(pos.above(), BlockBehaviour.BlockStateBase::isAir) && random.nextInt(20)!=0)
        {
            biConsumer.accept(pos.above(), BlockStateProvider.simple(MudBackportModBlocks.ARAUCARIA_NEEDLES.get()).getState(random,pos.above()));
        }
    }
}
