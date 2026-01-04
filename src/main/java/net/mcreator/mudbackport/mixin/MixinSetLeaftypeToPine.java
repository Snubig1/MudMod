package net.mcreator.mudbackport.mixin;

import net.mcreator.mudbackport.init.MudBackportModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

@Mixin(FoliagePlacer.class)
public class MixinSetLeaftypeToPine {
    @Inject(method = "tryPlaceLeaf", at = @At("TAIL"))
    private static void tryPlaceLeaf(LevelSimulatedReader p_161432_, BiConsumer<BlockPos, BlockState> p_161433_, Random p_161434_, TreeConfiguration p_161435_, BlockPos p_161436_, CallbackInfo ci)
    {
        if (p_161435_.foliageProvider.getState(p_161434_, p_161436_) == Blocks.STRUCTURE_VOID.defaultBlockState())
        {
            if (p_161432_.isStateAtPosition(p_161436_, Predicate.isEqual(Blocks.STRUCTURE_VOID.defaultBlockState()))) {
                p_161433_.accept(p_161436_, MudBackportModBlocks.PINE_LEAVES.get().defaultBlockState());
            }
        }
    }
}
