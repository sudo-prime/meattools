package com.sudo.meattools.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        // PICKAXES
        GameRegistry.addSmelting(ModItems.rawBeefPickaxe, new ItemStack(ModItems.cookedBeefPickaxe, 1), 1.05f);
        GameRegistry.addSmelting(ModItems.cookedBeefPickaxe, new ItemStack(ModItems.burntPickaxe, 1), 0.5f);
        GameRegistry.addSmelting(ModItems.rawPorkPickaxe, new ItemStack(ModItems.cookedPorkPickaxe, 1), 1.05f);
        GameRegistry.addSmelting(ModItems.cookedPorkPickaxe, new ItemStack(ModItems.burntPickaxe, 1), 0.5f);
        GameRegistry.addSmelting(ModItems.rawChickenPickaxe, new ItemStack(ModItems.cookedChickenPickaxe, 1), 1.05f);
        GameRegistry.addSmelting(ModItems.cookedChickenPickaxe, new ItemStack(ModItems.burntPickaxe, 1), 0.5f);

        // SHOVELS
        GameRegistry.addSmelting(ModItems.rawBeefShovel, new ItemStack(ModItems.cookedBeefShovel, 1), 1.05f);
        GameRegistry.addSmelting(ModItems.cookedBeefShovel, new ItemStack(ModItems.burntShovel, 1), 0.5f);
        GameRegistry.addSmelting(ModItems.rawPorkShovel, new ItemStack(ModItems.cookedPorkShovel, 1), 1.05f);
        GameRegistry.addSmelting(ModItems.cookedPorkShovel, new ItemStack(ModItems.burntShovel, 1), 0.5f);
        GameRegistry.addSmelting(ModItems.rawChickenShovel, new ItemStack(ModItems.cookedChickenShovel, 1), 1.05f);
        GameRegistry.addSmelting(ModItems.cookedChickenShovel, new ItemStack(ModItems.burntShovel, 1), 0.5f);
    }
}
