package com.chewabletech.listeners;

import com.chewabletech.Main;
import org.bstats.Metrics;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.HashMap;

import static org.bukkit.GameMode.SURVIVAL;

public class BlocksBroken implements Listener
{
    private Main plugin;

    public BlocksBroken(Main instance)
    {

        plugin = instance;

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void BlocksBroken(BlockBreakEvent e)
    {
        Metrics metrics = new Metrics(plugin);

        // Dirt
        if(e.getBlock().getType() == Material.DIRT && e.getPlayer().getGameMode() == SURVIVAL)
        {
            metrics.addCustomChart(new Metrics.AdvancedPie("blocks_broken")
            {
                @Override
                public HashMap<String, Integer> getValues(HashMap<String, Integer> valueMap)
                {
                    valueMap.put("Dirt", 1);
                    return valueMap;
                }
            });
        }

        // Stone
        if(e.getBlock().getType() == Material.STONE && e.getPlayer().getGameMode() == SURVIVAL)
        {
            metrics.addCustomChart(new Metrics.AdvancedPie("blocks_broken")
            {
                @Override
                public HashMap<String, Integer> getValues(HashMap<String, Integer> valueMap)
                {
                    valueMap.put("Stone", 1);
                    return valueMap;
                }
            });
        }

        // Log
        if(e.getBlock().getType() == Material.LOG && e.getPlayer().getGameMode() == SURVIVAL)
        {
            metrics.addCustomChart(new Metrics.AdvancedPie("blocks_broken")
            {
                @Override
                public HashMap<String, Integer> getValues(HashMap<String, Integer> valueMap)
                {
                    valueMap.put("Log?", 1);
                    return valueMap;
                }
            });
        }
    }
}