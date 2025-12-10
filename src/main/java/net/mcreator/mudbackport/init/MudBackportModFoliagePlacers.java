package net.mcreator.mudbackport.init;

import net.mcreator.mudbackport.MudBackportMod;
import net.mcreator.mudbackport.world.feature.tree.Custom.AraucariaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MudBackportModFoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACER_TYPES = DeferredRegister.create(ForgeRegistries.FOLIAGE_PLACER_TYPES, MudBackportMod.MODID);

    public static final RegistryObject<FoliagePlacerType<AraucariaFoliagePlacer>> ARAUCARIA_FOLIAGE_PLACER = FOLIAGE_PLACER_TYPES.register("araucaria_foliage_placer", () -> new FoliagePlacerType<>(AraucariaFoliagePlacer.CODEC));
}
