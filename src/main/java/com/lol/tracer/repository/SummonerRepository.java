package com.lol.tracer.repository;

import com.lol.tracer.model.lol.Summoner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SummonerRepository extends JpaRepository<Summoner, Long> {
	
	Summoner findByName(String Name);
}
