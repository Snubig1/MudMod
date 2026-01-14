package net.mcreator.mudbackport.init;


import net.mcreator.mudbackport.MudBackportMod;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class MudBackportModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MudBackportMod.MODID);

/*
    public static final Holder<PlacedFeature> ARAUCARIA_CHECKED = PlacementUtils.register("araucaraia_checked", MudBackportModConfiguredFeatures.ARAUCARIA_TREE, PlacementUtils.filteredByBlockSurvival(MudBackportModBlocks.ARAUCARIA_SAPLING.get()));

    public static final Holder<PlacedFeature> TREES_ARAUCARIA_FOREST = PlacementUtils.register("trees_araucaraia_forest",
            MudBackportModConfiguredFeatures.TREES_ARAUCARIA, treePlacement(
                    PlacementUtils.countExtra(10, 0.1F, 1)));*/

    public static final RegistryObject<PlacedFeature> TREES_ARAUCARIA_ARAUCARIA = PLACED_FEATURES.register("trees_araucaria_araucaria", () -> new PlacedFeature(
            MudBackportModConfiguredFeatures.ARAUCARIA_TREE.getHolder().orElseThrow(),
            List.of(PlacementUtils.countExtra(8, 0.1F, 1),
                    InSquarePlacement.spread(),
                    SurfaceWaterDepthFilter.forMaxDepth(0),
                    PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)),
                    BiomeFilter.biome())));




}
