package com.springboot.Ole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.Ole.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}