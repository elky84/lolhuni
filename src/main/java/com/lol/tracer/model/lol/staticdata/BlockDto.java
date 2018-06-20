package com.lol.tracer.model.lol.staticdata;

import java.util.List;

public class BlockDto {

	private List<BlockItemDto> items;
	private boolean recMath;
	private String type;
	
	public List<BlockItemDto> getItems() {
		return items;
	}
	public void setItems(List<BlockItemDto> items) {
		this.items = items;
	}
	public boolean isRecMath() {
		return recMath;
	}
	public void setRecMath(boolean recMath) {
		this.recMath = recMath;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "BlockDto [items=" + items + ", recMath=" + recMath + ", type=" + type + "]";
	}
	
	
}
