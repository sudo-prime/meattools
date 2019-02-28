package com.sudo.meattools;

import com.sudo.meattools.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {
    @SubscribeEvent
    public void harvestDropsEvent(BlockEvent.HarvestDropsEvent event) {
        if (event.getState().getBlock() == Blocks.SAND
            && !event.getHarvester().getHeldItemMainhand().isEmpty()
            && event.getHarvester().getHeldItemMainhand().getItem() == ModItems.burntShovel)
        {
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(Blocks.GLASS, 1));
        }
    }
}
