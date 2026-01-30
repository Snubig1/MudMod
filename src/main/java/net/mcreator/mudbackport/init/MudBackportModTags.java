package net.mcreator.mudbackport.init;

import net.mcreator.mudbackport.MudBackportMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MudBackportModTags {
    public static final TagKey<Block> ARAUCARIA_GROUND_REPLACEABLE = tag("araucaria_ground_replaceable");

    private static TagKey<Block> tag(String p_203847_) {
        return BlockTags.create(new ResourceLocation(MudBackportMod.MODID,p_203847_));
    }
}

