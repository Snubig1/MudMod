
package net.mcreator.mudbackport.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class PackedMudBlock extends Block {
	public PackedMudBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("mud_backport:packed_mud_break")), () -> new SoundEvent(new ResourceLocation("mud_backport:packed_mud_step")),
						() -> new SoundEvent(new ResourceLocation("mud_backport:packed_mud_break")), () -> new SoundEvent(new ResourceLocation("mud_backport:packed_mud_step")),
						() -> new SoundEvent(new ResourceLocation("mud_backport:packed_mud_step"))))
				.strength(1f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}