package com.example.demo.controller;


import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
@JsonFilter("userFilter")
public class EmployeeBean {

    private Integer employee_id;
    private String name;
    private List<String> technology;
    private String group;
    private Integer salary;

}
