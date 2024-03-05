package top.darkmine.comm.commandsender;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandSender extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new EventListener(), (Plugin) this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
