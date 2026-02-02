package net.mcreator.mudbackport.init;


import net.mcreator.mudbackport.MudBackportMod;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.MiscOverworldFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class MudBackportModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MudBackportMod.MODID);


    public static final RegistryObject<PlacedFeature> TREES_ARAUCARIA_ARAUCARIA = PLACED_FEATURES.register("trees_araucaria_araucaria", () -> new PlacedFeature(
            MudBackportModConfiguredFeatures.ARAUCARIA_TREE.getHolder().orElseThrow(),
            List.of(PlacementUtils.countExtra(8, 0.1F, 1),
                    InSquarePlacement.spread(),
                    SurfaceWaterDepthFilter.forMaxDepth(0),
                    PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)),
                    BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> TREES_ARAUCARIA_PINE = PLACED_FEATURES.register("trees_araucaria_pine", () -> new PlacedFeature(
            MudBackportModConfiguredFeatures.ARAUCARIA_PINE_TREE.getHolder().orElseThrow(),
            List.of(PlacementUtils.countExtra(4, 0.25F, 5),
                    InSquarePlacement.spread(),
                    SurfaceWaterDepthFilter.forMaxDepth(0),
                    PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)),
                    BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> TREES_ARAUCARIA_SPRUCE = PLACED_FEATURES.register("trees_araucaria_spruce", () -> new PlacedFeature(
            MudBackportModConfiguredFeatures.ARAUCARIA_SPRUCE_TREE.getHolder().orElseThrow(),
            List.of(PlacementUtils.countExtra(2, 0.2F, 3),
                    InSquarePlacement.spread(),
                    SurfaceWaterDepthFilter.forMaxDepth(0),
                    PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)),
                    BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> ARAUCARIA_COVERING = PLACED_FEATURES.register("araucaria_covering", () -> new PlacedFeature(
            MudBackportModConfiguredFeatures.ARAUCARIA_COVERING.getHolder().orElseThrow(),
            List.of(CountPlacement.of(1),
                    InSquarePlacement.spread(),
                    SurfaceWaterDepthFilter.forMaxDepth(0),
                    PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> ARAUCARIA_BRAMBLES = PLACED_FEATURES.register("araucaria_brambles", () -> new PlacedFeature(
            MudBackportModConfiguredFeatures.ARAUCARIA_BRAMBLES.getHolder().orElseThrow(),
            List.of(
                    RarityFilter.onAverageOnceEvery(6),
                    InSquarePlacement.spread(),
                    SurfaceWaterDepthFilter.forMaxDepth(0),
                    PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> TREES_ARAUCARIA_TREE_BUSH = PLACED_FEATURES.register("trees_araucaria_tree_bush", () -> new PlacedFeature(
            MudBackportModConfiguredFeatures.ARAUCARIA_TREE_BUSH.getHolder().orElseThrow(),
            List.of(PlacementUtils.countExtra(10, 0.1F, 5),
                    InSquarePlacement.spread(),
                    SurfaceWaterDepthFilter.forMaxDepth(0),
                    PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)),
                    BiomeFilter.biome())));

    //public static final RegistryObject<PlacedFeature> LILY_OF_THE_VALEY_PATCH = PLACED_FEATURES.register("lily_of_the_valey_patch", () -> PlacementUtils.inlinePlaced(MudBackportModConfiguredFeatures.LILY_OF_THE_VALEY_PATCH.getHolder().orElseThrow()).value());

    public static final RegistryObject<PlacedFeature> LILY_OF_THE_VALEY_PATCH = PLACED_FEATURES.register("lily_of_the_valey_patch", () -> new PlacedFeature(
            MudBackportModConfiguredFeatures.LILY_OF_THE_VALEY_PATCH.getHolder().orElseThrow(),
            List.of(
                    RarityFilter.onAverageOnceEvery(6),
                    InSquarePlacement.spread(),
                    SurfaceWaterDepthFilter.forMaxDepth(0),
                    PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BiomeFilter.biome())));

}
