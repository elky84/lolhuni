package com.lol.tracer.model;

import java.io.Serializable;

public class TargetPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8541675530255517420L;

	private long summonerId;
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
		return "TargetPk [summonerId=" + summonerId + ", userNo=" + userNo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (summonerId ^ (summonerId >>> 32));
		result = prime * result + userNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TargetPk other = (TargetPk) obj;
		if (summonerId != other.summonerId)
			return false;
		if (userNo != other.userNo)
			return false;
		return true;
	}
	
	
	
}
