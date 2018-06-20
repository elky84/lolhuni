package com.lol.tracer.service;

import java.util.List;

import com.lol.tracer.model.Target;

public interface TargetService {

	Target registTarget(String name, String summonerName);
	List<Target> getTargets();
	void removeTarget(long summonerId,int userNo);
	List<Target> getTargetsBySummonerId(long summonerId);
}
