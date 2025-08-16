package dk.arkomc.api.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public abstract class ArkoPlugin extends JavaPlugin {

    public abstract void start();
    public abstract void stop();

    @Override
    public void onEnable() {
        start();
    }

    @Override
    public void onDisable() {
        stop();
    }
}
