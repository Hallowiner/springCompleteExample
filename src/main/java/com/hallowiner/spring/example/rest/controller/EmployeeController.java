package com.hallowiner.spring.example.rest.controller;

import com.hallowiner.spring.example.persistence.model.Employee;

import java.util.List;

public interface EmployeeController {

    void create(Employee employee);
    List<Employee> list();
}
