
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mudbackport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.mudbackport.MudBackportMod;

public class MudBackportModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MudBackportMod.MODID);
	public static final RegistryObject<ParticleType<?>> GINKGO_PARTICLES = REGISTRY.register("ginkgo_particles", () -> new SimpleParticleType(false));
}
