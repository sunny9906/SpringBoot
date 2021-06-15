package com.example.demo.controller;


import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/code")
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;


    @GetMapping
    public List<Employee> getAllEmployees() {
        System.out.println("getting all employees");
        return employeeRepo.findAll();
    }
}
