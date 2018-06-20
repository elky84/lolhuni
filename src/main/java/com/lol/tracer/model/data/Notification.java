package com.lol.tracer.model.data;

public enum Notification {
	
	PEND("PEND"),
	PUSH("PUSH");
	
	private String description;
	
	public String getDescription() {
		return description;
	}

	Notification(String description) {
		this.description = description;
	}
}
