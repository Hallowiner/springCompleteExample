package com.hallowiner.spring.example.rest.controller.impl;

import com.hallowiner.spring.example.persistence.model.Employee;
import com.hallowiner.spring.example.persistence.repository.EmployeeRepository;
import com.hallowiner.spring.example.rest.controller.EmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/employees")
public class EmployeeControllerImpl implements EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value="", method = RequestMethod.POST  )
    @Override
    public void create(@RequestBody Employee employee) {
        System.out.println("Employee: " + employee.toString());
        employeeRepository.save(employee);
    }

    @RequestMapping(value="", method = RequestMethod.GET)
    @Override
    public List<Employee> list() {
        return employeeRepository.findAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @Override
    public Employee get(@PathVariable int id) {
        return employeeRepository.findById(id).orElse(null);
    }
}
