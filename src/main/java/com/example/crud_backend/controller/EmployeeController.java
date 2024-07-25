package com.example.crud_backend.controller;

import com.example.crud_backend.entity.Employee;
import com.example.crud_backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save/employee")
    public void saveEmployee(@RequestBody Employee employee){}
}
