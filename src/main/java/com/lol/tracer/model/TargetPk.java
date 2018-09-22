package com.lol.tracer.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TargetPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8541675530255517420L;

	private long summonerId;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		return prime * result + (int) (summonerId ^ (summonerId >>> 32));
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
		return true;
	}
	
	
	
}
