package com.lol.tracer.service;

import java.util.List;

import javax.transaction.Transactional;

import com.lol.tracer.model.Target;
import com.lol.tracer.model.TargetPk;
import com.lol.tracer.model.lol.Summoner;
import com.lol.tracer.repository.TargetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TargetServiceImpl implements TargetService{

	private static final Logger logger = LoggerFactory.getLogger(TargetServiceImpl.class);
	
	@Autowired
	SummonerService summonerSerivce;
	
	@Autowired
    TargetRepository targetRepository;
	
	@Override
	@Transactional
	public Target registTarget(String summonerName) {

		Summoner summoner = summonerSerivce.summonerInfo(summonerName);
		logger.debug("### summoner = {}",summoner);
		
		Target target = new Target();
		target.setSummonerId(summoner.getId());
	
		target = targetRepository.save(target);
		
		return target;
	}
	
	@Override
	public List<Target> getTargets() {
		return targetRepository.findAll();
	}
	
	@Override
	public void removeTarget(long summonerId) {
		try {
			TargetPk targetPk = new TargetPk();
			targetPk.setSummonerId(summonerId);
			targetRepository.delete(targetPk);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.toString());
		}
		
	}
	
	@Override
	public List<Target> getTargetsBySummonerId(long summonerId) {
		return targetRepository.findBySummonerId(summonerId);
	}
}
