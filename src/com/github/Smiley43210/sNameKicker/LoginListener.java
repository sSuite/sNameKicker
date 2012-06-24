package com.github.Smiley43210.sNameKicker;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public final class LoginListener implements Listener{

	SNameKicker ak;

	public LoginListener(SNameKicker ak){
		this.ak = ak;
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		boolean con = e.getPlayer().getPlayerListName().equalsIgnoreCase("Player");
		if (con){
			e.getPlayer().kickPlayer("The name \"Player\" is not allowed! Use a cracked launcher instead.");
		}
		boolean con2 = e.getPlayer().getPlayerListName().contains(" ");
		if (con2){
			e.getPlayer().kickPlayer("Do not use spaces in names!");
		}
	}

}
