package com.iridium.mocknbtapi;

import org.bukkit.inventory.ItemStack;

public interface NBTApiFactory {
    NBTItem getNBTItem(ItemStack itemStack);
}
