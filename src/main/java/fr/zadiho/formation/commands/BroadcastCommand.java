package fr.zadiho.formation.commands;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BroadcastCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String message = "";
        for(int i = 0; i<args.length; i++){
            message += args[i] + " ";
        }
        Bukkit.broadcastMessage("§8[§6§lBroadcast§8] §7" + message);
        for(Player players : Bukkit.getOnlinePlayers()){
            players.playSound(players.getLocation(), Sound.WITHER_DEATH, 1, 1);
        }
        return true;
    }
}
