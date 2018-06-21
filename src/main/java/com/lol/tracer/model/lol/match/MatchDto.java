package com.lol.tracer.model.lol.match;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchDto {

	private int seasonId;
	private int queueId;
	private long gameId;
	private List<ParticipantIdentityDto> participantIdentities;
	private String gameVersion;
	private String platformId;
	private String gameMode;
	private int mapId;
	private String gameType;
	private List<TeamStatsDto> teams;
	private List<ParticipantDto> participants;
	private long gameDuration;
	private long gameCreation;
}
