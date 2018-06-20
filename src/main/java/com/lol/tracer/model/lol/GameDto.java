package com.lol.tracer.model.lol;

import java.util.List;

/**
 * 삭제예정
 * @author hj
 *
 */
public class GameDto {

	private String gameType;
	private long gameId;
	private RawStatsDto stats;
	private int level;
	private long createDate;
	private String gameMode;
	private int mapId;
	private boolean invalid;
	private String subType;
	private int teamId;
	private int ipEarned;
	private List<PlayerDto> fellowPlayers;
	private int championId;
	private int spell1;
	private int spell2;
	
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public long getGameId() {
		return gameId;
	}
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}
	public RawStatsDto getStats() {
		return stats;
	}
	public void setStats(RawStatsDto stats) {
		this.stats = stats;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}
	public String getGameMode() {
		return gameMode;
	}
	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}
	public int getMapId() {
		return mapId;
	}
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}
	public boolean isInvalid() {
		return invalid;
	}
	public void setInvalid(boolean invalid) {
		this.invalid = invalid;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getIpEarned() {
		return ipEarned;
	}
	public void setIpEarned(int ipEarned) {
		this.ipEarned = ipEarned;
	}
	public List<PlayerDto> getFellowPlayers() {
		return fellowPlayers;
	}
	public void setFellowPlayers(List<PlayerDto> fellowPlayers) {
		this.fellowPlayers = fellowPlayers;
	}
	public int getChampionId() {
		return championId;
	}
	public void setChampionId(int championId) {
		this.championId = championId;
	}
	public int getSpell1() {
		return spell1;
	}
	public void setSpell1(int spell1) {
		this.spell1 = spell1;
	}
	public int getSpell2() {
		return spell2;
	}
	public void setSpell2(int spell2) {
		this.spell2 = spell2;
	}
	
	@Override
	public String toString() {
		return "GameDto [gameType=" + gameType + ", gameId=" + gameId + ", stats=" + stats + ", level=" + level
				+ ", createDate=" + createDate + ", gameMode=" + gameMode + ", mapId=" + mapId + ", invalid=" + invalid
				+ ", subType=" + subType + ", teamId=" + teamId + ", ipEarned=" + ipEarned + ", fellowPlayers="
				+ fellowPlayers + ", championId=" + championId + ", spell1=" + spell1 + ", spell2=" + spell2 + "]";
	}
	
	
}
