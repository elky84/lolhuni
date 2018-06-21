package com.lol.tracer.service;

import com.lol.tracer.model.lol.RecentGamesDto;
import com.lol.tracer.model.lol.Summoner;
import com.lol.tracer.model.lol.match.MatchDto;
import com.lol.tracer.model.lol.spectator.CurrentGameInfo;
import com.lol.tracer.model.lol.staticdata.ChampionListDto;

public interface LoLService {
	
	Summoner getSummonerInfo(String summonerName);
	
	CurrentGameInfo getGameInfo(long summonerId);
	
	void sendLineMessage(String message, String imgUrl);
	
	RecentGamesDto recentGameInfo(long summonerId);
	
	MatchDto getMatchInfo(long matchId);

	ChampionListDto getChampionList();
}
