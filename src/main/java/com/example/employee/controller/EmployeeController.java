package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/Employee")
    private Employee saveEmployee(@RequestBody Employee employee)
    {
        return employeeService.add(employee);
    }

    @GetMapping("/employee/{id}")
    private Employee getEmployee(@PathVariable("id") Long id)
    {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/employee")
    private List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee() ;
    }


    @PutMapping("/EMPLOYEE/{id}")
    private Employee update(@RequestBody Employee employee, Long id)
    {
        employeeService.update(employee,id);
        return employee;
    }
    @DeleteMapping("/demployee/{id}")
    private void deleteEmployee(@PathVariable("id") Long id )
    {
        employeeService.delete(id);
    }

}