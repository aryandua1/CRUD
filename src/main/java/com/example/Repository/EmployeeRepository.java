package com.example.Repository;

import com.example.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class EmployeeRepository implements CrudRepository<Employee, Integer> {

}
