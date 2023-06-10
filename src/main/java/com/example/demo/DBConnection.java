package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

public class DBConnection {

    private String driverName;

    private String dbURL;

    public DBConnection() {
    }

    public void printDBConfigs(){
        System.out.println("Driver Class = " + driverName);
        System.out.println("DB URL = " + dbURL);
    }
}
