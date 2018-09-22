package com.lol.tracer.model.lol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameDto {
	private String gameType;
	private long gameId;
	private RawStatsDto stats;
	private int level;
	private long createDate;
	private String gameMode;
	private int mapId;
	private boolean invalid;
	private String subType;
	private int teamId;
	private int ipEarned;
	private List<PlayerDto> fellowPlayers;
	private int championId;
	private int spell1;
	private int spell2;
}
