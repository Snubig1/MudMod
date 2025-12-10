
package net.mcreator.mudbackport.block;

import com.google.common.collect.ImmutableList;
import net.mcreator.mudbackport.MudBackportMod;
import net.minecraft.core.Vec3i;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

import net.mcreator.mudbackport.init.MudBackportModBlocks;

public class AraucariaLeavesBlock extends LeavesBlock {

	public AraucariaLeavesBlock() {
		super(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).strength(0.2f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

    @Override
    public void tick(BlockState p_54426_, ServerLevel p_54427_, BlockPos p_54428_, Random p_54429_) {
        p_54427_.setBlock(p_54428_, updateDistance(p_54426_, p_54427_, p_54428_), 3);
    }

    public boolean isRandomlyTicking(BlockState p_54449_) {
        return !p_54449_.getValue(PERSISTENT);
    }

    @Override
    public void randomTick(BlockState p_54451_, ServerLevel p_54452_, BlockPos p_54453_, Random p_54454_) {

        tick(p_54451_, p_54452_, p_54453_, p_54454_);
        p_54451_ = updateDistance(p_54451_, p_54452_, p_54453_);

        if (!p_54451_.getValue(PERSISTENT) && p_54451_.getValue(DISTANCE) == 7) {
            dropResources(p_54451_, p_54452_, p_54453_);
            p_54452_.removeBlock(p_54453_, false);
        }

    }

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 30;
	}
    /*
	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}*/

    static Vec3i[] directionArray = new Vec3i[]{
            new Vec3i(1,0,0),
            new Vec3i(-1,0,0),
            new Vec3i(0,1,0),
            new Vec3i(0,-1,0),
            new Vec3i(0,0,1),
            new Vec3i(0,0,-1),
            new Vec3i(1,-1,0),
            new Vec3i(-1,-1,0),
            new Vec3i(0,-1,1),
            new Vec3i(0,-1,-1),
            new Vec3i(1,-1,1),
            new Vec3i(1,-1,-1),
            new Vec3i(-1,-1,1),
            new Vec3i(-1,-1,-1)

    };

    private static BlockState updateDistance(BlockState p_54436_, LevelAccessor p_54437_, BlockPos p_54438_) {
        int i = 7;
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();



        for(Vec3i direction : directionArray) {
            blockpos$mutableblockpos.setWithOffset(p_54438_, direction);
            i = Math.min(i, getDistanceAt(p_54437_.getBlockState(blockpos$mutableblockpos)) + 1);
            if (i == 1) {
                break;
            }
        }
        return p_54436_.setValue(DISTANCE, Integer.valueOf(i));
    }

    private static int getDistanceAt(BlockState p_54464_) {
        if (p_54464_.is(BlockTags.LOGS)||p_54464_.is(MudBackportModBlocks.ARAUCARIA_BRANCHES.get())) {
            return 0;
        } else {
            return p_54464_.getBlock() instanceof LeavesBlock ? p_54464_.getValue(DISTANCE) : 7;
        }
    }
}
