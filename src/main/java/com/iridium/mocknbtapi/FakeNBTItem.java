package com.iridium.mocknbtapi;

import java.util.HashMap;

public class FakeNBTItem implements NBTItem {
    private final HashMap<String, Object> nbtData = new HashMap<>();

    @Override
    public void setString(String key, String value) {
        nbtData.put(key, value);
    }

    @Override
    public void setInteger(String key, int value) {
        nbtData.put(key, value);
    }

    @Override
    public void setDouble(String key, double value) {
        nbtData.put(key, value);
    }

    @Override
    public void setBoolean(String key, boolean value) {
        nbtData.put(key, value);
    }

    @Override
    public String getString(String key) {
        return (String) nbtData.get(key);
    }

    @Override
    public int getInteger(String key) {
        return (int) nbtData.get(key);
    }

    @Override
    public double getDouble(String key) {
        return (double) nbtData.get(key);
    }

    @Override
    public boolean getBoolean(String key) {
        return (boolean) nbtData.get(key);
    }
}
