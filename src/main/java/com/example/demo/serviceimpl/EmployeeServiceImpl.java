package com.example.demo.serviceimpl;

import com.example.demo.controller.Employee;
import com.example.demo.controller.EmployeeController;
import com.example.demo.controller.EmployeeRepository;
import com.example.demo.controller.EmployeeBean;
import com.example.demo.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public String save(EmployeeBean employeeBean) {
        logger.info(">>>>>>>>>>>>>>>>>>  Employee Implllll:::"+employeeBean.getSalary());

        return "Employee Added";
    }

    @Override
    public EmployeeBean getEmployee(String name) {

        return null;
    }
}
