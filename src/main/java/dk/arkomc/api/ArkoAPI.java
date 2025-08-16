package dk.arkomc.api;

import org.bukkit.plugin.java.JavaPlugin;

public final class ArkoAPI extends JavaPlugin {

    private static ArkoAPI arkoApiInstance;

    private static String test = "test";

    @Override
    public void onEnable() {
        arkoApiInstance = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static ArkoAPI getArkoCoreInstance() {
        return arkoApiInstance;
    }
}
