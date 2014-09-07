package me.rockhopper72.utils;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.OfflinePlayer;

public class Gang {

	OfflinePlayer owner;
	ArrayList<OfflinePlayer> members = new ArrayList<OfflinePlayer>();
	String name;
	UUID gangUUID;

	public Gang(OfflinePlayer owner, String name) {
		this.owner = owner;
		this.name = name;
	}

	public OfflinePlayer getOwner() {
		return this.owner;
	}

	public void setOwner(OfflinePlayer owner) {
		this.owner = owner;
	}

	public OfflinePlayer[] getMembers() {
		return (OfflinePlayer[]) members.toArray();
	}

	public void addMember(OfflinePlayer player) {
		members.add(player);
	}

	public void removeMember(OfflinePlayer player) {
		members.remove(player);
	}

	public void removeAllMembers() {
		members.clear();
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public String getName() {
		return this.name;
	}

	public UUID getUUID() {
		return this.gangUUID;
	}

	protected void setUUID(UUID uuid) {
		this.gangUUID = uuid;
	}

	@Override
	public String toString() {
		return this.name + this.gangUUID;
	}

}
