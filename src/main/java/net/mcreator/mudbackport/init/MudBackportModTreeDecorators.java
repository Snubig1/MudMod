package net.mcreator.mudbackport.init;

import net.mcreator.mudbackport.MudBackportMod;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MudBackportModTreeDecorators {

    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATOR_TYPES = DeferredRegister.create(ForgeRegistries.TREE_DECORATOR_TYPES, MudBackportMod.MODID);

    //public static final RegistryObject<TreeDecoratorType<AttachedToLeavesDecorator>> ATTACHED_TO_LEAVES = TREE_DECORATOR_TYPES.register("attached_to_leaves_decorator", () -> new TreeDecoratorType<>(AttachedToLeavesDecorator.CODEC));

}
