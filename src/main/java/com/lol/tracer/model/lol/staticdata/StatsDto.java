package com.lol.tracer.model.lol.staticdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatsDto {

	private double armorperlevel;
	private double hpperlevel;
	private double attackdamage;
	private double mpperlevel;
	private double attackspeedoffset;
	private double armor;
	private double hp;
	private double hpregenperlevel;
	private double spellblock;
	private double attackrange;
	private double movespeed;
	private double attackdamageperlevel;
	private double mpregenperlevel;
	private double mp;
	private double spellblockperlevel;
	private double crit;
	private double mpregen;
	private double attackspeedperlevel;
	private double hpregen;
	private double critperlevel;
}
