package com.lol.tracer.model.fb;

public class Recipient {
	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Recipient  [phoneNumber=" + phoneNumber + "]";
	}
	
}
