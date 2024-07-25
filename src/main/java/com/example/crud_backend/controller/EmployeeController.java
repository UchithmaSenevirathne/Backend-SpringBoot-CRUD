package com.example.crud_backend.controller;

import com.example.crud_backend.entity.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @PostMapping("/save/employee")
    public void saveEmployee(@RequestBody Employee employee){}
}
