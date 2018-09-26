package com.lol.tracer.repository;

import java.util.List;

import com.lol.tracer.model.Target;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TargetRepository extends JpaRepository<Target, Long> {

	List<Target> findBySummonerId(long summonerId);
}
