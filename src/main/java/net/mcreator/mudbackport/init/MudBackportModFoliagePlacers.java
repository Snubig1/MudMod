package net.mcreator.mudbackport.init;

import net.mcreator.mudbackport.MudBackportMod;
import net.mcreator.mudbackport.world.feature.tree.Custom.AraucariaFoliagePlacer;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MudBackportModFoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACER_TYPES = DeferredRegister.create(Registry.FOLIAGE_PLACER_TYPE_REGISTRY, MudBackportMod.MODID);

    public static final RegistryObject<FoliagePlacerType<AraucariaFoliagePlacer>> ARAUCARIA_FOLIAGE_PLACER = FOLIAGE_PLACER_TYPES.register("araucaria_foliage_placer", () -> new FoliagePlacerType<>(AraucariaFoliagePlacer.CODEC));


    public static void register(IEventBus eventBus) {FOLIAGE_PLACER_TYPES.register(eventBus);}
}
