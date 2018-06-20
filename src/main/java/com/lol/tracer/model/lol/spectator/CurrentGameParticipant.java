package com.lol.tracer.model.lol.spectator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentGameParticipant {
	private long teamId;
	private long spell1Id;
	private long spell2Id;
	private long championId;
	private long profileIconId;
	private String summonerName;
	private boolean bot;
	private long summonerId;

	private List<Object> gameCustomizationObjects;
	private Perk perks;
}
