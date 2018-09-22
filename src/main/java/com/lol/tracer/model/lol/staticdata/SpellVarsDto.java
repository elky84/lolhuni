package com.lol.tracer.model.lol.staticdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpellVarsDto {
	private String ranksWith; 
	private String dyn;
	private String link;
	private List<Double> coeff;
	private String key;
}
