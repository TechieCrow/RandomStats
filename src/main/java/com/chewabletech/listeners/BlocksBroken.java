package com.chewabletech.listeners;

import com.chewabletech.Main;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlocksBroken implements Listener
{

    private Main plugin;

    public BlocksBroken(Main pl)
    {
        this.plugin = pl;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void BlockBreak(BlockBreakEvent e)
    {
        int i = 1;
        if (e.getBlock().getType() == Material.DIRT && e.getPlayer().getGameMode() == GameMode.SURVIVAL)
        {
            int dirtcount = this.plugin.getConfig().getInt("Dirt");
            this.plugin.getConfig().set("Dirt", dirtcount + i);
            this.plugin.saveConfig();
        }

        if (e.getBlock().getType() == Material.STONE && e.getPlayer().getGameMode() == GameMode.SURVIVAL)
        {
            int dirtcount = this.plugin.getConfig().getInt("Dirt");
            this.plugin.getConfig().set("Stone", dirtcount + i);
            this.plugin.saveConfig();
        }

        if (e.getBlock().getType() == Material.LOG && e.getPlayer().getGameMode() == GameMode.SURVIVAL)
        {
            int dirtcount = this.plugin.getConfig().getInt("Dirt");
            this.plugin.getConfig().set("Log", dirtcount + i);
            this.plugin.saveConfig();
        }
    }
}