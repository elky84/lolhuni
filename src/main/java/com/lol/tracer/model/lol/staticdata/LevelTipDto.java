package com.lol.tracer.model.lol.staticdata;

import java.util.List;

public class LevelTipDto {

	private List<String> effect;
	private List<String> label;
	
	public List<String> getEffect() {
		return effect;
	}
	public void setEffect(List<String> effect) {
		this.effect = effect;
	}
	public List<String> getLabel() {
		return label;
	}
	public void setLabel(List<String> label) {
		this.label = label;
	}
	
	@Override
	public String toString() {
		return "LevelTipDto [effect=" + effect + ", label=" + label + "]";
	}
	
	
}
