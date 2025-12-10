package net.mcreator.mudbackport.init;


import net.mcreator.mudbackport.world.feature.tree.Custom.AraucariaTrunkPlacer;
import net.minecraft.core.Registry;
import net.mcreator.mudbackport.MudBackportMod;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MudBackportModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER_TYPES = DeferredRegister.create(Registry.TRUNK_PLACER_TYPE_REGISTRY, MudBackportMod.MODID);

    public static final RegistryObject<TrunkPlacerType<AraucariaTrunkPlacer>> ARAUCARIA_TRUNK_PLACER = TRUNK_PLACER_TYPES.register("araucaria_trunk_placer", () -> new TrunkPlacerType<>(AraucariaTrunkPlacer.CODEC));


    public static void register(IEventBus eventBus) {TRUNK_PLACER_TYPES.register(eventBus);}
}