package com.lol.tracer.service;

import java.util.Iterator;

import javax.transaction.Transactional;

import com.lol.tracer.model.Champion;
import com.lol.tracer.repository.ChampionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lol.tracer.model.lol.staticdata.ChampionDto;
import com.lol.tracer.model.lol.staticdata.ChampionListDto;

@Service
public class ChampionServiceImpl implements ChampionService{

	private static final Logger logger = LoggerFactory.getLogger(ChampionServiceImpl.class);
	
	@Autowired
    ChampionRepository championRepository;
	
	@Autowired
	LoLService lolService;
	
	/**
	 * 챔피언 데이터 생성
	 */
	@Override
	@Transactional
	public void registChampionList() {
		
		ChampionListDto championDto = lolService.getChampionList();
		
		Iterator<String> keys = championDto.getData().keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			ChampionDto ChampionData = championDto.getData().get(key);
			
			Champion champion = championRepository.findOne(ChampionData.getId());
			if (champion == null) {
				champion = new Champion();
			}
			champion.setChampionKey(ChampionData.getKey());
			champion.setId(ChampionData.getId());
			champion.setName(ChampionData.getName());
			champion.setEnName(ChampionData.getKey());
			
			championRepository.save(champion);
			
		}
		
		
	}
	
	/**
	 * 챔피언 정보 불러오기
	 */
	@Override
	public Champion getChampionInfo(int championId) {
		Champion champion = null;
		try {
			champion = championRepository.findOne(championId);
		} catch (Exception e) {
			logger.error("### error");
		}
		
		return champion;
	}
}
