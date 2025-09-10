package net.mcreator.mudbackport.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.mudbackport.init.MudBackportModBlocks;

import java.util.Map;

public class MudCreationDispenseSuccessfullyIfProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Direction direction, ItemStack itemstack) {
		if (direction == null)
			return false;
		if ((itemstack.getOrCreateTag().getString("Potion")).equals("minecraft:water") && itemstack.getItem() == Items.POTION) {
			if (direction == Direction.DOWN) {
				if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DIRT) {
					{
						BlockPos _bp = new BlockPos(x, y - 1, z);
						BlockState _bs = MudBackportModBlocks.MUD.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mud_backport:bottle_splashing")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mud_backport:bottle_splashing")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SPLASH, (x + 0.5), (y - 0), (z + 0.5), 4, 0.4, 0, 0.4, 1);
					return true;
				} else {
					return false;
				}
			} else if (direction == Direction.UP) {
				if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DIRT) {
					{
						BlockPos _bp = new BlockPos(x, y + 1, z);
						BlockState _bs = MudBackportModBlocks.MUD.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mud_backport:bottle_splashing")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mud_backport:bottle_splashing")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SPLASH, (x + 0.5), (y + 2), (z + 0.5), 4, 0.4, 0, 0.4, 1);
					return true;
				} else {
					return false;
				}
			} else if (direction == Direction.NORTH) {
				if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DIRT) {
					{
						BlockPos _bp = new BlockPos(x, y, z - 1);
						BlockState _bs = MudBackportModBlocks.MUD.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mud_backport:bottle_splashing")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mud_backport:bottle_splashing")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SPLASH, (x + 0.5), (y + 1), (z - 0.5), 4, 0.4, 0, 0.4, 1);
					return true;
				} else {
					return false;
				}
			} else if (direction == Direction.SOUTH) {
				if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DIRT) {
					{
						BlockPos _bp = new BlockPos(x, y, z + 1);
						BlockState _bs = MudBackportModBlocks.MUD.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mud_backport:bottle_splashing")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mud_backport:bottle_splashing")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SPLASH, (x + 0.5), (y + 1), (z + 1.5), 4, 0.4, 0, 0.4, 1);
					return true;
				} else {
					return false;
				}
			} else if (direction == Direction.WEST) {
				if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DIRT) {
					{
						BlockPos _bp = new BlockPos(x - 1, y, z);
						BlockState _bs = MudBackportModBlocks.MUD.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mud_backport:bottle_splashing")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mud_backport:bottle_splashing")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SPLASH, (x - 0.5), (y + 1), (z + 0.5), 4, 0.4, 0, 0.4, 1);
					return true;
				} else {
					return false;
				}
			} else if (direction == Direction.EAST) {
				if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DIRT) {
					{
						BlockPos _bp = new BlockPos(x + 1, y, z);
						BlockState _bs = MudBackportModBlocks.MUD.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mud_backport:bottle_splashing")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mud_backport:bottle_splashing")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SPLASH, (x + 1.5), (y + 1), (z + 0.5), 4, 0.4, 0, 0.4, 1);
					return true;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
		return false;
	}
}
