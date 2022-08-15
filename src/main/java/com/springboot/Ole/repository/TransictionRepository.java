package com.springboot.Ole.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.springboot.Ole.Model.Transictions;

///@Repository
public interface TransictionRepository extends JpaRepository<Transictions, Long>{
	
	@Query(value = "SELECT transiction.user_id, transiction.quantity, transiction.instrument_name, transiction.Price, instrument.LTP, instrument.jo_caps FROM instrument INNER JOIN transiction ON instrument.instrument = transiction.instrument_name where transiction.user_id = :id", nativeQuery = true)
    
	List<TransictionProjection> getTransictionsAndInstruments(Long id);
}
