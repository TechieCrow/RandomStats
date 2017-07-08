package com.chewabletech;

import com.chewabletech.listeners.BlocksBroken;
import org.bstats.Metrics;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        this.RegisterListeners();
        this.RegisterConfig();

        Metrics metrics = new Metrics(this);

        metrics.addCustomChart(new Metrics.SimpleBarChart("blocks_broken")
        {
            @Override
            public HashMap<String, Integer> getValues(HashMap<String, Integer> map)
            {
                map.put("Dirt", getConfig().getInt("Dirt"));
                map.put("Stone", getConfig().getInt("Stone"));
                map.put("Log", getConfig().getInt("Log"));
                return map;
            }
        });
    }

    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args)
    {
        if (alias.equalsIgnoreCase("randomstats"))
        {
            if (args.length == 0)
            {
                sender.sendMessage(ChatColor.RED + "Usage: /randomstats reload");
            } else
            {
                if (args[0].equalsIgnoreCase("reload") && sender.hasPermission("randomstats.reload"))
                {
                    this.reloadConfig();
                    this.getConfig();
                    sender.sendMessage(ChatColor.GREEN + "Reloaded the config!");
                }
            }
        }
        return true;
    }

    private void RegisterListeners()
    {
        getServer().getPluginManager().registerEvents(new BlocksBroken(this), this);
    }

    // Make default config and save it
    private void RegisterConfig()
    {
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }
}