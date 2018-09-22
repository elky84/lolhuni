package com.lol.tracer.model.lol.staticdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionListDto {
	private Map<String,String> keys;
	private Map<String,ChampionDto> data;
	private String version;
	private String type;
	private String format;
}
