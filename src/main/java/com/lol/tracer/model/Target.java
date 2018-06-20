package com.lol.tracer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(TargetPk.class)
public class Target {

	@Id
	@Column
	private long summonerId;
	
	@Id
	@Column
	private int userNo;

	public long getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	@Override
	public String toString() {
		return "Target [summonerId=" + summonerId + ", userNo=" + userNo + "]";
	}
	
	

	
	
}
