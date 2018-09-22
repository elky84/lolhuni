package com.lol.tracer.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Champion {

	@Id
	@Column
	private long championKey;
	
	@Column
	private String name;

	@Column
	private String championId;
}
