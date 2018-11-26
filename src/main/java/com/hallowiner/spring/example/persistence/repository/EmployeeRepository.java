package com.hallowiner.spring.example.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository<Employee, Integer> extends JpaRepository<Employee, Integer> {


}
