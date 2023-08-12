package com.bootcoding.employee.service;

import com.bootcoding.employee.helper.EmployeeHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class EmployeeService {
    @Autowired
    private EmployeeHelper employeeHelper;

    public String getNewEmployee(){

        return employeeHelper.newEmployee();
    }

    public List<String> getNewEmployee(int quantity) {
        List<String> employees = new ArrayList<>();
        for (int i = 0; i < quantity; i++){
            String newEmployee = employeeHelper.newEmployee();
            employees.add(newEmployee);
        }
        return employees;
    }
}
