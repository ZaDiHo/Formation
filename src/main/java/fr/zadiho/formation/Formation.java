package fr.zadiho.formation;

import fr.zadiho.formation.managers.RegistrationManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Formation extends JavaPlugin {

    private static Formation instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        Bukkit.getLogger().info("=====================================");
        Bukkit.getLogger().info("Enabling plugin.");
        Bukkit.getLogger().info("");
        Bukkit.getLogger().info("Have a good day !");
        Bukkit.getLogger().info("=====================================");

        RegistrationManager registrationManager = new RegistrationManager();
        registrationManager.registration();

        super.onEnable();

    }

    public static Formation getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("=====================================");
        Bukkit.getLogger().info("Disabling plugin.");
        Bukkit.getLogger().info("");
        Bukkit.getLogger().info("Have a good day !");
        Bukkit.getLogger().info("=====================================");
        super.onDisable();
    }
}
