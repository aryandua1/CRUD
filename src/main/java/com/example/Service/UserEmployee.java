package com.example.Service;
import com.example.Repository.EmployeeRepository;
import com.example.model.Employee;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserEmployee {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        ArrayList<Employee> emp = (ArrayList<Employee>) employeeRepository.findAll();
        ArrayList<Employee> employees = emp;
        return employees;
    }

}
