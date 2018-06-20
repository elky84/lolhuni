package com.lol.tracer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class ApiKey {
	

	@Id
	@TableGenerator(name = "GEN_KEY_NO", allocationSize = 1)
	@GeneratedValue(generator = "GEN_KEY_NO", strategy = GenerationType.TABLE)
	private int keyNo;
	
	@Column
	private String keyName;
	
	@Column
	private String keyValue;

	public int getKeyNo() {
		return keyNo;
	}

	public void setKeyNo(int keyNo) {
		this.keyNo = keyNo;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	@Override
	public String toString() {
		return "ApiKey [keyNo=" + keyNo + ", keyName=" + keyName + ", keyValue=" + keyValue + "]";
	}
	
	
}
