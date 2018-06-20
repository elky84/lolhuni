package com.lol.tracer.service;

import com.lol.tracer.model.Champion;

public interface ChampionService {

	void registChampionList();
	Champion getChampionInfo(int championId);
}
