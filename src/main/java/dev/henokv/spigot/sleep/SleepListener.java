package dev.henokv.spigot.sleep;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

import java.util.Collection;

public class SleepListener implements Listener {
    @EventHandler
    public void onPlayerSleep(PlayerBedEnterEvent event){
        if(event.getBedEnterResult() == PlayerBedEnterEvent.BedEnterResult.OK){
            int inBedCount = 1;
            Collection<? extends Player> players = Bukkit.getOnlinePlayers();
            for (Player player: players) if(player.isSleeping()) inBedCount += 1;
            if(inBedCount >= players.size() * 0.6) event.getPlayer().getWorld().setTime(0);
        }
    }

}