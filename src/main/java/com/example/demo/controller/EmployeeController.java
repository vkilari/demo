package com.example.demo.controller;

import com.example.demo.service.EmployeeService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@RestController
@RequestMapping("employee")
public class EmployeeController {

   Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/addEmployee")
    public String addEmployee(@RequestBody EmployeeBean employeeBean){
        logger.info(">>>>>>>>>>>>>>>>>> Add Employee:::"+employeeBean.getName());
        logger.info(">>>>>>>>>>>>>>>>>> Add Employee:::"+employeeBean.getEmployee_id());
        logger.info(">>>>>>>>>>>>>>>>>> Add Employee:::"+employeeBean.getTechnology());
        logger.info(">>>>>>>>>>>>>>>>>> Add Employee:::"+employeeBean.getGroup());
        logger.info(">>>>>>>>>>>>>>>>>> Add Employee:::"+employeeBean.getSalary());
        employeeService.save(employeeBean);
        return "Employee Added";
    }

    @GetMapping("/getEmployee")
    public MappingJacksonValue getEmployee(){
        String[] technologies = {"Java", ".Net", "Python", "SAP", "Java2"};
        List<String> techList = Arrays.asList(technologies).stream().filter(x -> x.startsWith("J")).collect(Collectors.toList());
        EmployeeBean employee = EmployeeBean.builder().employee_id(123).name("Venkat").salary(123456).group("IT").technology(techList).build();
        SimpleBeanPropertyFilter simpleBeanPropertyFilter =
        SimpleBeanPropertyFilter.serializeAllExcept("group");

        FilterProvider filterProvider = new SimpleFilterProvider()

                .addFilter("userFilter", simpleBeanPropertyFilter);
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(employee);

        mappingJacksonValue.setFilters(filterProvider);

        return mappingJacksonValue;
    }

    @GetMapping(value = "/test")
    public String test() {

        return  "Welcome";
    }
}
