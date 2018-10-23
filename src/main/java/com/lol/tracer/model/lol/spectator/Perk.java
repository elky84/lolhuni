package com.lol.tracer.model.lol.spectator;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Perk {
    private List<Long> perkIds;
    private long perkStyle;
    private long perkSubStyle;
}
