package com.lol.tracer.model.lol.match;

public class MasteryDto {

	private int masteryId;
	private int rank;
	
	public int getMasteryId() {
		return masteryId;
	}
	public void setMasteryId(int masteryId) {
		this.masteryId = masteryId;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "MasteryDto [masteryId=" + masteryId + ", rank=" + rank + "]";
	}
	
	
}
