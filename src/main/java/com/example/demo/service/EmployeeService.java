package com.example.demo.service;

import com.example.demo.controller.EmployeeBean;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    public String save(EmployeeBean employeeBean);
    public EmployeeBean getEmployee(String name);

}
