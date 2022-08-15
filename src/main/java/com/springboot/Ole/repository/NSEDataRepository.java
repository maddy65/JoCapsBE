package com.springboot.Ole.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.Ole.Model.NSEData;

public interface NSEDataRepository extends JpaRepository<NSEData, Long> {

}
