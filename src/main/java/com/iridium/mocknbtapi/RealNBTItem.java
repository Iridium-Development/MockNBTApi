package com.iridium.mocknbtapi;

import org.bukkit.inventory.ItemStack;

public class RealNBTItem implements NBTItem{

    private de.tr7zw.changeme.nbtapi.NBTItem nbtItem;

    public RealNBTItem(ItemStack itemStack){
        nbtItem = new de.tr7zw.changeme.nbtapi.NBTItem(itemStack);
    }

    @Override
    public void setString(String key, String value) {
        nbtItem.setString(key, value);
    }

    @Override
    public void setInteger(String key, int value) {
        nbtItem.setInteger(key, value);
    }

    @Override
    public void setDouble(String key, double value) {
        nbtItem.setDouble(key, value);
    }

    @Override
    public void setBoolean(String key, boolean value) {
        nbtItem.setBoolean(key, value);
    }

    @Override
    public String getString(String key) {
        return nbtItem.getString(key);
    }

    @Override
    public int getInteger(String key) {
        return nbtItem.getInteger(key);
    }

    @Override
    public double getDouble(String key) {
        return nbtItem.getDouble(key);
    }

    @Override
    public boolean getBoolean(String key) {
        return nbtItem.getBoolean(key);
    }
}
