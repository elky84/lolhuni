package com.lol.tracer.service;

import com.lol.tracer.model.lol.RecentGamesDto;
import com.lol.tracer.model.lol.Summoner;
import com.lol.tracer.model.lol.match.MatchDto;
import com.lol.tracer.model.lol.spectator.CurrentGameInfo;
import com.lol.tracer.model.lol.staticdata.ChampionListDto;

public interface LoLService {
	
	Summoner getSummonerInfo(String summonerName);
	
	CurrentGameInfo getGameInfo(long summonerId);
	
	void sendFbMessage(String message, String phoneNumber);
	
	RecentGamesDto recentGameInfo(long summonerId);
	
	MatchDto getMatchInfo(long matchId);

	ChampionListDto getChampionList();
	void sendFbMessageWithTemplate(String phoneNumber, String imageUrl, String title, String subTitle);
	void sendFbMessageWithTemplateButton(String phoneNumber, String imageUrl, String title, String subTitle);
}
