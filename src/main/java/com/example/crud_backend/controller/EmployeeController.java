package com.example.crud_backend.controller;

import com.example.crud_backend.entity.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    public void saveEmployee(@RequestBody Employee employee){}
}
