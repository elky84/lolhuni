package com.lol.tracer.model.lol.match;

import java.util.List;

public class TeamStatsDto {
	
	private boolean firstDragon;
	private boolean firstInhibitor;
	private List<TeamBansDto> bans;
	private int baronKills;
	private boolean firstRiftHerald;
	private boolean firstBaron;
	private int riftHeraldKills;
	private boolean firstBlood;
	private int teamId;
	private boolean firstTower;
	private int vilemawKills;
	private int inhibitorKills;
	private int towerKills;
	private int dominionVictoryScore;
	private String win;
	private int dragonKills;
	
	public boolean isFirstDragon() {
		return firstDragon;
	}
	public void setFirstDragon(boolean firstDragon) {
		this.firstDragon = firstDragon;
	}
	public boolean isFirstInhibitor() {
		return firstInhibitor;
	}
	public void setFirstInhibitor(boolean firstInhibitor) {
		this.firstInhibitor = firstInhibitor;
	}
	public List<TeamBansDto> getBans() {
		return bans;
	}
	public void setBans(List<TeamBansDto> bans) {
		this.bans = bans;
	}
	public int getBaronKills() {
		return baronKills;
	}
	public void setBaronKills(int baronKills) {
		this.baronKills = baronKills;
	}
	public boolean isFirstRiftHerald() {
		return firstRiftHerald;
	}
	public void setFirstRiftHerald(boolean firstRiftHerald) {
		this.firstRiftHerald = firstRiftHerald;
	}
	public boolean isFirstBaron() {
		return firstBaron;
	}
	public void setFirstBaron(boolean firstBaron) {
		this.firstBaron = firstBaron;
	}
	public int getRiftHeraldKills() {
		return riftHeraldKills;
	}
	public void setRiftHeraldKills(int riftHeraldKills) {
		this.riftHeraldKills = riftHeraldKills;
	}
	public boolean isFirstBlood() {
		return firstBlood;
	}
	public void setFirstBlood(boolean firstBlood) {
		this.firstBlood = firstBlood;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public boolean isFirstTower() {
		return firstTower;
	}
	public void setFirstTower(boolean firstTower) {
		this.firstTower = firstTower;
	}
	public int getVilemawKills() {
		return vilemawKills;
	}
	public void setVilemawKills(int vilemawKills) {
		this.vilemawKills = vilemawKills;
	}
	public int getInhibitorKills() {
		return inhibitorKills;
	}
	public void setInhibitorKills(int inhibitorKills) {
		this.inhibitorKills = inhibitorKills;
	}
	public int getTowerKills() {
		return towerKills;
	}
	public void setTowerKills(int towerKills) {
		this.towerKills = towerKills;
	}
	public int getDominionVictoryScore() {
		return dominionVictoryScore;
	}
	public void setDominionVictoryScore(int dominionVictoryScore) {
		this.dominionVictoryScore = dominionVictoryScore;
	}
	public String getWin() {
		return win;
	}
	public void setWin(String win) {
		this.win = win;
	}
	public int getDragonKills() {
		return dragonKills;
	}
	public void setDragonKills(int dragonKills) {
		this.dragonKills = dragonKills;
	}
	@Override
	public String toString() {
		return "TeamStatsDto [firstDragon=" + firstDragon + ", firstInhibitor=" + firstInhibitor + ", bans=" + bans
				+ ", baronKills=" + baronKills + ", firstRiftHerald=" + firstRiftHerald + ", firstBaron=" + firstBaron
				+ ", riftHeraldKills=" + riftHeraldKills + ", firstBlood=" + firstBlood + ", teamId=" + teamId
				+ ", firstTower=" + firstTower + ", vilemawKills=" + vilemawKills + ", inhibitorKills=" + inhibitorKills
				+ ", towerKills=" + towerKills + ", dominionVictoryScore=" + dominionVictoryScore + ", win=" + win
				+ ", dragonKills=" + dragonKills + "]";
	}
	
	
}
