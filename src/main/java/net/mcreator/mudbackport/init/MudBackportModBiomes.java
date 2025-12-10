package net.mcreator.mudbackport.init;

import net.mcreator.mudbackport.MudBackportMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class MudBackportModBiomes
{
    public static final ResourceKey<Biome> ARAUCARIA_FOREST = register("araucaria_forest");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(MudBackportMod.MODID, name));
    }
}
