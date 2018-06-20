package com.lol.tracer.service;

import com.lol.tracer.model.lol.RecentGamesDto;
import com.lol.tracer.model.lol.Summoner;
import com.lol.tracer.util.HttpConnectionUtil;
import com.lol.tracer.util.JsonConvertUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lol.tracer.model.lol.match.MatchDto;
import com.lol.tracer.model.lol.spectator.CurrentGameInfo;
import com.lol.tracer.model.lol.staticdata.ChampionListDto;

@Service
public class LoLServiceImpl implements LoLService {
	
	private static final Logger logger = LoggerFactory.getLogger(LoLServiceImpl.class); 
	
	@Value("${baseUrl}")
	String baseUrl;
	
	@Value("${fbUrl}")
	String fbUrl;
	
	@Value("${fbAccessToken}")
	String fbAccessToken;
	
	@Autowired
	ApiKeyService apiKeyService;
	
	/**
	 * 소환사 정보 
	 */
	@Override
	public Summoner getSummonerInfo(String summonerName) {
		
		String lolApiKey = apiKeyService.getApiKeyByKeyName("lol").getKeyValue();
		
		Summoner summoner = null;
		String url = baseUrl + "lol/summoner/v3/summoners/by-name/" + summonerName + "?api_key=" + lolApiKey;
		try {
			String result = HttpConnectionUtil.connectGetJson(url);
			
			if (result != null && result.length() > 0) {
				summoner = (Summoner) JsonConvertUtil.jsonConvertToObject(result, Summoner.class);
			}
			
		} catch (Exception e) {
			logger.error("### error",e);
		}
		
		return summoner;
	}
	
	
	/**
	 * 현재 게임 정보
	 */
	@Override
	public CurrentGameInfo getGameInfo(long summonerId) {
		String lolApiKey = apiKeyService.getApiKeyByKeyName("lol").getKeyValue();
		CurrentGameInfo gameInfo = null;
		String url = baseUrl + "/lol/spectator/v3/active-games/by-summoner/" + summonerId + "?api_key=" + lolApiKey;
		
		try {
			String result = HttpConnectionUtil.connectGetJsonForLoL(url);
			
			if (result != null && result.length() > 0) {
				gameInfo = (CurrentGameInfo) JsonConvertUtil.jsonConvertToObject(result, CurrentGameInfo.class);
			}
			
		} catch (Exception e) {
			logger.debug("### 게임 중이 아닙니다.");
		}
		
		return gameInfo;
	}
	
	/**
	 * 메시지 보내기
	 */
	@Override
	public void sendFbMessage(String message, String phoneNumber) {

		String url = fbUrl + "me/messages?access_token=" + fbAccessToken;
		logger.debug("### url = {}",url);
		HttpConnectionUtil.connectPostJsonForFbMessageSend(url, phoneNumber, message, "5");
	}
	
	/**
	 * 메시지 보내기 (템플릿)
	 */
	@Override
	public void sendFbMessageWithTemplate(String phoneNumber, String imageUrl, String title, String subTitle) {

		String url = fbUrl + "me/messages?access_token=" + fbAccessToken;
		logger.debug("### url = {}",url);
		HttpConnectionUtil.connectPostJsonForFbMessageSendWithTemplate(url,imageUrl, phoneNumber, title,subTitle, "5");
	}
	

	/**
	 * 메시지 보내기 (템플릿 + 버튼)
	 */
	@Override
	public void sendFbMessageWithTemplateButton(String phoneNumber, String imageUrl, String title, String subTitle) {
		
		String url = fbUrl + "me/messages?access_token=" + fbAccessToken;
		logger.debug("### url = {}",url);
		HttpConnectionUtil.connectPostJsonForFbMessageSendWithTemplateButton(url,imageUrl, phoneNumber, title,subTitle);
	}
	
	/**
	 * 최근 게임 정보
	 */
	@Override
	public RecentGamesDto recentGameInfo(long summonerId) {
		RecentGamesDto recentGame = null;
		String lolApiKey = apiKeyService.getApiKeyByKeyName("lol").getKeyValue();
		String url = baseUrl + "api/lol/KR/v1.3/game/by-summoner/" + summonerId + "/recent?api_key=" + lolApiKey;
		try {
			String result = HttpConnectionUtil.connectGetJsonForLoL(url);
			
			if (result != null && result.length() > 0) {
				recentGame = (RecentGamesDto) JsonConvertUtil.jsonConvertToObject(result, RecentGamesDto.class);
			} else {
				logger.debug("### result = null");
			}
		} catch (Exception e) {
			logger.debug("### error",e);
		}
		
		return recentGame;
	}
	
	/**
	 * 게임 상세 정보
	 */
	@Override
	public MatchDto getMatchInfo(long matchId) {
		MatchDto matchDto = null;
		String lolApiKey = apiKeyService.getApiKeyByKeyName("lol").getKeyValue();
		String url = baseUrl + "lol/match/v3/matches/" + matchId + "?api_key=" + lolApiKey;
		try {
			String result = HttpConnectionUtil.connectGetJsonForLoL(url);
			
			if (result != null && result.length() > 0) {
				matchDto = (MatchDto) JsonConvertUtil.jsonConvertToObject(result, MatchDto.class);
			} else {
				logger.debug("### result = null");
			}
		} catch (Exception e) {
			logger.debug("### error",e);
		}
		
		return matchDto;
	}
	
	/**
	 * 챔피언 리스트
	 */
	@Override
	public ChampionListDto getChampionList() {
		ChampionListDto championList = null;
		String lolApiKey = apiKeyService.getApiKeyByKeyName("lol").getKeyValue();
		String url = baseUrl + "/lol/static-data/v3/champions/?locale=ko_KR&tags=image&api_key=" + lolApiKey;
		
		try {
			String result = HttpConnectionUtil.connectGetJsonForLoL(url);
			
			if (result != null && result.length() > 0) {
				championList = (ChampionListDto) JsonConvertUtil.jsonConvertToObject(result, ChampionListDto.class);
			} else {
				logger.debug("### result = null");
			}
		} catch (Exception e) {
			logger.debug("### error",e);
		}
		return championList;
	}
	
	
}
