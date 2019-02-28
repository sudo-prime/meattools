package com.sudo.meattools.init;

import com.sudo.meattools.Reference;
import com.sudo.meattools.items.EdiblePickaxe;
import com.sudo.meattools.items.EdibleShovel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModItems {
    // BASE STATS
    private static final int RAW_DURABILITY = 350;
    private static final float RAW_SPEED = 1F;
    private static final int RAW_HARVEST_LEVEL = 0;

    private static final int COOKED_DURABILITY = 100;
    private static final float COOKED_SPEED = 2F;
    private static final int COOKED_HARVEST_LEVEL = 2;

    private static final float BURNT_SPEED = 1F;
    private static final int BURNT_HARVEST_LEVEL = 4;

    private static final int RAW_BEEF_HUNGER = 5;
    private static final float RAW_BEEF_SATURATION = 0.3f;
    private static final int COOKED_BEEF_HUNGER = 8;
    private static final float COOKED_BEEF_SATURATION = 8F;

    private static final int RAW_PORK_HUNGER = 5;
    private static final float RAW_PORK_SATURATION = 0.3f;
    private static final int COOKED_PORK_HUNGER = 8;
    private static final float COOKED_PORK_SATURATION = 8F;

    private static final int RAW_CHICKEN_HUNGER = 5;
    private static final float RAW_CHICKEN_SATURATION = 0.3f;
    private static final int COOKED_CHICKEN_HUNGER = 8;
    private static final float COOKED_CHICKEN_SATURATION = 8F;
    private static final int BURNT_HUNGER = 1;
    private static final float BURNT_SATURATION = 0.1F;

    // PICKAXES
    public static Item rawBeefPickaxe;
    public static Item cookedBeefPickaxe;
    public static Item rawPorkPickaxe;
    public static Item cookedPorkPickaxe;
    public static Item rawChickenPickaxe;
    public static Item cookedChickenPickaxe;
    public static Item burntPickaxe;
    // SHOVELS
    public static Item rawBeefShovel;
    public static Item cookedBeefShovel;
    public static Item rawPorkShovel;
    public static Item cookedPorkShovel;
    public static Item rawChickenShovel;
    public static Item cookedChickenShovel;
    public static Item burntShovel;
    // AXES
    public static Item rawBeefAxe;
    public static Item cookedBeefAxe;
    public static Item rawPorkAxe;
    public static Item cookedPorkAxe;
    public static Item rawChickenAxe;
    public static Item cookedChickenAxe;
    public static Item burntAxe;
    // SWORDS
    public static Item rawBeefSword;
    public static Item cookedBeefSword;
    public static Item rawPorkSword;
    public static Item cookedPorkSword;
    public static Item rawChickenSword;
    public static Item cookedChickenSword;
    public static Item burntSword;

    public static void init() {
        // PICKAXES
        rawBeefPickaxe = new EdiblePickaxe("rawbeefpickaxe", RAW_BEEF_HUNGER, RAW_BEEF_SATURATION, true, "raw", RAW_HARVEST_LEVEL, RAW_DURABILITY, RAW_SPEED).setCreativeTab(CreativeTabs.FOOD);
        cookedBeefPickaxe = new EdiblePickaxe("cookedbeefpickaxe", COOKED_BEEF_HUNGER, COOKED_BEEF_SATURATION, true, "cooked", COOKED_HARVEST_LEVEL, COOKED_DURABILITY, COOKED_SPEED).setCreativeTab(CreativeTabs.FOOD);
        rawPorkPickaxe = new EdiblePickaxe("rawporkpickaxe", RAW_PORK_HUNGER, RAW_PORK_SATURATION, true, "raw", RAW_HARVEST_LEVEL, RAW_DURABILITY, RAW_SPEED).setCreativeTab(CreativeTabs.FOOD);
        cookedPorkPickaxe = new EdiblePickaxe("cookedporkpickaxe", COOKED_PORK_HUNGER, COOKED_PORK_SATURATION, true, "cooked", COOKED_HARVEST_LEVEL, COOKED_DURABILITY, COOKED_SPEED).setCreativeTab(CreativeTabs.FOOD);
        rawChickenPickaxe = new EdiblePickaxe("rawchickenpickaxe", RAW_CHICKEN_HUNGER, RAW_CHICKEN_SATURATION, true, "raw", RAW_HARVEST_LEVEL, RAW_DURABILITY, RAW_SPEED).setCreativeTab(CreativeTabs.FOOD);
        cookedChickenPickaxe = new EdiblePickaxe("cookedchickenpickaxe", COOKED_CHICKEN_HUNGER, COOKED_CHICKEN_SATURATION, true, "cooked", COOKED_HARVEST_LEVEL, COOKED_DURABILITY, COOKED_SPEED).setCreativeTab(CreativeTabs.FOOD);
        burntPickaxe = new EdiblePickaxe("burntpickaxe", BURNT_HUNGER, BURNT_SATURATION, false, "burnt", BURNT_HARVEST_LEVEL, 8, BURNT_SPEED).setCreativeTab(CreativeTabs.FOOD);
        
        // SHOVELS
        rawBeefShovel = new EdibleShovel("rawbeefshovel", RAW_BEEF_HUNGER, RAW_BEEF_SATURATION, true, "raw", RAW_DURABILITY, RAW_SPEED).setCreativeTab(CreativeTabs.FOOD);
        cookedBeefShovel = new EdibleShovel("cookedbeefshovel", COOKED_BEEF_HUNGER, COOKED_BEEF_SATURATION, true, "cooked", COOKED_DURABILITY, COOKED_SPEED).setCreativeTab(CreativeTabs.FOOD);
        rawPorkShovel = new EdibleShovel("rawporkshovel", RAW_PORK_HUNGER, RAW_PORK_SATURATION, true, "raw", RAW_DURABILITY, RAW_SPEED).setCreativeTab(CreativeTabs.FOOD);
        cookedPorkShovel = new EdibleShovel("cookedporkshovel", COOKED_PORK_HUNGER, COOKED_PORK_SATURATION, true, "cooked", COOKED_DURABILITY, COOKED_SPEED).setCreativeTab(CreativeTabs.FOOD);
        rawChickenShovel = new EdibleShovel("rawchickenshovel", RAW_CHICKEN_HUNGER, RAW_CHICKEN_SATURATION, true, "raw", RAW_DURABILITY, RAW_SPEED).setCreativeTab(CreativeTabs.FOOD);
        cookedChickenShovel = new EdibleShovel("cookedchickenshovel", COOKED_CHICKEN_HUNGER, COOKED_CHICKEN_SATURATION, true, "cooked", COOKED_DURABILITY, COOKED_SPEED).setCreativeTab(CreativeTabs.FOOD);
        burntShovel = new EdibleShovel("burntshovel", BURNT_HUNGER, BURNT_SATURATION, false, "burnt", 96, BURNT_SPEED).setCreativeTab(CreativeTabs.FOOD);
//
//        // AXES
//        rawBeefAxe = new EdibleAxe("rawbeefaxe", 5, 0.3f, true, "raw", 0, RAW_DURABILITY, RAW_SPEED)
//            .setCreativeTab(CreativeTabs.FOOD);
//        cookedBeefAxe = new EdibleAxe("cookedbeefaxe", 8, 0.8f, true, "cooked", 2, COOKED_DURABILITY, COOKED_SPEED)
//            .setCreativeTab(CreativeTabs.FOOD);
//        rawPorkAxe = new EdibleAxe("rawporkaxe", 5, 0.3f, true, "raw", 0, RAW_DURABILITY, RAW_SPEED)
//            .setCreativeTab(CreativeTabs.FOOD);
//        cookedPorkAxe = new EdibleAxe("cookedporkaxe", 8, 0.8f, true, "cooked", 2, COOKED_DURABILITY, COOKED_SPEEDv)
//            .setCreativeTab(CreativeTabs.FOOD);
//        rawChickenAxe = new EdibleAxe("rawchickenaxe", 5, 0.3f, true, "raw", 0, RAW_DURABILITY, RAW_SPEED)
//            .setCreativeTab(CreativeTabs.FOOD);
//        cookedChickenAxe = new EdibleAxe("cookedchickenaxe", 8, 0.8f, true, "cooked", 2, COOKED_DURABILITY, COOKED_SPEED)
//            .setCreativeTab(CreativeTabs.FOOD);
//        burntAxe = new EdibleAxe("burntaxe", 1, 0.1f, false, "burnt", 4, BURNT_DURABILITY, BURNT_SPEED);
//
//        // SWORDS
//        rawBeefSword = new EdibleSword("rawbeefsword", 5, 0.3f, true, "raw", 0, RAW_DURABILITY, RAW_SPEED)
//            .setCreativeTab(CreativeTabs.FOOD);
//        cookedBeefSword = new EdibleSword("cookedbeefsword", 8, 0.8f, true, "cooked", 2, COOKED_DURABILITY, COOKED_SPEED)
//            .setCreativeTab(CreativeTabs.FOOD);
//        rawPorkSword = new EdibleSword("rawporksword", 5, 0.3f, true, "raw", 0, RAW_DURABILITY, RAW_SPEED)
//            .setCreativeTab(CreativeTabs.FOOD);
//        cookedPorkSword = new EdibleSword("cookedporksword", 8, 0.8f, true, "cooked", 2, COOKED_DURABILITY, COOKED_SPEED)
//            .setCreativeTab(CreativeTabs.FOOD);
//        rawChickenSword = new EdibleSword("rawchickensword", 5, 0.3f, true, "raw", 0, RAW_DURABILITY, RAW_SPEED)
//            .setCreativeTab(CreativeTabs.FOOD);
//        cookedChickenSword = new EdibleSword("cookedchickensword", 8, 0.8f, true, "cooked", 2, COOKED_DURABILITY, COOKED_SPEED)
//            .setCreativeTab(CreativeTabs.FOOD);
//        burntSword = new EdibleSword("burntsword", 1, 0.1f, false, "burnt", 4, BURNT_DURABILITY, BURNT_SPEED);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            rawBeefPickaxe, cookedBeefPickaxe, 
            rawPorkPickaxe, cookedPorkPickaxe,
            rawChickenPickaxe, cookedChickenPickaxe,
            burntPickaxe);
        event.getRegistry().registerAll(
            rawBeefShovel, cookedBeefShovel,
            rawPorkShovel, cookedPorkShovel,
            rawChickenShovel, cookedChickenShovel,
            burntShovel);
//        event.getRegistry().registerAll(
//            rawBeefAxe, cookedBeefAxe,
//            rawPorkAxe, cookedPorkAxe,
//            rawChickenAxe, cookedChickenAxe,
//            burntAxe);
//        event.getRegistry().registerAll(
//            rawBeefSword, cookedBeefSword,
//            rawPorkSword, cookedPorkSword,
//            rawChickenSword, cookedChickenSword,
//            burntSword);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(rawBeefPickaxe);
        registerRender(cookedBeefPickaxe);
        registerRender(rawPorkPickaxe);
        registerRender(cookedPorkPickaxe);
        registerRender(rawChickenPickaxe);
        registerRender(cookedChickenPickaxe);
        registerRender(burntPickaxe);

        registerRender(rawBeefShovel);
        registerRender(cookedBeefShovel);
        registerRender(rawPorkShovel);
        registerRender(cookedPorkShovel);
        registerRender(rawChickenShovel);
        registerRender(cookedChickenShovel);
        registerRender(burntShovel);

//        registerRender(rawBeefAxe);
//        registerRender(cookedBeefAxe);
//        registerRender(rawPorkAxe);
//        registerRender(cookedPorkAxe);
//        registerRender(rawChickenAxe);
//        registerRender(cookedChickenAxe);
//        registerRender(burntAxe);
//
//        registerRender(rawBeefSword);
//        registerRender(cookedBeefSword);
//        registerRender(rawPorkSword);
//        registerRender(cookedPorkSword);
//        registerRender(rawChickenSword);
//        registerRender(cookedChickenSword);
//        registerRender(burntSword);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
