package com.lol.tracer.model.lol.staticdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionDto {

	private InfoDto info;
	private StatsDto stats;
	private String name;
	private String title;
	private ImageDto image;
	private List<String> tags;
	private String partype;
	private Long key;
	private String lore;
	private String id;
	private String blurb;
}
