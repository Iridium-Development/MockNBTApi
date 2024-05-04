package com.iridium.mocknbtapi;

import org.bukkit.inventory.ItemStack;

public class RealNBTApiFactory implements NBTApiFactory{
    @Override
    public NBTItem getNBTItem(ItemStack itemStack) {
        return new RealNBTItem(itemStack);
    }
}
