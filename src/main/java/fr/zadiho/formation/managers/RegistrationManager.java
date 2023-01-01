package fr.zadiho.formation.managers;

import fr.zadiho.formation.Formation;
import fr.zadiho.formation.commands.BroadcastCommand;
import fr.zadiho.formation.commands.SetSpawnCommand;
import fr.zadiho.formation.commands.SpawnCommand;

public class RegistrationManager {

    private final Formation main = Formation.getInstance();

    public void registration() {
        main.getCommand("setspawn").setExecutor(new SetSpawnCommand());
        main.getCommand("spawn").setExecutor(new SpawnCommand());
        main.getCommand("broadcast").setExecutor(new BroadcastCommand());
    }
}
