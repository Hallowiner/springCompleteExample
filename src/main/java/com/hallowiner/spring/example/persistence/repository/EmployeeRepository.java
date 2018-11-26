package com.hallowiner.spring.example.persistence.repository;

import com.hallowiner.spring.example.persistence.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
