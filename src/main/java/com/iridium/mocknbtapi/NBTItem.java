package com.iridium.mocknbtapi;

import org.bukkit.inventory.ItemStack;

public interface NBTItem {
    void setString(String key, String value);

    void setInteger(String key, int value);

    void setDouble(String key, double value);

    void setBoolean(String key, boolean value);

    void setObject(String key, Object value);

    String getString(String key);

    int getInteger(String key);

    double getDouble(String key);

    boolean getBoolean(String key);

    <T> T getObject(String key, Class<T> type);

    ItemStack getItem();
}
