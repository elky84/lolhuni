package com.lol.tracer.model.lol.spectator;

public class Observer {
	private String encryptionKey;

	public String getEncryptionKey() {
		return encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	@Override
	public String toString() {
		return "Observer [encryptionKey=" + encryptionKey + "]";
	}
}
