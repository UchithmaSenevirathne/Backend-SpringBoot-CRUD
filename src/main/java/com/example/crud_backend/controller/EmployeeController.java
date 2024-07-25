package com.example.crud_backend.controller;

import com.example.crud_backend.entity.Employee;
import com.example.crud_backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/get/employee")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }
    @GetMapping("/get/employee/{employeeId}")
    public void getEmployeeById(@PathVariable Integer employeeId){}
}
