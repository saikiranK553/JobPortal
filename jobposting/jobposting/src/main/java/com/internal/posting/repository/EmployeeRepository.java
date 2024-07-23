package com.internal.posting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.internal.posting.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
}
