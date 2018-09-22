package com.lol.tracer.model.lol.staticdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionSpellDto {

	private String cooldownBurn;
	private String resource;
	private LevelTipDto leveltip;
	private List<SpellVarsDto> vars;
	private String costType;
	private ImageDto image;
	private String sanitizedDescription;
	private String sanitizedTooltip;
	private List<Object> effect;
	private String tooltip;
	private int maxrank;
	private String costBurn;
	private String rangeBurn;
	private Object range;
	private List<Double> cooldown;
	private List<Integer> cost;
	private String key;
	private String description;
	private List<String> effectBurn;
	private List<ImageDto> altimages;
	private String name;
}
