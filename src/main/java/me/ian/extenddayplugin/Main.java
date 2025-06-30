package me.ian.extenddayplugin;

import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.World;

public class Main {
    public static void main(String[] args) {

        // Disables day/night cycle
        World world = Bukkit.getWorlds().getFirst();
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);


    }
}