package net.mcreator.mudbackport.init;

import net.mcreator.mudbackport.MudBackportMod;
import net.mcreator.mudbackport.world.feature.tree.Custom.AraucariaFoliagePlacer;
import net.mcreator.mudbackport.world.feature.tree.Custom.AraucariaTrunkPlacer;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class MudBackportModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, MudBackportMod.MODID);


    public static final RegistryObject<ConfiguredFeature<?, ?>> ARAUCARIA_TREE =
            CONFIGURED_FEATURES.register("araucaria", () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(MudBackportModBlocks.ARAUCARIA_LOG.get()),
                    new AraucariaTrunkPlacer(13, 7, 6),
                    BlockStateProvider.simple(MudBackportModBlocks.ARAUCARIA_LEAVES.get()),
                    new AraucariaFoliagePlacer( ConstantInt.of(3), ConstantInt.of(3)),
                    new TwoLayersFeatureSize(10, 1, 1)).ignoreVines().build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ARAUCARIA_PINE_TREE =
            CONFIGURED_FEATURES.register("araucaria_pine", () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(Blocks.SPRUCE_LOG),
                    new StraightTrunkPlacer(6, 4, 0),
                    BlockStateProvider.simple(MudBackportModBlocks.PINE_LEAVES.get()),
                    new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(3, 4)),
                    new TwoLayersFeatureSize(2, 0, 2)).ignoreVines().build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ARAUCARIA_SPRUCE_TREE =
            CONFIGURED_FEATURES.register("araucaria_spruce", () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(Blocks.SPRUCE_LOG),
                    new StraightTrunkPlacer(5, 2, 1),
                    BlockStateProvider.simple(Blocks.SPRUCE_LEAVES),
                    new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
                    new TwoLayersFeatureSize(2, 0, 2)).ignoreVines().build()));


}
