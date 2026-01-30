package net.mcreator.mudbackport.init;

import net.mcreator.mudbackport.MudBackportMod;
import net.mcreator.mudbackport.world.feature.tree.Custom.AraucariaFoliagePlacer;
import net.mcreator.mudbackport.world.feature.tree.Custom.AraucariaTrunkPlacer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.predicate.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.RandomSelectorFeature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BushFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Random;


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


    public static final RegistryObject<ConfiguredFeature<?, ?>> ARAUCARIA_BUSH =
            CONFIGURED_FEATURES.register("araucaria_bush", () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(Blocks.SPRUCE_LOG),
                    new StraightTrunkPlacer(1, 0, 0),
                    BlockStateProvider.simple(Blocks.BIRCH_LEAVES),
                    new BushFoliagePlacer(ConstantInt.of(2),ConstantInt.of(1),2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>> BRAMBLE_SMALL_FOLIAGE =
            CONFIGURED_FEATURES.register("bramble_small_foliage", () -> new ConfiguredFeature<>(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(Blocks.SWEET_BERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)),4)
                            .add(Blocks.FERN.defaultBlockState(),3)
                            .add(Blocks.LARGE_FERN.defaultBlockState(),3)
                            .add(Blocks.MOSS_CARPET.defaultBlockState(),2))
                    )));

    public static final RegistryObject<ConfiguredFeature<?, ?>> COVERING_SMALL_FOLIAGE =
            CONFIGURED_FEATURES.register("covering_small_foliage", () -> new ConfiguredFeature<>(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(Blocks.FERN.defaultBlockState(),8)
                            .add(Blocks.LARGE_FERN.defaultBlockState(),2)
                            .add(Blocks.GRASS.defaultBlockState(),1)
            ))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> BRAMBLE_FOLIAGE =
            CONFIGURED_FEATURES.register("bramble_foliage", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(
                    List.of(new WeightedPlacedFeature(PlacementUtils.inlinePlaced(BRAMBLE_SMALL_FOLIAGE.getHolder().orElseThrow()), 0.93F)),
                    PlacementUtils.inlinePlaced(ARAUCARIA_BUSH.getHolder().orElseThrow()))
            ));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ARAUCARIA_BRAMBLES =
            CONFIGURED_FEATURES.register("araucaria_bramples", () -> new ConfiguredFeature<>(Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(
                    BlockTags.DIRT,
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.MOSS_BLOCK.defaultBlockState(),2).add(Blocks.COARSE_DIRT.defaultBlockState(),4).add(Blocks.PODZOL.defaultBlockState(),4).add(MudBackportModBlocks.MUD.get().defaultBlockState(),4)),
                    PlacementUtils.inlinePlaced(BRAMBLE_FOLIAGE.getHolder().orElseThrow()),
                    CaveSurface.FLOOR,
                    ConstantInt.of(1),
                    0.0F,
                    5,
                    0.4F,
                    UniformInt.of(6, 9),
                    0.3F
            )));

    public static final RegistryObject<ConfiguredFeature<?, ?>> NO_OP =
            CONFIGURED_FEATURES.register("no_op", () -> new ConfiguredFeature<>(Feature.NO_OP, new NoneFeatureConfiguration()));


    public static final RegistryObject<ConfiguredFeature<?, ?>> ARAUCARIA_COVERING =
            CONFIGURED_FEATURES.register("araucaria_covering", () -> new ConfiguredFeature<>(Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(
                    MudBackportModTags.ARAUCARIA_GROUND_REPLACEABLE,
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.COARSE_DIRT.defaultBlockState(),7).add(Blocks.PODZOL.defaultBlockState(),5).add(MudBackportModBlocks.MUD.get().defaultBlockState(),3)),
                    PlacementUtils.inlinePlaced(COVERING_SMALL_FOLIAGE.getHolder().orElseThrow()),
                    CaveSurface.FLOOR,
                    ConstantInt.of(1),
                    0.0F,
                    32,
                    0.15F,
                    ConstantInt.of(32),
                    0.3F
            )));

    public static final RegistryObject<ConfiguredFeature<?, ?>> LILY_OF_THE_VALEY_PATCH =
            CONFIGURED_FEATURES.register("lily_of_the_valey_patch", () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(
                    64,
                    6,
                    2,
                    PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILY_OF_THE_VALLEY)
            )))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ARAUCARIA_TREE_BUSH =
            CONFIGURED_FEATURES.register("araucaria_tree_bush", () -> new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(Blocks.SPRUCE_LOG),
                    new StraightTrunkPlacer(2, 1, 0),
                    BlockStateProvider.simple(Blocks.SPRUCE_LEAVES),
                    new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(2, 3)),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build()));
}
