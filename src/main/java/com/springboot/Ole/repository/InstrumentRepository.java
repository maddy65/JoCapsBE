package com.springboot.Ole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.Ole.Model.Instrument;

@Repository
public interface InstrumentRepository extends JpaRepository<Instrument, Long>{

}
