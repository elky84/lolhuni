package com.lol.tracer.model.lol.staticdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageDto {

	private String full;
	private String group;
	private String sprite;
	private int h;
	private int w;
	private int y;
	private int x;
}
