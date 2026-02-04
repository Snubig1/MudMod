package net.mcreator.mudbackport.world.biome;

import net.mcreator.mudbackport.init.MudBackportModBiomes;
import net.mcreator.mudbackport.init.MudBackportModBlocks;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.util.Random;

public class MudBackportModSurfaceRuleData
{
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource BLUE_TERRACOTTA = makeStateRule(Blocks.BLUE_TERRACOTTA);
    private static final SurfaceRules.RuleSource MUD_BLOCK = makeStateRule(MudBackportModBlocks.MUD.get());
    private static final SurfaceRules.RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);
    private static final SurfaceRules.RuleSource COARSE_DIRT = makeStateRule(Blocks.COARSE_DIRT);
    private static final SurfaceRules.RuleSource ROOTED_DIRT = makeStateRule(Blocks.ROOTED_DIRT);
    private static final SurfaceRules.RuleSource PODZOL = makeStateRule(Blocks.PODZOL);

    public static SurfaceRules.RuleSource makeRules()
    {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        //SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return SurfaceRules.sequence(
                //SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), BEDROCK),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(MudBackportModBiomes.ARAUCARIA_FOREST), SurfaceRules.ifTrue(SurfaceRules.yBlockCheck(VerticalAnchor.absolute(63),3),SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(1,1), SurfaceRules.sequence(
                        GRASS_BLOCK
                )))))
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }

    private static SurfaceRules.ConditionSource surfaceNoiseAbove(double p_194809_) {
        return SurfaceRules.noiseCondition(Noises.SURFACE, p_194809_ / 8.25D, Double.MAX_VALUE);
    }
    private static SurfaceRules.ConditionSource surfaceNoise2Above(double p_194809_) {
        return SurfaceRules.noiseCondition(Noises.SURFACE_SECONDARY, p_194809_ / 8.25D, Double.MAX_VALUE);
    }
    private static SurfaceRules.ConditionSource surfaceNoise3Above(double p_194809_) {
        return SurfaceRules.noiseCondition(Noises.PILLAR, p_194809_ / 8.25D, Double.MAX_VALUE);
    }
    private static SurfaceRules.ConditionSource surfaceNoise4Above(double p_194809_) {
        return SurfaceRules.noiseCondition(Noises.SPAGHETTI_2D_THICKNESS, p_194809_ / 8.25D, Double.MAX_VALUE);
    }
}
