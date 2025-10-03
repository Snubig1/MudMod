
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mudbackport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.mudbackport.block.StrippedAraucariaWoodBlock;
import net.mcreator.mudbackport.block.StrippedAraucariaLogBlock;
import net.mcreator.mudbackport.block.RootsBlock;
import net.mcreator.mudbackport.block.ReinforcedGlassPanesBlock;
import net.mcreator.mudbackport.block.PackedMudBlock;
import net.mcreator.mudbackport.block.MuddyRootsBlock;
import net.mcreator.mudbackport.block.MudBricksBlock;
import net.mcreator.mudbackport.block.MudBrickWallBlock;
import net.mcreator.mudbackport.block.MudBrickStairsBlock;
import net.mcreator.mudbackport.block.MudBrickSlabBlock;
import net.mcreator.mudbackport.block.MudBlock;
import net.mcreator.mudbackport.block.InfoStandBlock;
import net.mcreator.mudbackport.block.GinkgoWoodBlock;
import net.mcreator.mudbackport.block.GinkgoStairsBlock;
import net.mcreator.mudbackport.block.GinkgoSlabBlock;
import net.mcreator.mudbackport.block.GinkgoPressurePlateBlock;
import net.mcreator.mudbackport.block.GinkgoPlanksBlock;
import net.mcreator.mudbackport.block.GinkgoLogBlock;
import net.mcreator.mudbackport.block.GinkgoLeavesBlock;
import net.mcreator.mudbackport.block.GinkgoFenceGateBlock;
import net.mcreator.mudbackport.block.GinkgoFenceBlock;
import net.mcreator.mudbackport.block.GinkgoButtonBlock;
import net.mcreator.mudbackport.block.AraucarianeedlesBlock;
import net.mcreator.mudbackport.block.AraucariaWoodBlock;
import net.mcreator.mudbackport.block.AraucariaTrapdoorBlock;
import net.mcreator.mudbackport.block.AraucariaStairsBlock;
import net.mcreator.mudbackport.block.AraucariaSlabBlock;
import net.mcreator.mudbackport.block.AraucariaPressurePlateBlock;
import net.mcreator.mudbackport.block.AraucariaPlanksBlock;
import net.mcreator.mudbackport.block.AraucariaLogBlock;
import net.mcreator.mudbackport.block.AraucariaLeavesBlock;
import net.mcreator.mudbackport.block.AraucariaFenceGateBlock;
import net.mcreator.mudbackport.block.AraucariaFenceBlock;
import net.mcreator.mudbackport.block.AraucariaDoorBlock;
import net.mcreator.mudbackport.block.AraucariaButtonBlock;
import net.mcreator.mudbackport.block.AraucariaBranchsBlock;
import net.mcreator.mudbackport.MudBackportMod;

