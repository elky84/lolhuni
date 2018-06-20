package com.lol.tracer.repository;

import com.lol.tracer.model.Champion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionRepository extends JpaRepository<Champion,Integer>{

}
