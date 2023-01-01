package fr.zadiho.formation.commands;

import fr.zadiho.formation.Formation;
import fr.zadiho.formation.utils.Locations;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {

    private final Formation main = Formation.getInstance();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.isOp()){
                Location location = player.getLocation();
                main.getConfig().set("spawn", Locations.parseLocToString(location));
                main.saveConfig();
                player.sendMessage("§aSpawn set !");
                player.playSound(player.getLocation(), Sound.NOTE_PLING, 1, 1);
            }else{
                player.sendMessage("§cVous n'avez pas la permission d'utiliser cette commande !");
            }
            return true;
        }else{
            Bukkit.getLogger().info("§cVous devez être un joueur pour éxécuter cette commande");
            return true;
        }
    }
}
