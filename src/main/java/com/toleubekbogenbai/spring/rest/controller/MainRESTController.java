package com.toleubekbogenbai.spring.rest.controller;

import com.toleubekbogenbai.spring.rest.entity.Employee;
import com.toleubekbogenbai.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainRESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployee(){
        List<Employee>allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }


}
