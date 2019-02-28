package com.sudo.meattools;

import com.sudo.meattools.init.ModItems;
import com.sudo.meattools.init.ModRecipes;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = com.sudo.meattools.MeatTools.NAME, version = com.sudo.meattools.MeatTools.VERSION)
public class MeatTools
{
    public static final String MODID = "meattools";
    public static final String NAME = "Meat Tools";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @Mod.Instance
    public static MeatTools instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.MODID + ":preInit");
        ModItems.init();
        ModRecipes.init();
        MinecraftForge.EVENT_BUS.register(new com.sudo.meattools.EventHandler());
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(Reference.MODID + ":init");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(Reference.MODID + ":postInit");
    }
}
