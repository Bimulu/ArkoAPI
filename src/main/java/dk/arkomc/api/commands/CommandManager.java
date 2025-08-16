package dk.arkomc.api.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.SimplePluginManager;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private final Plugin plugin;
    private final Map<String, Command> registered = new HashMap<String, Command>();

    public CommandManager(Plugin plugin) {
        this.plugin = plugin;

    }

    public void register(Command command) {
        try {
            Field f = SimplePluginManager.class.getDeclaredField("commandMap");
            f.setAccessible(true);
            CommandMap map = (CommandMap) f.get(plugin.getServer().getPluginManager());
            map.register(plugin.getName().toLowerCase(), command);
            registered.put(command.getName().toLowerCase(), command);
        } catch (Exception e) {
            plugin.getLogger().severe("Failed to register command: " + command.getName());
            e.printStackTrace();
        }
    }
}
