package com.iridium.mocknbtapi;

import org.bukkit.inventory.ItemStack;

public class FakeNBTApiFactory implements NBTApiFactory{
    @Override
    public NBTItem getNBTItem(ItemStack itemStack) {
        return FakeNBTItem.getFakeNBTItem(itemStack);
    }
}
