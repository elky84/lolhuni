package com.lol.tracer.model.lol.spectator;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentGameParticipant {
	private long teamId;

	private long spell1Id;

	private long spell2Id;

	private long championId;

	private long profileIconId;

	private String summonerName;

	private boolean bot;

	private String summonerId;

	private List<Object> gameCustomizationObjects;
	private Perk perks;
}
