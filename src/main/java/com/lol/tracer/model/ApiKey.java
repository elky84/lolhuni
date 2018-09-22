package com.lol.tracer.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Data
@Entity
public class ApiKey {

	@Id
	@TableGenerator(name = "GEN_KEY_NO", allocationSize = 1)
	@GeneratedValue(generator = "GEN_KEY_NO", strategy = GenerationType.TABLE)
	private int keyNo;
	
	@Column
	private String keyName;
	
	@Column
	private String keyValue;
}