public class MudBackportModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MudBackportMod.MODID);
	public static final RegistryObject<Block> PACKED_MUD = REGISTRY.register("packed_mud", () -> new PackedMudBlock());
	public static final RegistryObject<Block> MUD = REGISTRY.register("mud", () -> new MudBlock());
	public static final RegistryObject<Block> MUD_BRICKS = REGISTRY.register("mud_bricks", () -> new MudBricksBlock());
	public static final RegistryObject<Block> MUD_BRICK_SLAB = REGISTRY.register("mud_brick_slab", () -> new MudBrickSlabBlock());
	public static final RegistryObject<Block> MUD_BRICK_STAIRS = REGISTRY.register("mud_brick_stairs", () -> new MudBrickStairsBlock());
	public static final RegistryObject<Block> MUD_BRICK_WALL = REGISTRY.register("mud_brick_wall", () -> new MudBrickWallBlock());
	public static final RegistryObject<Block> ROOTS = REGISTRY.register("roots", () -> new RootsBlock());
	public static final RegistryObject<Block> MUDDY_ROOTS = REGISTRY.register("muddy_roots", () -> new MuddyRootsBlock());
	public static final RegistryObject<Block> REINFORCED_GLASS_PANES = REGISTRY.register("reinforced_glass_panes", () -> new ReinforcedGlassPanesBlock());
	public static final RegistryObject<Block> INFO_STAND = REGISTRY.register("info_stand", () -> new InfoStandBlock());
	public static final RegistryObject<Block> GINKGO_WOOD = REGISTRY.register("ginkgo_wood", () -> new GinkgoWoodBlock());
	public static final RegistryObject<Block> GINKGO_LOG = REGISTRY.register("ginkgo_log", () -> new GinkgoLogBlock());
	public static final RegistryObject<Block> GINKGO_PLANKS = REGISTRY.register("ginkgo_planks", () -> new GinkgoPlanksBlock());
	public static final RegistryObject<Block> GINKGO_LEAVES = REGISTRY.register("ginkgo_leaves", () -> new GinkgoLeavesBlock());
	public static final RegistryObject<Block> GINKGO_STAIRS = REGISTRY.register("ginkgo_stairs", () -> new GinkgoStairsBlock());
	public static final RegistryObject<Block> GINKGO_SLAB = REGISTRY.register("ginkgo_slab", () -> new GinkgoSlabBlock());
	public static final RegistryObject<Block> GINKGO_FENCE = REGISTRY.register("ginkgo_fence", () -> new GinkgoFenceBlock());
	public static final RegistryObject<Block> GINKGO_FENCE_GATE = REGISTRY.register("ginkgo_fence_gate", () -> new GinkgoFenceGateBlock());
	public static final RegistryObject<Block> GINKGO_PRESSURE_PLATE = REGISTRY.register("ginkgo_pressure_plate", () -> new GinkgoPressurePlateBlock());
	public static final RegistryObject<Block> GINKGO_BUTTON = REGISTRY.register("ginkgo_button", () -> new GinkgoButtonBlock());
	public static final RegistryObject<Block> ARAUCARIA_WOOD = REGISTRY.register("araucaria_wood", () -> new AraucariaWoodBlock());
	public static final RegistryObject<Block> ARAUCARIA_LOG = REGISTRY.register("araucaria_log", () -> new AraucariaLogBlock());
	public static final RegistryObject<Block> ARAUCARIA_PLANKS = REGISTRY.register("araucaria_planks", () -> new AraucariaPlanksBlock());
	public static final RegistryObject<Block> ARAUCARIA_LEAVES = REGISTRY.register("araucaria_leaves", () -> new AraucariaLeavesBlock());
	public static final RegistryObject<Block> ARAUCARIA_STAIRS = REGISTRY.register("araucaria_stairs", () -> new AraucariaStairsBlock());
	public static final RegistryObject<Block> ARAUCARIA_SLAB = REGISTRY.register("araucaria_slab", () -> new AraucariaSlabBlock());
	public static final RegistryObject<Block> ARAUCARIA_FENCE = REGISTRY.register("araucaria_fence", () -> new AraucariaFenceBlock());
	public static final RegistryObject<Block> ARAUCARIA_FENCE_GATE = REGISTRY.register("araucaria_fence_gate", () -> new AraucariaFenceGateBlock());
	public static final RegistryObject<Block> ARAUCARIA_PRESSURE_PLATE = REGISTRY.register("araucaria_pressure_plate", () -> new AraucariaPressurePlateBlock());
	public static final RegistryObject<Block> ARAUCARIA_BUTTON = REGISTRY.register("araucaria_button", () -> new AraucariaButtonBlock());
	public static final RegistryObject<Block> ARAUCARIA_NEEDLES = REGISTRY.register("araucaria_needles", () -> new AraucarianeedlesBlock());
	public static final RegistryObject<Block> ARAUCARIA_DOOR = REGISTRY.register("araucaria_door", () -> new AraucariaDoorBlock());
	public static final RegistryObject<Block> ARAUCARIA_TRAPDOOR = REGISTRY.register("araucaria_trapdoor", () -> new AraucariaTrapdoorBlock());
	public static final RegistryObject<Block> ARAUCARIA_BRANCHS = REGISTRY.register("araucaria_branchs", () -> new AraucariaBranchsBlock());
	public static final RegistryObject<Block> STRIPPED_ARAUCARIA_LOG = REGISTRY.register("stripped_araucaria_log", () -> new StrippedAraucariaLogBlock());
	public static final RegistryObject<Block> STRIPPED_ARAUCARIA_WOOD = REGISTRY.register("stripped_araucaria_wood", () -> new StrippedAraucariaWoodBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			MudBlock.registerRenderLayer();
			RootsBlock.registerRenderLayer();
			ReinforcedGlassPanesBlock.registerRenderLayer();
			InfoStandBlock.registerRenderLayer();
			AraucarianeedlesBlock.registerRenderLayer();
			AraucariaDoorBlock.registerRenderLayer();
			AraucariaTrapdoorBlock.registerRenderLayer();
			AraucariaBranchsBlock.registerRenderLayer();
		}
	}
}
