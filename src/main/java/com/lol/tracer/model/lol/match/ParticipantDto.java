package com.lol.tracer.model.lol.match;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParticipantDto {

	private ParticipantStatsDto stats;
	private int participantId;
	private ParticipantTimelineDto timeline;
	private int teamId;
	private int spell2Id;
	private String highestAchievedSeasonTier;
	private int spell1Id;
	private int championId;
}
