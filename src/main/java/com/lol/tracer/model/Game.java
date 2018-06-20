package com.lol.tracer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

import com.lol.tracer.model.data.Notification;
import com.lol.tracer.model.lol.Summoner;

@Entity(name = "games")
public class Game {
	
	@Id
	@TableGenerator(name = "GEN_GAME_NO", allocationSize = 1)
	@GeneratedValue(generator = "GEN_GAME_NO", strategy = GenerationType.TABLE)
	private long gameNo;
	
	@Column
	private long gameId;
	
	@ManyToOne
	@JoinColumn(name = "SUMMONER_ID")
	private Summoner summoner;
	
	@Enumerated(EnumType.STRING)
	@Column
	private Notification playNotification;
	
	@Enumerated(EnumType.STRING)
	@Column
	private Notification resultNotification;
	
	@Column
	private Date regDate;
	
	@Column
	private long teamId;

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	public Summoner getSummoner() {
		return summoner;
	}

	public void setSummoner(Summoner summoner) {
		this.summoner = summoner;
	}

	public Notification getPlayNotification() {
		return playNotification;
	}

	public void setPlayNotification(Notification playNotification) {
		this.playNotification = playNotification;
	}

	public Notification getResultNotification() {
		return resultNotification;
	}

	public void setResultNotification(Notification resultNotification) {
		this.resultNotification = resultNotification;
	}

	public long getGameNo() {
		return gameNo;
	}

	public void setGameNo(long gameNo) {
		this.gameNo = gameNo;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	@Override
	public String toString() {
		return "Game [gameNo=" + gameNo + ", gameId=" + gameId + ", summoner=" + summoner + ", playNotification="
				+ playNotification + ", resultNotification=" + resultNotification + ", regDate=" + regDate + ", teamId="
				+ teamId + "]";
	}
	
	
	
}
