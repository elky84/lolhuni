package com.lol.tracer.service;

import java.util.List;

import com.lol.tracer.model.lol.Summoner;

public interface SummonerService {
	
	/**
	 * 소환사 등록
	 * @param summonerName
	 * @return
	 */
	Summoner registSummoner(String summonerName);
	
	/**
	 * 등록 여부 확인
	 * @param summonerName
	 * @return
	 */
	boolean checkExistsSummoner(String summonerName);
	
	/**
	 * 등록된 소환사
	 * @return
	 */
	List<Summoner> summonerList();
	
	/**
	 * 이름으로 소환사 찾기
	 * @param summonerName
	 * @return
	 */
	Summoner summonerInfo(String summonerName);
	
	/**
	 * 소환사 삭제
	 * @param summonerName
	 */
	void removeSummoner(String summonerName);
}
