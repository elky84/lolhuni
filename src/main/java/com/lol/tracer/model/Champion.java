package com.lol.tracer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Champion {

	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String enName;
	
	@Column
	private String championKey;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getChampionKey() {
		return championKey;
	}

	public void setChampionKey(String championKey) {
		this.championKey = championKey;
	}

	@Override
	public String toString() {
		return "Champion [id=" + id + ", name=" + name + ", enName=" + enName + ", championKey=" + championKey + "]";
	}
	
	
	
}
