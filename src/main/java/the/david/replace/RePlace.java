package the.david.replace;

import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;
import the.david.replace.commands.*;

public final class RePlace extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("rp").setExecutor(new CommandRP());
        this.getCommand("rp").setTabCompleter(new ConstructTabCompleter());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
