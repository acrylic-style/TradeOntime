package com.github.mori01231.tradeontime;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class TradeOntime extends JavaPlugin {

    private static TradeOntime instance;
    public TradeOntime (){
        instance = this;
    }
    public static TradeOntime getInstance() {
        return instance;
    }


    @Override
    public void onEnable() {
        getLogger().info("BetaTest has been enabled.");
        this.getCommand("tradeontime").setExecutor(new OntimeToOntimeTicket());
        this.getCommand("tradeticket").setExecutor(new OntimeTicketToOntime());


        this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
