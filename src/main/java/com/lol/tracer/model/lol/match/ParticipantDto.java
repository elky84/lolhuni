package com.lol.tracer.model.lol.match;

import java.util.List;

public class ParticipantDto {

	private ParticipantStatsDto stats;
	private int participantId;
	private List<RuneDto> runes;
	private ParticipantTimelineDto timeline;
	private int teamId;
	private int spell2Id;
	private List<MasteryDto> masteries;
	private String highestAchievedSeasonTier;
	private int spell1Id;
	private int championId;
	
	public ParticipantStatsDto getStats() {
		return stats;
	}
	public void setStats(ParticipantStatsDto stats) {
		this.stats = stats;
	}
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public List<RuneDto> getRunes() {
		return runes;
	}
	public void setRunes(List<RuneDto> runes) {
		this.runes = runes;
	}
	public ParticipantTimelineDto getTimeline() {
		return timeline;
	}
	public void setTimeline(ParticipantTimelineDto timeline) {
		this.timeline = timeline;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getSpell2Id() {
		return spell2Id;
	}
	public void setSpell2Id(int spell2Id) {
		this.spell2Id = spell2Id;
	}
	public List<MasteryDto> getMasteries() {
		return masteries;
	}
	public void setMasteries(List<MasteryDto> masteries) {
		this.masteries = masteries;
	}
	public String getHighestAchievedSeasonTier() {
		return highestAchievedSeasonTier;
	}
	public void setHighestAchievedSeasonTier(String highestAchievedSeasonTier) {
		this.highestAchievedSeasonTier = highestAchievedSeasonTier;
	}
	public int getSpell1Id() {
		return spell1Id;
	}
	public void setSpell1Id(int spell1Id) {
		this.spell1Id = spell1Id;
	}
	public int getChampionId() {
		return championId;
	}
	public void setChampionId(int championId) {
		this.championId = championId;
	}
	
	@Override
	public String toString() {
		return "ParticipantDto [stats=" + stats + ", participantId=" + participantId + ", runes=" + runes
				+ ", timeline=" + timeline + ", teamId=" + teamId + ", spell2Id=" + spell2Id + ", masteries="
				+ masteries + ", highestAchievedSeasonTier=" + highestAchievedSeasonTier + ", spell1Id=" + spell1Id
				+ ", championId=" + championId + "]";
	}
	
	
	
	
}
