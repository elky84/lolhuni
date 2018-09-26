package com.lol.tracer.service;

import java.util.List;

import com.lol.tracer.model.Target;

public interface TargetService {

	Target registerTarget(String summonerName);

	List<Target> getTargets();

	void removeTarget(long targetId);

	List<Target> getTargetsBySummonerId(long summonerId);
}
