package com.lol.tracer.model.lol;

import java.util.Set;

public class RecentGamesDto {

	private long summonerId;
	private Set<GameDto> games;
	
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
	public Set<GameDto> getGames() {
		return games;
	}
	public void setGames(Set<GameDto> games) {
		this.games = games;
	}
	
	@Override
	public String toString() {
		return "RecentGamesDto [summonerId=" + summonerId + ", games=" + games + "]";
	}
	
}
