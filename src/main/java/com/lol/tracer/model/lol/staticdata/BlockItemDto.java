package com.lol.tracer.model.lol.staticdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockItemDto {
	private int count;
	private int id;
}
