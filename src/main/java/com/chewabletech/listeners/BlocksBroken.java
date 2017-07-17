package com.chewabletech.listeners;

import com.chewabletech.Main;
import org.bukkit.GameMode;
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

    // block break event.
    @EventHandler(priority = EventPriority.MONITOR)
    public void BlockBreak(BlockBreakEvent e)
    {
        // Check player is in survival.
        if (e.getPlayer().getGameMode() == GameMode.SURVIVAL)
        {
            int i = 1;

            // Get the broken block. (need to figure out a way to get metadata too)
            String block = e.getBlock().getType().name();

            // Increase count +1 or add block with count of 1.
            int blockcount = this.plugin.getConfig().getInt(block);
            this.plugin.getConfig().set(block, blockcount + i);
            this.plugin.saveConfig();

            // Send a (debug) message to the player telling him/her what block was broke.
//            e.getPlayer().sendMessage("You broke: " + block);
        }
    }
}