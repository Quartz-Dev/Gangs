package me.rockhopper72.utils;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.OfflinePlayer;

public class GangManager {

	public ArrayList<Gang> gangs = new ArrayList<>();

	public void getGangByName(String name) {
		// TODO
	}

	public void getGangByOwner(OfflinePlayer owner) {
		// TODO
	}

	public void getGangByUUID(UUID uuid) {
		// TODO
	}

	public void deleteGang(UUID uuid) {
		// TODO
	}

	public void getCurrentGang(OfflinePlayer player) {
		// TODO Find current gang player is in, otherwise null
	}

	public void isInGang(OfflinePlayer player) {
		// TODO test if player is in a gang
	}

	public Gang[] getAllGangs() {
		return (Gang[]) gangs.toArray();
	}

	public void addGang(Gang gang) {
		gangs.add(gang);
	}

}
