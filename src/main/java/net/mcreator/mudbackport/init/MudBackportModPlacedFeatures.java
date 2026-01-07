package net.mcreator.mudbackport.init;

import net.mcreator.mudbackport.MudBackportMod;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class MudBackportModPlacedFeatures {

    public static final Holder<PlacedFeature> TREES_ARAUCARIA = PlacementUtils.register("trees_araucaria", MudBackportModConfiguredFeatures.TREES_ARAUCARIA, treePlacement(PlacementUtils.countExtra(1, 0.1F, 1)));

}
