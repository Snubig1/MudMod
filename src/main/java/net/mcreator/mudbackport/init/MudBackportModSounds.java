
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mudbackport.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MudBackportModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("mud_backport", "mud_bricks_break"), new SoundEvent(new ResourceLocation("mud_backport", "mud_bricks_break")));
		REGISTRY.put(new ResourceLocation("mud_backport", "packed_mud_step"), new SoundEvent(new ResourceLocation("mud_backport", "packed_mud_step")));
		REGISTRY.put(new ResourceLocation("mud_backport", "packed_mud_break"), new SoundEvent(new ResourceLocation("mud_backport", "packed_mud_break")));
		REGISTRY.put(new ResourceLocation("mud_backport", "bottle_splashing"), new SoundEvent(new ResourceLocation("mud_backport", "bottle_splashing")));
		REGISTRY.put(new ResourceLocation("mud_backport", "mud_bricks_step"), new SoundEvent(new ResourceLocation("mud_backport", "mud_bricks_step")));
		REGISTRY.put(new ResourceLocation("mud_backport", "mud_step"), new SoundEvent(new ResourceLocation("mud_backport", "mud_step")));
		REGISTRY.put(new ResourceLocation("mud_backport", "mud_break"), new SoundEvent(new ResourceLocation("mud_backport", "mud_break")));
		REGISTRY.put(new ResourceLocation("mud_backport", "roots_break"), new SoundEvent(new ResourceLocation("mud_backport", "roots_break")));
		REGISTRY.put(new ResourceLocation("mud_backport", "roots_step"), new SoundEvent(new ResourceLocation("mud_backport", "roots_step")));
		REGISTRY.put(new ResourceLocation("mud_backport", "muddy_roots_break"), new SoundEvent(new ResourceLocation("mud_backport", "muddy_roots_break")));
		REGISTRY.put(new ResourceLocation("mud_backport", "muddy_roots_step"), new SoundEvent(new ResourceLocation("mud_backport", "muddy_roots_step")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
