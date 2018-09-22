package com.lol.tracer.model.lol.staticdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionListDto {

	private Map<String,String> keys;
	private Map<String,ChampionDto> data;
	private String version;
	private String type;
	private String format;
	public Map<String, String> getKeys() {
		return keys;
	}
	public void setKeys(Map<String, String> keys) {
		this.keys = keys;
	}
	public Map<String, ChampionDto> getData() {
		return data;
	}
	public void setData(Map<String, ChampionDto> data) {
		this.data = data;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	@Override
	public String toString() {
		return "ChampionListDto [keys=" + keys + ", data=" + data + ", version=" + version + ", type=" + type
				+ ", format=" + format + "]";
	}
	
	
	
}
