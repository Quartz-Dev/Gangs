package me.rockhopper72.gangs;

import me.rockhopper72.commands.GangCommand;

import org.bukkit.plugin.java.JavaPlugin;

public class Gangs extends JavaPlugin {

	@Override
	public void onEnable() {
		this.getCommand("gang").setExecutor(new GangCommand());

	}

	@Override
	public void onDisable() {

	}

}
