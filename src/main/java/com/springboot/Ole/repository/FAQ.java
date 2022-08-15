package com.springboot.Ole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.Ole.Model.FAQList;

@Repository
public interface FAQ extends JpaRepository<FAQList, Long> {

}
