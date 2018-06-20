package com.lol.tracer.model.lol.match;

public class CustomTeamStats {

	private int totalKill;
	private int totalDeath;
	private int totalAssists;
	private long totalDamage;
	
	public int getTotalKill() {
		return totalKill;
	}
	public void setTotalKill(int totalKill) {
		this.totalKill = totalKill;
	}
	public int getTotalDeath() {
		return totalDeath;
	}
	public void setTotalDeath(int totalDeath) {
		this.totalDeath = totalDeath;
	}
	public int getTotalAssists() {
		return totalAssists;
	}
	public void setTotalAssists(int totalAssists) {
		this.totalAssists = totalAssists;
	}
	public long getTotalDamage() {
		return totalDamage;
	}
	public void setTotalDamage(long totalDamage) {
		this.totalDamage = totalDamage;
	}
	
	public void addData(int kills, int deaths, int assists, long damages) {
		this.totalKill += kills;
		this.totalDeath += deaths;
		this.totalAssists += assists;
		this.totalDamage += damages;
	}
	
	@Override
	public String toString() {
		return "CustomTeamStats [totalKill=" + totalKill + ", totalDeath=" + totalDeath + ", totalAssists="
				+ totalAssists + ", totalDamage=" + totalDamage + "]";
	}

}
