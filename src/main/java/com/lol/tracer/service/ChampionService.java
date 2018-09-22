package com.lol.tracer.service;

import com.lol.tracer.model.Champion;

public interface ChampionService {

	void registerChampionList();

	Champion getChampionInfo(long key);
}
