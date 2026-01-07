package net.mcreator.mudbackport.init;

import net.mcreator.mudbackport.world.feature.tree.Custom.AraucariaFoliagePlacer;
import net.mcreator.mudbackport.world.feature.tree.Custom.AraucariaTrunkPlacer;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.List;

public class MudBackportModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ARAUCARIA_TREE =
            FeatureUtils.register("araucaria", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(MudBackportModBlocks.ARAUCARIA_LOG.get()),
                    new AraucariaTrunkPlacer(13, 7, 6),
                    BlockStateProvider.simple(MudBackportModBlocks.ARAUCARIA_LEAVES.get()),
                    new AraucariaFoliagePlacer( ConstantInt.of(3), ConstantInt.of(3)),
                    new TwoLayersFeatureSize(10, 1, 1)).build());

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> TREES_ARAUCARIA = FeatureUtils.register("trees_araucaria", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(TreePlacements.PINE_CHECKED, 0.33333334F)), TreePlacements.SPRUCE_CHECKED));



}
