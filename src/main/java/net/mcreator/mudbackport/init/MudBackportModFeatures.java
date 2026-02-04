
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mudbackport.init;

import net.mcreator.mudbackport.MudBackportMod;
import net.mcreator.mudbackport.block.*;
import net.mcreator.mudbackport.world.feature.PerBiomeVegetationPatchFeature;
import net.mcreator.mudbackport.world.feature.tree.Custom.AraucariaTrunkPlacer;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WaterloggedVegetationPatchFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.VegetationPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public abstract class MudBackportModFeatures<FC extends FeatureConfiguration> extends net.minecraftforge.registries.ForgeRegistryEntry<net.minecraft.world.level.levelgen.feature.Feature<?>> {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MudBackportMod.MODID);
    public static final RegistryObject<Feature<VegetationPatchConfiguration>> PER_BIOME_VEGETATION_PATCH = REGISTRY.register("per_biome_vegetation_patch", () -> new PerBiomeVegetationPatchFeature(VegetationPatchConfiguration.CODEC));

}
