
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mudbackport.init;

import net.mcreator.mudbackport.block.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.mudbackport.MudBackportMod;

public class MudBackportModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MudBackportMod.MODID);
	public static final RegistryObject<Block> PACKED_MUD = REGISTRY.register("packed_mud", PackedMudBlock::new);
	public static final RegistryObject<Block> MUD = REGISTRY.register("mud", MudBlock::new);
	public static final RegistryObject<Block> MUD_BRICKS = REGISTRY.register("mud_bricks", MudBricksBlock::new);
	public static final RegistryObject<Block> MUD_BRICK_SLAB = REGISTRY.register("mud_brick_slab", MudBrickSlabBlock::new);
	public static final RegistryObject<Block> MUD_BRICK_STAIRS = REGISTRY.register("mud_brick_stairs", MudBrickStairsBlock::new);
	public static final RegistryObject<Block> MUD_BRICK_WALL = REGISTRY.register("mud_brick_wall", MudBrickWallBlock::new);
	public static final RegistryObject<Block> ROOTS = REGISTRY.register("roots", RootsBlock::new);
	public static final RegistryObject<Block> MUDDY_ROOTS = REGISTRY.register("muddy_roots", MuddyRootsBlock::new);
	public static final RegistryObject<Block> REINFORCED_GLASS_PANES = REGISTRY.register("reinforced_glass_panes", ReinforcedGlassPanesBlock::new);
	public static final RegistryObject<Block> INFO_STAND = REGISTRY.register("info_stand", InfoStandBlock::new);
	public static final RegistryObject<Block> GINKGO_WOOD = REGISTRY.register("ginkgo_wood", GinkgoWoodBlock::new);
	public static final RegistryObject<Block> GINKGO_LOG = REGISTRY.register("ginkgo_log", GinkgoLogBlock::new);
	public static final RegistryObject<Block> GINKGO_PLANKS = REGISTRY.register("ginkgo_planks", GinkgoPlanksBlock::new);
	public static final RegistryObject<Block> GINKGO_LEAVES = REGISTRY.register("ginkgo_leaves", GinkgoLeavesBlock::new);
	public static final RegistryObject<Block> GINKGO_STAIRS = REGISTRY.register("ginkgo_stairs", GinkgoStairsBlock::new);
	public static final RegistryObject<Block> GINKGO_SLAB = REGISTRY.register("ginkgo_slab", GinkgoSlabBlock::new);
	public static final RegistryObject<Block> GINKGO_FENCE = REGISTRY.register("ginkgo_fence", GinkgoFenceBlock::new);
	public static final RegistryObject<Block> GINKGO_FENCE_GATE = REGISTRY.register("ginkgo_fence_gate", GinkgoFenceGateBlock::new);
	public static final RegistryObject<Block> GINKGO_PRESSURE_PLATE = REGISTRY.register("ginkgo_pressure_plate", GinkgoPressurePlateBlock::new);
	public static final RegistryObject<Block> GINKGO_BUTTON = REGISTRY.register("ginkgo_button", GinkgoButtonBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_WOOD = REGISTRY.register("araucaria_wood", AraucariaWoodBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_LOG = REGISTRY.register("araucaria_log", AraucariaLogBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_PLANKS = REGISTRY.register("araucaria_planks", AraucariaPlanksBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_LEAVES = REGISTRY.register("araucaria_leaves", AraucariaLeavesBlock::new);
    public static final RegistryObject<Block> PINE_LEAVES = REGISTRY.register("pine_leaves", PineLeavesBlock::new);
    public static final RegistryObject<Block> ARAUCARIA_SAPLING = REGISTRY.register("araucaria_sapling", AraucariaSaplingBlock::new);
    public static final RegistryObject<Block> PINE_SAPLING = REGISTRY.register("pine_sapling", PineSaplingBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_STAIRS = REGISTRY.register("araucaria_stairs", AraucariaStairsBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_SLAB = REGISTRY.register("araucaria_slab", AraucariaSlabBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_FENCE = REGISTRY.register("araucaria_fence", AraucariaFenceBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_FENCE_GATE = REGISTRY.register("araucaria_fence_gate", AraucariaFenceGateBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_PRESSURE_PLATE = REGISTRY.register("araucaria_pressure_plate", AraucariaPressurePlateBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_BUTTON = REGISTRY.register("araucaria_button", AraucariaButtonBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_NEEDLES = REGISTRY.register("araucaria_needles", AraucariaNeedlesBlock::new);
    public static final RegistryObject<Block> SNOWY_ARAUCARIA_NEEDLES = REGISTRY.register("snowy_araucaria_needles", SnowyAraucariaNeedlesBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_DOOR = REGISTRY.register("araucaria_door", AraucariaDoorBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_TRAPDOOR = REGISTRY.register("araucaria_trapdoor", AraucariaTrapdoorBlock::new);
	public static final RegistryObject<Block> ARAUCARIA_BRANCHES = REGISTRY.register("araucaria_branches", AraucariaBranchesBlock::new);;
	public static final RegistryObject<Block> STRIPPED_ARAUCARIA_LOG = REGISTRY.register("stripped_araucaria_log", StrippedAraucariaLogBlock::new);
	public static final RegistryObject<Block> STRIPPED_ARAUCARIA_WOOD = REGISTRY.register("stripped_araucaria_wood", StrippedAraucariaWoodBlock::new);

    //public static final RegistryObject<Block> STRIPPED_ARAUCARIA_WOOD = REGISTRY.register("stripped_araucaria_wood", () -> new StrippedAraucariaWoodBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
            AraucariaSaplingBlock.registerRenderLayer();
            PineSaplingBlock.registerRenderLayer();
			RootsBlock.registerRenderLayer();
			ReinforcedGlassPanesBlock.registerRenderLayer();
			InfoStandBlock.registerRenderLayer();
			AraucariaNeedlesBlock.registerRenderLayer();
            SnowyAraucariaNeedlesBlock.registerRenderLayer();
			AraucariaDoorBlock.registerRenderLayer();
			AraucariaTrapdoorBlock.registerRenderLayer();
			AraucariaBranchesBlock.registerRenderLayer();
		}
	}
}
