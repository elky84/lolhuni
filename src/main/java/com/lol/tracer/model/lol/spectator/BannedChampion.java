package com.lol.tracer.model.lol.spectator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BannedChampion {
	private long championId;
	private long teamId;
	private int pickTurn;
}
