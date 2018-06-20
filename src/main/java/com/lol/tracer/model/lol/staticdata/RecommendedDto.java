package com.lol.tracer.model.lol.staticdata;

import java.util.List;

public class RecommendedDto {

	private String map;
	private List<BlockDto> blocks;
	private String champion;
	private String title;
	private boolean priority;
	private String mode;
	private String type;
	public String getMap() {
		return map;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public List<BlockDto> getBlocks() {
		return blocks;
	}
	public void setBlocks(List<BlockDto> blocks) {
		this.blocks = blocks;
	}
	public String getChampion() {
		return champion;
	}
	public void setChampion(String champion) {
		this.champion = champion;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isPriority() {
		return priority;
	}
	public void setPriority(boolean priority) {
		this.priority = priority;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "RecommendedDto [map=" + map + ", blocks=" + blocks + ", champion=" + champion + ", title=" + title
				+ ", priority=" + priority + ", mode=" + mode + ", type=" + type + "]";
	}
	
	
}
