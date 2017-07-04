package com.chewabletech;

import com.chewabletech.listeners.BlocksBroken;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        this.registerListeners();
    }

    private void registerListeners()
    {
        getServer().getPluginManager().registerEvents(new BlocksBroken(this), this);
    }
}