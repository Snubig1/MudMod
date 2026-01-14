package net.mcreator.mudbackport.world.biome;

import com.mojang.datafixers.util.Pair;
import net.mcreator.mudbackport.init.MudBackportModBiomes;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.List;
import java.util.function.Consumer;

import static terrablender.api.ParameterUtils.*;

public class MudBackportModRegion extends Region
{
    public MudBackportModRegion(ResourceLocation name, int weight)
    {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
            List<Climate.ParameterPoint> araucariaMountainside = new ParameterPointListBuilder()
                    .temperature(Temperature.NEUTRAL, Temperature.COOL)
                    .humidity(Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_1, Erosion.EROSION_2, Erosion.EROSION_3, Erosion.EROSION_4)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.MID_SLICE_NORMAL_ASCENDING,Weirdness.HIGH_SLICE_NORMAL_ASCENDING, Weirdness.PEAK_NORMAL,Weirdness.HIGH_SLICE_NORMAL_DESCENDING,Weirdness.MID_SLICE_NORMAL_DESCENDING,Weirdness.LOW_SLICE_NORMAL_DESCENDING,Weirdness.VALLEY,Weirdness.LOW_SLICE_VARIANT_ASCENDING,Weirdness.MID_SLICE_VARIANT_ASCENDING,Weirdness.HIGH_SLICE_VARIANT_ASCENDING,Weirdness.PEAK_VARIANT,Weirdness.HIGH_SLICE_VARIANT_DESCENDING,Weirdness.MID_SLICE_VARIANT_DESCENDING)
                    .build();

            List<Climate.ParameterPoint> araucariaFlat = new ParameterPointListBuilder()
                    .temperature(Temperature.NEUTRAL, Temperature.COOL)
                    .humidity(Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_3, Erosion.EROSION_4, Erosion.EROSION_5, Erosion.EROSION_6)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.MID_SLICE_NORMAL_ASCENDING,Weirdness.HIGH_SLICE_NORMAL_ASCENDING, Weirdness.PEAK_NORMAL,Weirdness.HIGH_SLICE_NORMAL_DESCENDING,Weirdness.MID_SLICE_NORMAL_DESCENDING,Weirdness.LOW_SLICE_NORMAL_DESCENDING,Weirdness.VALLEY,Weirdness.LOW_SLICE_VARIANT_ASCENDING,Weirdness.MID_SLICE_VARIANT_ASCENDING,Weirdness.HIGH_SLICE_VARIANT_ASCENDING,Weirdness.PEAK_VARIANT,Weirdness.HIGH_SLICE_VARIANT_DESCENDING,Weirdness.MID_SLICE_VARIANT_DESCENDING)
                    .build();


            List<Climate.ParameterPoint> frozenPeaksPoints = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY, Temperature.COOL, Temperature.NEUTRAL)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.COAST, Continentalness.FAR_INLAND), Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_0, Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.PEAK_VARIANT, Weirdness.HIGH_SLICE_VARIANT_DESCENDING)
                    .build();

            //frozenPeaksPoints.forEach(point -> builder.replaceBiome(point, MudBackportModBiomes.ARAUCARIA_FOREST));
            araucariaMountainside.forEach(point -> builder.replaceBiome(point, MudBackportModBiomes.ARAUCARIA_FOREST));
            araucariaFlat.forEach(point -> builder.replaceBiome(point, MudBackportModBiomes.ARAUCARIA_FOREST));
        });
    }
}
