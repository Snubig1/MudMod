/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file, and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.mudbackport;

import net.mcreator.mudbackport.init.*;
import net.mcreator.mudbackport.world.biome.MudBackportModRegion;
import net.mcreator.mudbackport.world.biome.MudBackportModSurfaceRuleData;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod(MudBackportMod.MODID)
public class MudBackportMod {
	public static final Logger LOGGER = LogManager.getLogger(MudBackportMod.class);
	public static final String MODID = "mud_backport";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public MudBackportMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);

		MudBackportModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MudBackportModBlocks.REGISTRY.register(bus);

		MudBackportModItems.REGISTRY.register(bus);
        MudBackportModConfiguredFeatures.CONFIGURED_FEATURES.register(bus);
        MudBackportModPlacedFeatures.PLACED_FEATURES.register(bus);
		MudBackportModParticleTypes.REGISTRY.register(bus);
        MudBackportModTrunkPlacerTypes.TRUNK_PLACER_TYPES.register(bus);
        MudBackportModFoliagePlacers.FOLIAGE_PLACER_TYPES.register(bus);
	}

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() ->
        {
            // Given we only add two biomes, we should keep our weight relatively low.
            Regions.register(new MudBackportModRegion(new ResourceLocation(MODID, "overworld"), 10));

            // Register our surface rules
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MODID, MudBackportModSurfaceRuleData.makeRules());
        });
    }

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
