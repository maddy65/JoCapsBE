package com.springboot.Ole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.Ole.Model.CountryList;

@Repository
public interface CountryRepository extends JpaRepository<CountryList, Long> {

}
