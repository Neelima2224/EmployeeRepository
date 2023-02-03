package com.example.employee.repo;

import com.example.employee.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee ,Long> {

}
