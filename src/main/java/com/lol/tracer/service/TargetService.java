package com.lol.tracer.service;

import java.util.List;

import com.lol.tracer.model.Target;

public interface TargetService {

	Target registTarget(String summonerName);

	List<Target> getTargets();

	void removeTarget(long summonerId);

	List<Target> getTargetsBySummonerId(long summonerId);
}
