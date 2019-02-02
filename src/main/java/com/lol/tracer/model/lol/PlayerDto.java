package com.lol.tracer.model.lol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerDto {
	private String currentPlatformId;
	private String summonerName;
	private String matchHistoryUri;
	private String platformId;
	private String currentAccountId;
	private int profileIcon;
	private String summonerId;
	private String accountId;
}
