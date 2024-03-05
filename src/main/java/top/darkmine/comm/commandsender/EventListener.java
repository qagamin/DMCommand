package top.darkmine.comm.commandsender;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventListener implements Listener {
    String line = "skills modifier removeall ";

    @EventHandler
    public void onWorldChange(PlayerChangedWorldEvent worldChange) {
        Player player = worldChange.getPlayer();
        //String worldTo = player.getWorld().getName();
        if (player.getWorld().getName().equals("world")){
            //player.getPlayer().sendMessage("мир - " + worldTo);
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), line + player.getName());
        }
    }

    @EventHandler
    public void onQuitServer(PlayerQuitEvent eventQuit) {
        Player player = eventQuit.getPlayer();
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), line + player.getName());
    }

    @EventHandler
    public void onJoinServer(PlayerJoinEvent eventJoin) {
        Player player = eventJoin.getPlayer();
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), line + player.getName());
    }

}
