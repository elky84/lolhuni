package com.lol.tracer.repository;

import java.util.List;

import com.lol.tracer.model.Game;
import com.lol.tracer.model.lol.Summoner;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lol.tracer.model.data.Notification;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	Game findByGameIdAndSummonerAndPlayNotification(long gameId, Summoner summoner, Notification notification);
	List<Game> findBySummonerAndPlayNotificationAndResultNotification(Summoner summoner, Notification notification, Notification resultNotification);
}
