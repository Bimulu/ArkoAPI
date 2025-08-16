package dk.arkomc.api.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.Collections;
import java.util.List;

public abstract class BaseCommand extends Command {
    protected BaseCommand(String name, String description, String usage, List<String> aliases) {
        super(name);

        setDescription(description);
        setUsage(usage);

        if (aliases != null) setAliases(aliases);
    }

    public abstract boolean execute(CommandSender sender, String label, String[] args);

    @Override
    public List<String> tabComplete(CommandSender sender, String alias, String[] args) {
        return Collections.emptyList();
    }
}
