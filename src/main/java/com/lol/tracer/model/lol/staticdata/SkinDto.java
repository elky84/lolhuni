package com.lol.tracer.model.lol.staticdata;

public class SkinDto {

	private int num;
	private String name;
	private int id;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "SkinDto [num=" + num + ", name=" + name + ", id=" + id + "]";
	}
	
	
}
