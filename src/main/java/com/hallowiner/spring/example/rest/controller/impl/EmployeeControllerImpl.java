package com.hallowiner.spring.example.rest.controller.impl;

import com.hallowiner.spring.example.persistence.model.Employee;
import com.hallowiner.spring.example.persistence.repository.EmployeeRepository;
import com.hallowiner.spring.example.rest.controller.EmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeControllerImpl implements EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value="/employees", method = RequestMethod.POST  )
    @Override
    public void create(@RequestBody Employee employee) {
        System.out.println("Employee: " + employee.toString());
        employeeRepository.save(employee);
    }

    @RequestMapping(value="/employees", method = RequestMethod.GET)
    @Override
    public List<Employee> list() {
        return employeeRepository.findAll();
    }
}
