package com.example.Controller;
import com.example.model.Employee;
import com.example.Service.UserEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private UserEmployee userEmployee;
    @GetMapping("/emps")
    public List<Employee> allEmp(){
        return userEmployee.findAll();
    }

}
