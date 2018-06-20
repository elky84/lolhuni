package com.lol.tracer.service;

import java.util.List;

import com.lol.tracer.model.Game;
import com.lol.tracer.model.Target;
import com.lol.tracer.model.data.Notification;
import com.lol.tracer.model.lol.Summoner;
import com.lol.tracer.model.lol.spectator.CurrentGameInfo;

public interface GameService {
	
	/**
	 * 게임 시작 메시지 알림 보낸 여부 확인
	 * @param gameId
	 * @param summoner
	 * @param notification
	 * @return
	 */
	Game SearchByGameIdAndSummonerAndPlayNotifiaction(long gameId, Summoner summoner, Notification notification);
	
	/**
	 * 게임 결과 메시지 알림 보낸 여부 확인
	 * @param summoner
	 * @param notification
	 * @param notification2
	 * @return
	 */
	List<Game> SearchBySummonerAndPlayNotifiactionAndResultNotification(Summoner summoner, Notification notification,Notification notification2);
	
	/**
	 * 저장
	 * @param gameId
	 * @param summoner
	 * @return
	 */
	Game saveGame(CurrentGameInfo gameInfo,Summoner summoner);
	
	/**
	 * 저장
	 * @param game
	 */
	void saveGame(Game game);
	
	/**
	 * 게임 결과 보내기
	 */
	void sendGameResult(Summoner summoner, List<Target> targets);
	
	/**
	 * 게임 시작 알림 보내기
	 */
	void sendGameStart(CurrentGameInfo gameInfo, Summoner summoner, List<Target> targets);
}
