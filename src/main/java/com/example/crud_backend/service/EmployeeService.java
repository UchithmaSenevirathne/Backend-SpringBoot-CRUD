package com.example.crud_backend.service;

import com.example.crud_backend.dao.EmployeeDao;
import com.example.crud_backend.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    public void saveEmployee(Employee employee){}
}
