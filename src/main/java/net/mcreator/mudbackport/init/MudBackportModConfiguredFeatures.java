package net.mcreator.mudbackport.init;

import net.mcreator.mudbackport.MudBackportMod;
import net.mcreator.mudbackport.world.feature.tree.Custom.AraucariaFoliagePlacer;
import net.mcreator.mudbackport.world.feature.tree.Custom.AraucariaTrunkPlacer;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class MudBackportModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, MudBackportMod.MODID);
/*
    public static final Holder<ConfiguredFeature<?, ?>> ARAUCARIA_TREE =
            CONFIGURED_FEATURES.register("araucaria", () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(MudBackportModBlocks.ARAUCARIA_LOG.get()),
                    new AraucariaTrunkPlacer(13, 7, 6),
                    BlockStateProvider.simple(MudBackportModBlocks.ARAUCARIA_LEAVES.get()),
                    new AraucariaFoliagePlacer( ConstantInt.of(3), ConstantInt.of(3)),
                    new TwoLayersFeatureSize(10, 1, 1)).ignoreVines().build()));*/

    public static final RegistryObject<ConfiguredFeature<?, ?>> ARAUCARIA_TREE =
            CONFIGURED_FEATURES.register("araucaria", () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(MudBackportModBlocks.ARAUCARIA_LOG.get()),
                    new AraucariaTrunkPlacer(13, 7, 6),
                    BlockStateProvider.simple(MudBackportModBlocks.ARAUCARIA_LEAVES.get()),
                    new AraucariaFoliagePlacer( ConstantInt.of(3), ConstantInt.of(3)),
                    new TwoLayersFeatureSize(10, 1, 1)).ignoreVines().build()));

/*
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> TREES_ARAUCARIA =
            FeatureUtils.register("trees_araucaria", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(
                            List.of(new WeightedPlacedFeature(MudBackportModPlacedFeatures.ARAUCARIA_CHECKED, 0.5F)),
                            MudBackportModPlacedFeatures.ARAUCARIA_CHECKED));*/


}
