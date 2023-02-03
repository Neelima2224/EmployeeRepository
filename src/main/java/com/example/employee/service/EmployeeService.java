package com.example.employee.service;


import com.example.employee.model.Employee;
import com.example.employee.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository  employeeRepository ;

    public Employee add(Employee employee)
    {
        return employeeRepository.save(employee );
    }
    public List<Employee> getAllEmployee()
    {
        List<Employee> employee=new ArrayList<Employee>();
        employeeRepository .findAll().forEach(employee1 -> employee.add(employee1 ));
        System.out.println("getting data from db success");
        return employee ;
    }
    public Employee getEmployeeById(Long id)
    {
        return employeeRepository.findById(id).get();
    }

    public Employee  update(Employee  employee,Long id)
    {
        return employeeRepository .save(employee );
    }


    public void delete(Long id)
    {
        employeeRepository.deleteById(id);
    }
}