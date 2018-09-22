package com.lol.tracer.model.lol.staticdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PassiveDto {
	private ImageDto image;
	private String sanitizedDescription;
	private String name;
	private String description;
}
