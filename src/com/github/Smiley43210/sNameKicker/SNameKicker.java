package com.github.Smiley43210.sNameKicker;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SNameKicker extends JavaPlugin{

	PluginManager pm = Bukkit.getServer().getPluginManager();
	private LoginListener ll = new LoginListener(this);

	public void onEnable() {
		pm.registerEvents(ll, this);
		getLogger().info("sNameKicker v0.0.1 loaded!");
	}

	public void onDisable() {
		getLogger().info("sNameKicker v0.0.1 unloaded!");
	}

}
