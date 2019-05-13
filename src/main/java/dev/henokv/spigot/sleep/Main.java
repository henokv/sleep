package dev.henokv.spigot.sleep;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SleepListener(), this);
        super.onEnable();
    }
}
