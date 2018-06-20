package com.lol.tracer.model.lol;

public class PlayerDto {
	
	private String currentPlatformId;
	private String summonerName;
	private String matchHistoryUri;
	private String platformId;
	private long currentAccountId;
	private int profileIcon;
	private long summonerId;
	private long accountId;
	
	public String getCurrentPlatformId() {
		return currentPlatformId;
	}
	public void setCurrentPlatformId(String currentPlatformId) {
		this.currentPlatformId = currentPlatformId;
	}
	public String getSummonerName() {
		return summonerName;
	}
	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}
	public String getMatchHistoryUri() {
		return matchHistoryUri;
	}
	public void setMatchHistoryUri(String matchHistoryUri) {
		this.matchHistoryUri = matchHistoryUri;
	}
	public String getPlatformId() {
		return platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	public long getCurrentAccountId() {
		return currentAccountId;
	}
	public void setCurrentAccountId(long currentAccountId) {
		this.currentAccountId = currentAccountId;
	}
	public int getProfileIcon() {
		return profileIcon;
	}
	public void setProfileIcon(int profileIcon) {
		this.profileIcon = profileIcon;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	
	@Override
	public String toString() {
		return "PlayerDto [currentPlatformId=" + currentPlatformId + ", summonerName=" + summonerName
				+ ", matchHistoryUri=" + matchHistoryUri + ", platformId=" + platformId + ", currentAccountId="
				+ currentAccountId + ", profileIcon=" + profileIcon + ", summonerId=" + summonerId + ", accountId="
				+ accountId + "]";
	}
	

	
	
}
