
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mudbackport.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MudBackportModTabs {
	public static CreativeModeTab TAB_MUDMODTAB;

	public static void load() {
		TAB_MUDMODTAB = new CreativeModeTab("tabmudmodtab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MudBackportModBlocks.PACKED_MUD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
