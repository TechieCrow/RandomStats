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
        // Enablee listeners and config.
        this.RegisterListeners();
        this.RegisterConfig();

        // Enable metrics.
        Metrics metrics = new Metrics(this);

        // Add to custom bar chart.
        metrics.addCustomChart(new Metrics.SimpleBarChart("blocks_broken")
        {
            @Override
            public HashMap<String, Integer> getValues(HashMap<String, Integer> map)
            {
                // All the stuffs in Minecraft..........
                map.put("ACACIA_DOOR", getConfig().getInt("ACACIA_DOOR"));
                map.put("ACACIA_DOOR_ITEM", getConfig().getInt("ACACIA_DOOR_ITEM"));
                map.put("ACACIA_FENCE", getConfig().getInt("ACACIA_FENCE"));
                map.put("ACACIA_FENCE_GATE", getConfig().getInt("ACACIA_FENCE_GATE"));
                map.put("ACACIA_STAIRS", getConfig().getInt("ACACIA_STAIRS"));
                map.put("ACTIVATOR_RAIL", getConfig().getInt("ACTIVATOR_RAIL"));
                map.put("AIR", getConfig().getInt("AIR"));
                map.put("ANVIL", getConfig().getInt("ANVIL"));
                map.put("APPLE", getConfig().getInt("APPLE"));
                map.put("ARMOR_STAND", getConfig().getInt("ARMOR_STAND"));
                map.put("ARROW", getConfig().getInt("ARROW"));
                map.put("BAKED_POTATO", getConfig().getInt("BAKED_POTATO"));
                map.put("BANNER", getConfig().getInt("BANNER"));
                map.put("BARRIER", getConfig().getInt("BARRIER"));
                map.put("BEACON", getConfig().getInt("BEACON"));
                map.put("BED", getConfig().getInt("BED"));
                map.put("BED_BLOCK", getConfig().getInt("BED_BLOCK"));
                map.put("BEDROCK", getConfig().getInt("BEDROCK"));
                map.put("BEETROOT", getConfig().getInt("BEETROOT"));
                map.put("BEETROOT_BLOCK", getConfig().getInt("BEETROOT_BLOCK"));
                map.put("BEETROOT_SEEDS", getConfig().getInt("BEETROOT_SEEDS"));
                map.put("BEETROOT_SOUP", getConfig().getInt("BEETROOT_SOUP"));
                map.put("BIRCH_DOOR", getConfig().getInt("BIRCH_DOOR"));
                map.put("BIRCH_DOOR_ITEM", getConfig().getInt("BIRCH_DOOR_ITEM"));
                map.put("BIRCH_FENCE", getConfig().getInt("BIRCH_FENCE"));
                map.put("BIRCH_FENCE_GATE", getConfig().getInt("BIRCH_FENCE_GATE"));
                map.put("BIRCH_WOOD_STAIRS", getConfig().getInt("BIRCH_WOOD_STAIRS"));
                map.put("BLACK_GLAZED_TERRACOTTA", getConfig().getInt("BLACK_GLAZED_TERRACOTTA"));
                map.put("BLACK_SHULKER_BOX", getConfig().getInt("BLACK_SHULKER_BOX"));
                map.put("BLAZE_POWDER", getConfig().getInt("BLAZE_POWDER"));
                map.put("BLAZE_ROD", getConfig().getInt("BLAZE_ROD"));
                map.put("BLUE_GLAZED_TERRACOTTA", getConfig().getInt("BLUE_GLAZED_TERRACOTTA"));
                map.put("BLUE_SHULKER_BOX", getConfig().getInt("BLUE_SHULKER_BOX"));
                map.put("BOAT", getConfig().getInt("BOAT"));
                map.put("BOAT_ACACIA", getConfig().getInt("BOAT_ACACIA"));
                map.put("BOAT_BIRCH", getConfig().getInt("BOAT_BIRCH"));
                map.put("BOAT_DARK_OAK", getConfig().getInt("BOAT_DARK_OAK"));
                map.put("BOAT_JUNGLE", getConfig().getInt("BOAT_JUNGLE"));
                map.put("BOAT_SPRUCE", getConfig().getInt("BOAT_SPRUCE"));
                map.put("BONE", getConfig().getInt("BONE"));
                map.put("BONE_BLOCK", getConfig().getInt("BONE_BLOCK"));
                map.put("BOOK", getConfig().getInt("BOOK"));
                map.put("BOOK_AND_QUILL", getConfig().getInt("BOOK_AND_QUILL"));
                map.put("BOOKSHELF", getConfig().getInt("BOOKSHELF"));
                map.put("BOW", getConfig().getInt("BOW"));
                map.put("BOWL", getConfig().getInt("BOWL"));
                map.put("BREAD", getConfig().getInt("BREAD"));
                map.put("BREWING_STAND", getConfig().getInt("BREWING_STAND"));
                map.put("BREWING_STAND_ITEM", getConfig().getInt("BREWING_STAND_ITEM"));
                map.put("BRICK", getConfig().getInt("BRICK"));
                map.put("BRICK_STAIRS", getConfig().getInt("BRICK_STAIRS"));
                map.put("BROWN_GLAZED_TERRACOTTA", getConfig().getInt("BROWN_GLAZED_TERRACOTTA"));
                map.put("BROWN_MUSHROOM", getConfig().getInt("BROWN_MUSHROOM"));
                map.put("BROWN_SHULKER_BOX", getConfig().getInt("BROWN_SHULKER_BOX"));
                map.put("BUCKET", getConfig().getInt("BUCKET"));
                map.put("BURNING_FURNACE", getConfig().getInt("BURNING_FURNACE"));
                map.put("CACTUS", getConfig().getInt("CACTUS"));
                map.put("CAKE", getConfig().getInt("CAKE"));
                map.put("CAKE_BLOCK", getConfig().getInt("CAKE_BLOCK"));
                map.put("CARPET", getConfig().getInt("CARPET"));
                map.put("CARROT", getConfig().getInt("CARROT"));
                map.put("CARROT_ITEM", getConfig().getInt("CARROT_ITEM"));
                map.put("CARROT_STICK", getConfig().getInt("CARROT_STICK"));
                map.put("CAULDRON", getConfig().getInt("CAULDRON"));
                map.put("CAULDRON_ITEM", getConfig().getInt("CAULDRON_ITEM"));
                map.put("CHAINMAIL_BOOTS", getConfig().getInt("CHAINMAIL_BOOTS"));
                map.put("CHAINMAIL_CHESTPLATE", getConfig().getInt("CHAINMAIL_CHESTPLATE"));
                map.put("CHAINMAIL_HELMET", getConfig().getInt("CHAINMAIL_HELMET"));
                map.put("CHAINMAIL_LEGGINGS", getConfig().getInt("CHAINMAIL_LEGGINGS"));
                map.put("CHEST", getConfig().getInt("CHEST"));
                map.put("CHORUS_FLOWER", getConfig().getInt("CHORUS_FLOWER"));
                map.put("CHORUS_FRUIT", getConfig().getInt("CHORUS_FRUIT"));
                map.put("CHORUS_FRUIT_POPPED", getConfig().getInt("CHORUS_FRUIT_POPPED"));
                map.put("CHORUS_PLANT", getConfig().getInt("CHORUS_PLANT"));
                map.put("CLAY", getConfig().getInt("CLAY"));
                map.put("CLAY_BALL", getConfig().getInt("CLAY_BALL"));
                map.put("CLAY_BRICK", getConfig().getInt("CLAY_BRICK"));
                map.put("COAL", getConfig().getInt("COAL"));
                map.put("COAL_BLOCK", getConfig().getInt("COAL_BLOCK"));
                map.put("COAL_ORE", getConfig().getInt("COAL_ORE"));
                map.put("COBBLE_WALL", getConfig().getInt("COBBLE_WALL"));
                map.put("COBBLESTONE", getConfig().getInt("COBBLESTONE"));
                map.put("COBBLESTONE_STAIRS", getConfig().getInt("COBBLESTONE_STAIRS"));
                map.put("COCOA", getConfig().getInt("COCOA"));
                map.put("COMMAND", getConfig().getInt("COMMAND"));
                map.put("COMMAND_CHAIN", getConfig().getInt("COMMAND_CHAIN"));
                map.put("COMMAND_MINECART", getConfig().getInt("COMMAND_MINECART"));
                map.put("COMMAND_REPEATING", getConfig().getInt("COMMAND_REPEATING"));
                map.put("COMPASS", getConfig().getInt("COMPASS"));
                map.put("CONCRETE", getConfig().getInt("CONCRETE"));
                map.put("CONCRETE_POWDER", getConfig().getInt("CONCRETE_POWDER"));
                map.put("COOKED_BEEF", getConfig().getInt("COOKED_BEEF"));
                map.put("COOKED_CHICKEN", getConfig().getInt("COOKED_CHICKEN"));
                map.put("COOKED_FISH", getConfig().getInt("COOKED_FISH"));
                map.put("COOKED_MUTTON", getConfig().getInt("COOKED_MUTTON"));
                map.put("COOKED_RABBIT", getConfig().getInt("COOKED_RABBIT"));
                map.put("COOKIE", getConfig().getInt("COOKIE"));
                map.put("CROPS", getConfig().getInt("CROPS"));
                map.put("CYAN_GLAZED_TERRACOTTA", getConfig().getInt("CYAN_GLAZED_TERRACOTTA"));
                map.put("CYAN_SHULKER_BOX", getConfig().getInt("CYAN_SHULKER_BOX"));
                map.put("DARK_OAK_DOOR", getConfig().getInt("DARK_OAK_DOOR"));
                map.put("DARK_OAK_DOOR_ITEM", getConfig().getInt("DARK_OAK_DOOR_ITEM"));
                map.put("DARK_OAK_FENCE", getConfig().getInt("DARK_OAK_FENCE"));
                map.put("DARK_OAK_FENCE_GATE", getConfig().getInt("DARK_OAK_FENCE_GATE"));
                map.put("DARK_OAK_STAIRS", getConfig().getInt("DARK_OAK_STAIRS"));
                map.put("DAYLIGHT_DETECTOR", getConfig().getInt("DAYLIGHT_DETECTOR"));
                map.put("DAYLIGHT_DETECTOR_INVERTED", getConfig().getInt("DAYLIGHT_DETECTOR_INVERTED"));
                map.put("DEAD_BUSH", getConfig().getInt("DEAD_BUSH"));
                map.put("DETECTOR_RAIL", getConfig().getInt("DETECTOR_RAIL"));
                map.put("DIAMOND", getConfig().getInt("DIAMOND"));
                map.put("DIAMOND_AXE", getConfig().getInt("DIAMOND_AXE"));
                map.put("DIAMOND_BARDING", getConfig().getInt("DIAMOND_BARDING"));
                map.put("DIAMOND_BLOCK", getConfig().getInt("DIAMOND_BLOCK"));
                map.put("DIAMOND_BOOTS", getConfig().getInt("DIAMOND_BOOTS"));
                map.put("DIAMOND_CHESTPLATE", getConfig().getInt("DIAMOND_CHESTPLATE"));
                map.put("DIAMOND_HELMET", getConfig().getInt("DIAMOND_HELMET"));
                map.put("DIAMOND_HOE", getConfig().getInt("DIAMOND_HOE"));
                map.put("DIAMOND_LEGGINGS", getConfig().getInt("DIAMOND_LEGGINGS"));
                map.put("DIAMOND_ORE", getConfig().getInt("DIAMOND_ORE"));
                map.put("DIAMOND_PICKAXE", getConfig().getInt("DIAMOND_PICKAXE"));
                map.put("DIAMOND_SPADE", getConfig().getInt("DIAMOND_SPADE"));
                map.put("DIAMOND_SWORD", getConfig().getInt("DIAMOND_SWORD"));
                map.put("DIODE", getConfig().getInt("DIODE"));
                map.put("DIODE_BLOCK_OFF", getConfig().getInt("DIODE_BLOCK_OFF"));
                map.put("DIODE_BLOCK_ON", getConfig().getInt("DIODE_BLOCK_ON"));
                map.put("DIRT", getConfig().getInt("DIRT"));
                map.put("", getConfig().getInt("DISPENSER"));
                map.put("DISPENSER", getConfig().getInt("DOUBLE_PLANT"));
                map.put("DOUBLE_STEP", getConfig().getInt("DOUBLE_STEP"));
                map.put("DOUBLE_STONE_SLAB2", getConfig().getInt("DOUBLE_STONE_SLAB2"));
                map.put("DRAGON_EGG", getConfig().getInt("DRAGON_EGG"));
                map.put("DRAGONS_BREATH", getConfig().getInt("DRAGONS_BREATH"));
                map.put("DROPPER", getConfig().getInt("DROPPER"));
                map.put("EGG", getConfig().getInt("EGG"));
                map.put("ELYTRA", getConfig().getInt("ELYTRA"));
                map.put("EMERALD", getConfig().getInt("EMERALD"));
                map.put("EMERALD_BLOCK", getConfig().getInt("EMERALD_BLOCK"));
                map.put("EMERALD_ORE", getConfig().getInt("EMERALD_ORE"));
                map.put("EMPTY_MAP", getConfig().getInt("EMPTY_MAP"));
                map.put("ENCHANTED_BOOK", getConfig().getInt("ENCHANTED_BOOK"));
                map.put("ENCHANTMENT_TABLE", getConfig().getInt("ENCHANTMENT_TABLE"));
                map.put("END_BRICKS", getConfig().getInt("END_BRICKS"));
                map.put("END_CRYSTAL", getConfig().getInt("END_CRYSTAL"));
                map.put("END_GATEWAY", getConfig().getInt("END_GATEWAY"));
                map.put("END_ROD", getConfig().getInt("END_ROD"));
                map.put("ENDER_CHEST", getConfig().getInt("ENDER_CHEST"));
                map.put("ENDER_PEARL", getConfig().getInt("ENDER_PEARL"));
                map.put("ENDER_PORTAL", getConfig().getInt("ENDER_PORTAL"));
                map.put("ENDER_PORTAL_FRAME", getConfig().getInt("ENDER_PORTAL_FRAME"));
                map.put("ENDER_STONE", getConfig().getInt("ENDER_STONE"));
                map.put("EXP_BOTTLE", getConfig().getInt("EXP_BOTTLE"));
                map.put("EXPLOSIVE_MINECART", getConfig().getInt("EXPLOSIVE_MINECART"));
                map.put("EYE_OF_ENDER", getConfig().getInt("EYE_OF_ENDER"));
                map.put("FEATHER", getConfig().getInt("FEATHER"));
                map.put("FENCE", getConfig().getInt("FENCE"));
                map.put("FENCE_GATE", getConfig().getInt("FENCE_GATE"));
                map.put("FERMENTED_SPIDER_EYE", getConfig().getInt("FERMENTED_SPIDER_EYE"));
                map.put("FIRE", getConfig().getInt("FIRE"));
                map.put("FIREBALL", getConfig().getInt("FIREBALL"));
                map.put("FIREWORK", getConfig().getInt("FIREWORK"));
                map.put("FIREWORK_CHARGE", getConfig().getInt("FIREWORK_CHARGE"));
                map.put("FISHING_ROD", getConfig().getInt("FISHING_ROD"));
                map.put("FLINT", getConfig().getInt("FLINT"));
                map.put("FLINT_AND_STEEL", getConfig().getInt("FLINT_AND_STEEL"));
                map.put("FLOWER_POT", getConfig().getInt("FLOWER_POT"));
                map.put("FLOWER_POT_ITEM", getConfig().getInt("FLOWER_POT_ITEM"));
                map.put("FROSTED_ICE", getConfig().getInt("FROSTED_ICE"));
                map.put("FURNACE", getConfig().getInt("FURNACE"));
                map.put("GHAST_TEAR", getConfig().getInt("GHAST_TEAR"));
                map.put("GLASS", getConfig().getInt("GLASS"));
                map.put("GLASS_BOTTLE", getConfig().getInt("GLASS_BOTTLE"));
                map.put("GLOWING_REDSTONE_ORE", getConfig().getInt("GLOWING_REDSTONE_ORE"));
                map.put("GLOWSTONE", getConfig().getInt("GLOWSTONE"));
                map.put("GLOWSTONE_DUST", getConfig().getInt("GLOWSTONE_DUST"));
                map.put("GOLD_AXE", getConfig().getInt("GOLD_AXE"));
                map.put("GOLD_BARDING", getConfig().getInt("GOLD_BARDING"));
                map.put("GOLD_BLOCK", getConfig().getInt("GOLD_BLOCK"));
                map.put("GOLD_BOOTS", getConfig().getInt("GOLD_BOOTS"));
                map.put("GOLD_CHESTPLATE", getConfig().getInt("GOLD_CHESTPLATE"));
                map.put("GOLD_HELMET", getConfig().getInt("GOLD_HELMET"));
                map.put("GOLD_HOE", getConfig().getInt("GOLD_HOE"));
                map.put("GOLD_INGOT", getConfig().getInt("GOLD_INGOT"));
                map.put("GOLD_LEGGINGS", getConfig().getInt("GOLD_LEGGINGS"));
                map.put("GOLD_NUGGET", getConfig().getInt("GOLD_NUGGET"));
                map.put("GOLD_ORE", getConfig().getInt("GOLD_ORE"));
                map.put("GOLD_PICKAXE", getConfig().getInt("GOLD_PICKAXE"));
                map.put("GOLD_PLATE", getConfig().getInt("GOLD_PLATE"));
                map.put("GOLD_RECORD", getConfig().getInt("GOLD_RECORD"));
                map.put("GOLD_SPADE", getConfig().getInt("GOLD_SPADE"));
                map.put("GOLD_SWORD", getConfig().getInt("GOLD_SWORD"));
                map.put("GOLDEN_APPLE", getConfig().getInt("GOLDEN_APPLE"));
                map.put("GOLDEN_CARROT", getConfig().getInt("GOLDEN_CARROT"));
                map.put("GRASS", getConfig().getInt("GRASS"));
                map.put("GRASS_PATH", getConfig().getInt("GRASS_PATH"));
                map.put("GRAVEL", getConfig().getInt("GRAVEL"));
                map.put("GRAY_GLAZED_TERRACOTTA", getConfig().getInt("GRAY_GLAZED_TERRACOTTA"));
                map.put("GRAY_SHULKER_BOX", getConfig().getInt("GRAY_SHULKER_BOX"));
                map.put("GREEN_GLAZED_TERRACOTTA", getConfig().getInt("GREEN_GLAZED_TERRACOTTA"));
                map.put("GREEN_RECORD", getConfig().getInt("GREEN_RECORD"));
                map.put("GREEN_SHULKER_BOX", getConfig().getInt("GREEN_SHULKER_BOX"));
                map.put("GRILLED_PORK", getConfig().getInt("GRILLED_PORK"));
                map.put("HARD_CLAY", getConfig().getInt("HARD_CLAY"));
                map.put("HAY_BLOCK", getConfig().getInt("HAY_BLOCK"));
                map.put("HOPPER", getConfig().getInt("HOPPER"));
                map.put("HOPPER_MINECART", getConfig().getInt("HOPPER_MINECART"));
                map.put("HUGE_MUSHROOM_1", getConfig().getInt("HUGE_MUSHROOM_1"));
                map.put("HUGE_MUSHROOM_2", getConfig().getInt("HUGE_MUSHROOM_2"));
                map.put("ICE", getConfig().getInt("ICE"));
                map.put("INK_SACK", getConfig().getInt("INK_SACK"));
                map.put("", getConfig().getInt("IRON_AXE"));
                map.put("IRON_AXE", getConfig().getInt("IRON_BARDING"));
                map.put("IRON_BLOCK", getConfig().getInt("IRON_BLOCK"));
                map.put("IRON_BOOTS", getConfig().getInt("IRON_BOOTS"));
                map.put("IRON_CHESTPLATE", getConfig().getInt("IRON_CHESTPLATE"));
                map.put("IRON_DOOR", getConfig().getInt("IRON_DOOR"));
                map.put("IRON_DOOR_BLOCK", getConfig().getInt("IRON_DOOR_BLOCK"));
                map.put("IRON_FENCE", getConfig().getInt("IRON_FENCE"));
                map.put("IRON_HELMET", getConfig().getInt("IRON_HELMET"));
                map.put("IRON_HOE", getConfig().getInt("IRON_HOE"));
                map.put("IRON_INGOT", getConfig().getInt("IRON_INGOT"));
                map.put("IRON_LEGGINGS", getConfig().getInt("IRON_LEGGINGS"));
                map.put("IRON_NUGGET", getConfig().getInt("IRON_NUGGET"));
                map.put("IRON_ORE", getConfig().getInt("IRON_ORE"));
                map.put("IRON_PICKAXE", getConfig().getInt("IRON_PICKAXE"));
                map.put("IRON_PLATE", getConfig().getInt("IRON_PLATE"));
                map.put("IRON_SPADE", getConfig().getInt("IRON_SPADE"));
                map.put("IRON_SWORD", getConfig().getInt("IRON_SWORD"));
                map.put("IRON_TRAPDOOR", getConfig().getInt("IRON_TRAPDOOR"));
                map.put("ITEM_FRAME", getConfig().getInt("ITEM_FRAME"));
                map.put("JACK_O_LANTERN", getConfig().getInt("JACK_O_LANTERN"));
                map.put("JUKEBOX", getConfig().getInt("JUKEBOX"));
                map.put("JUNGLE_DOOR", getConfig().getInt("JUNGLE_DOOR"));
                map.put("JUNGLE_DOOR_ITEM", getConfig().getInt("JUNGLE_DOOR_ITEM"));
                map.put("JUNGLE_FENCE", getConfig().getInt("JUNGLE_FENCE"));
                map.put("JUNGLE_FENCE_GATE", getConfig().getInt("JUNGLE_FENCE_GATE"));
                map.put("JUNGLE_WOOD_STAIRS", getConfig().getInt("JUNGLE_WOOD_STAIRS"));
                map.put("KNOWLEDGE_BOOK", getConfig().getInt("KNOWLEDGE_BOOK"));
                map.put("LADDER", getConfig().getInt("LADDER"));
                map.put("LAPIS_BLOCK", getConfig().getInt("LAPIS_BLOCK"));
                map.put("LAPIS_ORE", getConfig().getInt("LAPIS_ORE"));
                map.put("LAVA", getConfig().getInt("LAVA"));
                map.put("LAVA_BUCKET", getConfig().getInt("LAVA_BUCKET"));
                map.put("", getConfig().getInt("LEASH"));
                map.put("LEASH", getConfig().getInt("LEATHER"));
                map.put("LEATHER_BOOTS", getConfig().getInt("LEATHER_BOOTS"));
                map.put("LEATHER_CHESTPLATE", getConfig().getInt("LEATHER_CHESTPLATE"));
                map.put("LEATHER_HELMET", getConfig().getInt("LEATHER_HELMET"));
                map.put("LEATHER_LEGGINGS", getConfig().getInt("LEATHER_LEGGINGS"));
                map.put("LEAVES", getConfig().getInt("LEAVES"));
                map.put("LEAVES_2", getConfig().getInt("LEAVES_2"));
                map.put("LEVER", getConfig().getInt("LEVER"));
                map.put("LIGHT_BLUE_GLAZED_TERRACOTTA", getConfig().getInt("LIGHT_BLUE_GLAZED_TERRACOTTA"));
                map.put("LIGHT_BLUE_SHULKER_BOX", getConfig().getInt("LIGHT_BLUE_SHULKER_BOX"));
                map.put("LIME_GLAZED_TERRACOTTA", getConfig().getInt("LIME_GLAZED_TERRACOTTA"));
                map.put("LIME_SHULKER_BOX", getConfig().getInt("LIME_SHULKER_BOX"));
                map.put("LINGERING_POTION", getConfig().getInt("LINGERING_POTION"));
                map.put("LOG", getConfig().getInt("LOG"));
                map.put("LOG_2", getConfig().getInt("LOG_2"));
                map.put("LONG_GRASS", getConfig().getInt("LONG_GRASS"));
                map.put("MAGENTA_GLAZED_TERRACOTTA", getConfig().getInt("MAGENTA_GLAZED_TERRACOTTA"));
                map.put("MAGENTA_SHULKER_BOX", getConfig().getInt("MAGENTA_SHULKER_BOX"));
                map.put("MAGMA", getConfig().getInt("MAGMA"));
                map.put("MAGMA_CREAM", getConfig().getInt("MAGMA_CREAM"));
                map.put("MAP", getConfig().getInt("MAP"));
                map.put("MELON", getConfig().getInt("MELON"));
                map.put("MELON_BLOCK", getConfig().getInt("MELON_BLOCK"));
                map.put("MELON_SEEDS", getConfig().getInt("MELON_SEEDS"));
                map.put("MELON_STEM", getConfig().getInt("MELON_STEM"));
                map.put("MILK_BUCKET", getConfig().getInt("MILK_BUCKET"));
                map.put("MINECART", getConfig().getInt("MINECART"));
                map.put("MOB_SPAWNER", getConfig().getInt("MOB_SPAWNER"));
                map.put("MONSTER_EGG", getConfig().getInt("MONSTER_EGG"));
                map.put("MONSTER_EGGS", getConfig().getInt("MONSTER_EGGS"));
                map.put("MOSSY_COBBLESTONE", getConfig().getInt("MOSSY_COBBLESTONE"));
                map.put("MUSHROOM_SOUP", getConfig().getInt("MUSHROOM_SOUP"));
                map.put("MUTTON", getConfig().getInt("MUTTON"));
                map.put("MYCEL", getConfig().getInt("MYCEL"));
                map.put("NAME_TAG", getConfig().getInt("NAME_TAG"));
                map.put("NETHER_BRICK", getConfig().getInt("NETHER_BRICK"));
                map.put("NETHER_BRICK_ITEM", getConfig().getInt("NETHER_BRICK_ITEM"));
                map.put("NETHER_BRICK_STAIRS", getConfig().getInt("NETHER_BRICK_STAIRS"));
                map.put("NETHER_FENCE", getConfig().getInt("NETHER_FENCE"));
                map.put("NETHER_STALK", getConfig().getInt("NETHER_STALK"));
                map.put("NETHER_STAR", getConfig().getInt("NETHER_STAR"));
                map.put("NETHER_WART_BLOCK", getConfig().getInt("NETHER_WART_BLOCK"));
                map.put("NETHER_WARTS", getConfig().getInt("NETHER_WARTS"));
                map.put("NETHERRACK", getConfig().getInt("NETHERRACK"));
                map.put("NOTE_BLOCK", getConfig().getInt("NOTE_BLOCK"));
                map.put("OBSERVER", getConfig().getInt("OBSERVER"));
                map.put("OBSIDIAN", getConfig().getInt("OBSIDIAN"));
                map.put("ORANGE_GLAZED_TERRACOTTA", getConfig().getInt("ORANGE_GLAZED_TERRACOTTA"));
                map.put("ORANGE_SHULKER_BOX", getConfig().getInt("ORANGE_SHULKER_BOX"));
                map.put("PACKED_ICE", getConfig().getInt("PACKED_ICE"));
                map.put("PAINTING", getConfig().getInt("PAINTING"));
                map.put("PAPER", getConfig().getInt("PAPER"));
                map.put("PINK_GLAZED_TERRACOTTA", getConfig().getInt("PINK_GLAZED_TERRACOTTA"));
                map.put("PINK_SHULKER_BOX", getConfig().getInt("PINK_SHULKER_BOX"));
                map.put("PISTON_BASE", getConfig().getInt("PISTON_BASE"));
                map.put("PISTON_EXTENSION", getConfig().getInt("PISTON_EXTENSION"));
                map.put("PISTON_MOVING_PIECE", getConfig().getInt("PISTON_MOVING_PIECE"));
                map.put("PISTON_STICKY_BASE", getConfig().getInt("PISTON_STICKY_BASE"));
                map.put("POISONOUS_POTATO", getConfig().getInt("POISONOUS_POTATO"));
                map.put("PORK", getConfig().getInt("PORK"));
                map.put("PORTAL", getConfig().getInt("PORTAL"));
                map.put("POTATO", getConfig().getInt("POTATO"));
                map.put("POTATO_ITEM", getConfig().getInt("POTATO_ITEM"));
                map.put("POTION", getConfig().getInt("POTION"));
                map.put("POWERED_MINECART", getConfig().getInt("POWERED_MINECART"));
                map.put("POWERED_RAIL", getConfig().getInt("POWERED_RAIL"));
                map.put("PRISMARINE", getConfig().getInt("PRISMARINE"));
                map.put("PRISMARINE_CRYSTALS", getConfig().getInt("PRISMARINE_CRYSTALS"));
                map.put("PRISMARINE_SHARD", getConfig().getInt("PRISMARINE_SHARD"));
                map.put("PUMPKIN", getConfig().getInt("PUMPKIN"));
                map.put("PUMPKIN_PIE", getConfig().getInt("PUMPKIN_PIE"));
                map.put("PUMPKIN_SEEDS", getConfig().getInt("PUMPKIN_SEEDS"));
                map.put("PUMPKIN_STEM", getConfig().getInt("PUMPKIN_STEM"));
                map.put("PURPLE_GLAZED_TERRACOTTA", getConfig().getInt("PURPLE_GLAZED_TERRACOTTA"));
                map.put("PURPLE_SHULKER_BOX", getConfig().getInt("PURPLE_SHULKER_BOX"));
                map.put("PURPUR_BLOCK", getConfig().getInt("PURPUR_BLOCK"));
                map.put("PURPUR_DOUBLE_SLAB", getConfig().getInt("PURPUR_DOUBLE_SLAB"));
                map.put("PURPUR_PILLAR", getConfig().getInt("PURPUR_PILLAR"));
                map.put("PURPUR_SLAB", getConfig().getInt("PURPUR_SLAB"));
                map.put("PURPUR_STAIRS", getConfig().getInt("PURPUR_STAIRS"));
                map.put("QUARTZ", getConfig().getInt("QUARTZ"));
                map.put("QUARTZ_BLOCK", getConfig().getInt("QUARTZ_BLOCK"));
                map.put("QUARTZ_ORE", getConfig().getInt("QUARTZ_ORE"));
                map.put("QUARTZ_STAIRS", getConfig().getInt("QUARTZ_STAIRS"));
                map.put("RABBIT", getConfig().getInt("RABBIT"));
                map.put("RABBIT_FOOT", getConfig().getInt("RABBIT_FOOT"));
                map.put("RABBIT_HIDE", getConfig().getInt("RABBIT_HIDE"));
                map.put("RABBIT_STEW", getConfig().getInt("RABBIT_STEW"));
                map.put("RAILS", getConfig().getInt("RAILS"));
                map.put("RAW_BEEF", getConfig().getInt("RAW_BEEF"));
                map.put("RAW_CHICKEN", getConfig().getInt("RAW_CHICKEN"));
                map.put("RAW_FISH", getConfig().getInt("RAW_FISH"));
                map.put("RECORD_10", getConfig().getInt("RECORD_10"));
                map.put("RECORD_11", getConfig().getInt("RECORD_11"));
                map.put("RECORD_12", getConfig().getInt("RECORD_12"));
                map.put("RECORD_3", getConfig().getInt("RECORD_3"));
                map.put("RECORD_4", getConfig().getInt("RECORD_4"));
                map.put("RECORD_5", getConfig().getInt("RECORD_5"));
                map.put("RECORD_6", getConfig().getInt("RECORD_6"));
                map.put("RECORD_7", getConfig().getInt("RECORD_7"));
                map.put("RECORD_8", getConfig().getInt("RECORD_8"));
                map.put("RECORD_9", getConfig().getInt("RECORD_9"));
                map.put("RED_GLAZED_TERRACOTTA", getConfig().getInt("RED_GLAZED_TERRACOTTA"));
                map.put("RED_MUSHROOM", getConfig().getInt("RED_MUSHROOM"));
                map.put("RED_NETHER_BRICK", getConfig().getInt("RED_NETHER_BRICK"));
                map.put("RED_ROSE", getConfig().getInt("RED_ROSE"));
                map.put("RED_SANDSTONE", getConfig().getInt("RED_SANDSTONE"));
                map.put("RED_SANDSTONE_STAIRS", getConfig().getInt("RED_SANDSTONE_STAIRS"));
                map.put("RED_SHULKER_BOX", getConfig().getInt("RED_SHULKER_BOX"));
                map.put("REDSTONE", getConfig().getInt("REDSTONE"));
                map.put("REDSTONE_BLOCK", getConfig().getInt("REDSTONE_BLOCK"));
                map.put("REDSTONE_COMPARATOR", getConfig().getInt("REDSTONE_COMPARATOR"));
                map.put("REDSTONE_COMPARATOR_OFF", getConfig().getInt("REDSTONE_COMPARATOR_OFF"));
                map.put("REDSTONE_COMPARATOR_ON", getConfig().getInt("REDSTONE_COMPARATOR_ON"));
                map.put("REDSTONE_LAMP_OFF", getConfig().getInt("REDSTONE_LAMP_OFF"));
                map.put("REDSTONE_LAMP_ON", getConfig().getInt("REDSTONE_LAMP_ON"));
                map.put("REDSTONE_ORE", getConfig().getInt("REDSTONE_ORE"));
                map.put("REDSTONE_TORCH_OFF", getConfig().getInt("REDSTONE_TORCH_OFF"));
                map.put("REDSTONE_TORCH_ON", getConfig().getInt("REDSTONE_TORCH_ON"));
                map.put("REDSTONE_WIRE", getConfig().getInt("REDSTONE_WIRE"));
                map.put("ROTTEN_FLESH", getConfig().getInt("ROTTEN_FLESH"));
                map.put("SADDLE", getConfig().getInt("SADDLE"));
                map.put("SAND", getConfig().getInt("SAND"));
                map.put("SANDSTONE", getConfig().getInt("SANDSTONE"));
                map.put("SANDSTONE_STAIRS", getConfig().getInt("SANDSTONE_STAIRS"));
                map.put("SAPLING", getConfig().getInt("SAPLING"));
                map.put("SEA_LANTERN", getConfig().getInt("SEA_LANTERN"));
                map.put("SEEDS", getConfig().getInt("SEEDS"));
                map.put("SHEARS", getConfig().getInt("SHEARS"));
                map.put("SHIELD", getConfig().getInt("SHIELD"));
                map.put("SHULKER_SHELL", getConfig().getInt("SHULKER_SHELL"));
                map.put("SIGN", getConfig().getInt("SIGN"));
                map.put("SIGN_POST", getConfig().getInt("SIGN_POST"));
                map.put("SILVER_GLAZED_TERRACOTTA", getConfig().getInt("SILVER_GLAZED_TERRACOTTA"));
                map.put("SILVER_SHULKER_BOX", getConfig().getInt("SILVER_SHULKER_BOX"));
                map.put("SKULL", getConfig().getInt("SKULL"));
                map.put("SKULL_ITEM", getConfig().getInt("SKULL_ITEM"));
                map.put("SLIME_BALL", getConfig().getInt("SLIME_BALL"));
                map.put("SLIME_BLOCK", getConfig().getInt("SLIME_BLOCK"));
                map.put("SMOOTH_BRICK", getConfig().getInt("SMOOTH_BRICK"));
                map.put("SMOOTH_STAIRS", getConfig().getInt("SMOOTH_STAIRS"));
                map.put("SNOW", getConfig().getInt("SNOW"));
                map.put("SNOW_BALL", getConfig().getInt("SNOW_BALL"));
                map.put("SNOW_BLOCK", getConfig().getInt("SNOW_BLOCK"));
                map.put("SOIL", getConfig().getInt("SOIL"));
                map.put("SOUL_SAND", getConfig().getInt("SOUL_SAND"));
                map.put("SPECKLED_MELON", getConfig().getInt("SPECKLED_MELON"));
                map.put("SPECTRAL_ARROW", getConfig().getInt("SPECTRAL_ARROW"));
                map.put("SPIDER_EYE", getConfig().getInt("SPIDER_EYE"));
                map.put("SPLASH_POTION", getConfig().getInt("SPLASH_POTION"));
                map.put("SPONGE", getConfig().getInt("SPONGE"));
                map.put("SPRUCE_DOOR", getConfig().getInt("SPRUCE_DOOR"));
                map.put("SPRUCE_DOOR_ITEM", getConfig().getInt("SPRUCE_DOOR_ITEM"));
                map.put("SPRUCE_FENCE", getConfig().getInt("SPRUCE_FENCE"));
                map.put("SPRUCE_FENCE_GATE", getConfig().getInt("SPRUCE_FENCE_GATE"));
                map.put("SPRUCE_WOOD_STAIRS", getConfig().getInt("SPRUCE_WOOD_STAIRS"));
                map.put("STAINED_CLAY", getConfig().getInt("STAINED_CLAY"));
                map.put("STAINED_GLASS", getConfig().getInt("STAINED_GLASS"));
                map.put("STAINED_GLASS_PANE", getConfig().getInt("STAINED_GLASS_PANE"));
                map.put("STANDING_BANNER", getConfig().getInt("STANDING_BANNER"));
                map.put("STATIONARY_LAVA", getConfig().getInt("STATIONARY_LAVA"));
                map.put("STATIONARY_WATER", getConfig().getInt("STATIONARY_WATER"));
                map.put("STEP", getConfig().getInt("STEP"));
                map.put("STICK", getConfig().getInt("STICK"));
                map.put("STONE", getConfig().getInt("STONE"));
                map.put("STONE_AXE", getConfig().getInt("STONE_AXE"));
                map.put("STONE_BUTTON", getConfig().getInt("STONE_BUTTON"));
                map.put("STONE_HOE", getConfig().getInt("STONE_HOE"));
                map.put("STONE_PICKAXE", getConfig().getInt("STONE_PICKAXE"));
                map.put("STONE_PLATE", getConfig().getInt("STONE_PLATE"));
                map.put("STONE_SLAB2", getConfig().getInt("STONE_SLAB2"));
                map.put("STONE_SPADE", getConfig().getInt("STONE_SPADE"));
                map.put("STONE_SWORD", getConfig().getInt("STONE_SWORD"));
                map.put("STORAGE_MINECART", getConfig().getInt("STORAGE_MINECART"));
                map.put("STRING", getConfig().getInt("STRING"));
                map.put("STRUCTURE_BLOCK", getConfig().getInt("STRUCTURE_BLOCK"));
                map.put("STRUCTURE_VOID", getConfig().getInt("STRUCTURE_VOID"));
                map.put("SUGAR", getConfig().getInt("SUGAR"));
                map.put("SUGAR_CANE", getConfig().getInt("SUGAR_CANE"));
                map.put("SUGAR_CANE_BLOCK", getConfig().getInt("SUGAR_CANE_BLOCK"));
                map.put("SULPHUR", getConfig().getInt("SULPHUR"));
                map.put("THIN_GLASS", getConfig().getInt("THIN_GLASS"));
                map.put("TIPPED_ARROW", getConfig().getInt("TIPPED_ARROW"));
                map.put("TNT", getConfig().getInt("TNT"));
                map.put("TORCH", getConfig().getInt("TORCH"));
                map.put("TOTEM", getConfig().getInt("TOTEM"));
                map.put("TRAP_DOOR", getConfig().getInt("TRAP_DOOR"));
                map.put("TRAPPED_CHEST", getConfig().getInt("TRAPPED_CHEST"));
                map.put("TRIPWIRE", getConfig().getInt("TRIPWIRE"));
                map.put("TRIPWIRE_HOOK", getConfig().getInt("TRIPWIRE_HOOK"));
                map.put("VINE", getConfig().getInt("VINE"));
                map.put("WALL_BANNER", getConfig().getInt("WALL_BANNER"));
                map.put("WALL_SIGN", getConfig().getInt("WALL_SIGN"));
                map.put("WATCH", getConfig().getInt("WATCH"));
                map.put("WATER", getConfig().getInt("WATER"));
                map.put("WATER_BUCKET", getConfig().getInt("WATER_BUCKET"));
                map.put("WATER_LILY", getConfig().getInt("WATER_LILY"));
                map.put("WEB", getConfig().getInt("WEB"));
                map.put("WHEAT", getConfig().getInt("WHEAT"));
                map.put("WHITE_GLAZED_TERRACOTTA", getConfig().getInt("WHITE_GLAZED_TERRACOTTA"));
                map.put("WHITE_SHULKER_BOX", getConfig().getInt("WHITE_SHULKER_BOX"));
                map.put("WOOD", getConfig().getInt("WOOD"));
                map.put("WOOD_AXE", getConfig().getInt("WOOD_AXE"));
                map.put("WOOD_BUTTON", getConfig().getInt("WOOD_BUTTON"));
                map.put("WOOD_DOOR", getConfig().getInt("WOOD_DOOR"));
                map.put("WOOD_DOUBLE_STEP", getConfig().getInt("WOOD_DOUBLE_STEP"));
                map.put("WOOD_HOE", getConfig().getInt("WOOD_HOE"));
                map.put("WOOD_PICKAXE", getConfig().getInt("WOOD_PICKAXE"));
                map.put("WOOD_PLATE", getConfig().getInt("WOOD_PLATE"));
                map.put("WOOD_SPADE", getConfig().getInt("WOOD_SPADE"));
                map.put("WOOD_STAIRS", getConfig().getInt("WOOD_STAIRS"));
                map.put("WOOD_STEP", getConfig().getInt("WOOD_STEP"));
                map.put("WOOD_SWORD", getConfig().getInt("WOOD_SWORD"));
                map.put("WOODEN_DOOR", getConfig().getInt("WOODEN_DOOR"));
                map.put("WOOL", getConfig().getInt("WOOL"));
                map.put("WORKBENCH", getConfig().getInt("WORKBENCH"));
                map.put("WRITTEN_BOOK", getConfig().getInt("WRITTEN_BOOK"));
                map.put("YELLOW_FLOWER", getConfig().getInt("YELLOW_FLOWER"));
                map.put("YELLOW_GLAZED_TERRACOTTA", getConfig().getInt("YELLOW_GLAZED_TERRACOTTA"));
                map.put("YELLOW_SHULKER_BOX", getConfig().getInt("YELLOW_SHULKER_BOX"));
                return map;
            }
        });
    }


    // Reload command.
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


    // reister the listeners.
    private void RegisterListeners()
    {
        getServer().getPluginManager().registerEvents(new BlocksBroken(this), this);
    }

    // Make default config and save it.
    private void RegisterConfig()
    {
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }
}