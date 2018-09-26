package com.lol.tracer.model;

import com.lol.tracer.model.lol.Summoner;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Target {

	@Id
	@Column
	@GeneratedValue
	private long targetId;

	@OneToOne
	@JoinColumn(name = "SUMMONER_ID")
	private Summoner summoner;
}
