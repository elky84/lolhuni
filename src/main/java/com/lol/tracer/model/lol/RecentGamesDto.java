package com.lol.tracer.model.lol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Set;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecentGamesDto {
	private long summonerId;
	private Set<GameDto> games;
}
