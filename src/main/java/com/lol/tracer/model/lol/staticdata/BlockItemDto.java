package com.lol.tracer.model.lol.staticdata;

public class BlockItemDto {

	private int count;
	private int id;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "BlockItemDto [count=" + count + ", id=" + id + "]";
	}
	
	
}
