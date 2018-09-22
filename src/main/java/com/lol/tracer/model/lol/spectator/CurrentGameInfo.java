package com.lol.tracer.model.lol.spectator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentGameInfo {
	private long gameId;
	private long mapId;
	private String gameMode;
	private String gameType;
	private long gameQueueConfigId;
	private List<CurrentGameParticipant> participants;
	private Observer observers;
	private String platformId;
	private List<BannedChampion> bannedChampions;
	private long gameStartTime;
	private long gameLength;
}
