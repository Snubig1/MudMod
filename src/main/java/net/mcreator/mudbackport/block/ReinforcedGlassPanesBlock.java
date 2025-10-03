
package net.mcreator.mudbackport.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class ReinforcedGlassPanesBlock extends IronBarsBlock {
	public ReinforcedGlassPanesBlock() {
		super(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(MudBackportModBlocks.REINFORCED_GLASS_PANES.get(), renderType -> renderType == RenderType.cutoutMipped());
	}
}