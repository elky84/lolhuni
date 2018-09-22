package com.lol.tracer.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(TargetPk.class)
@Data
public class Target {

	@Id
	@Column
	private long summonerId;
}
