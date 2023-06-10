package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyAccountDetails {

    @Autowired
    @Qualifier("checkInAccount")
    CitiBank citiBank;

    public int getBalance(){
        return citiBank.getBalance();
    }
}
