package com.lol.tracer.model.lol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Summoner {
	@Id
	@Column
	private String id;

	@Column
	private String accountId;

	@Column
	private String name;

	@Column
	private String puuid;

	@Column
	private int profileIconId;

	@Column
	private Date revisionDate;

	@Column
	private long summonerLevel;
}
