
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mudbackport.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class MudBackportModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == MudBackportModBlocks.ROOTS.get().asItem())
			event.setBurnTime(300);
	}
}
