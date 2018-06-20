package com.lol.tracer.schedule;

import java.util.List;

import com.lol.tracer.model.Game;
import com.lol.tracer.model.Target;
import com.lol.tracer.model.lol.Summoner;
import com.lol.tracer.service.SummonerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lol.tracer.model.data.Notification;
import com.lol.tracer.model.lol.spectator.CurrentGameInfo;
import com.lol.tracer.service.ApiKeyService;
import com.lol.tracer.service.GameService;
import com.lol.tracer.service.LoLService;
import com.lol.tracer.service.TargetService;
import com.lol.tracer.service.UserService;

@Component
public class ScheduledTasks {
	
	 private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
	 
	 @Autowired
	 LoLService lolService;
	 
	 @Autowired
	 ApiKeyService apiKeyService;
	 
	 @Autowired
     SummonerService summonerService;
	 
	 @Autowired
	 TargetService targetService;
	 
	 @Autowired
	 UserService userService;
	 
	 @Autowired
	 GameService gameService;
	 
	 /**
	  * 1분마다 게임 체크 (db)
	  */
	 @Scheduled(fixedRate = 60000)
	 public void checkCurrentGame() {
		
		CurrentGameInfo gameInfo = null;
		List<Summoner> summoners = summonerService.summonerList();
		for (Summoner summoner : summoners) {
			
			List<Target> targets = targetService.getTargetsBySummonerId(summoner.getId());
			
			if (targets == null || targets.size() < 1) {
				continue;
			}
			
			gameInfo = lolService.getGameInfo(summoner.getId());
			if (gameInfo == null) {
				logger.debug("### {}님은 현재 게임 중이 아닙니다.", summoner.getName());
				
			} else {
				
				Game game = gameService.SearchByGameIdAndSummonerAndPlayNotifiaction(gameInfo.getGameId(),summoner, Notification.PUSH);
				
				if (game == null) {
					
					gameService.sendGameStart(gameInfo, summoner, targets);
					
				} else {
					
					logger.debug("### {}님은 현재 게임 중입니다.",summoner.getName());
					
				}
				
			}
			
			gameService.sendGameResult(summoner, targets);
			
		}
	 }
}
