package com.springboot.Ole.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.Ole.Model.DailyCalls;

public interface DailCallRepository extends JpaRepository<DailyCalls, Long> {
	
	@Query(value = "select * from daily_calls where exchange =:exchange order by daily_date desc limit 25", nativeQuery = true)
	List<DailyCalls> getExchangeData(String exchange);
}
