package com.example.demo;

import org.springframework.stereotype.Service;

@Service("checkInAccount")
public class CheckInAccont implements CitiBank{

    @Override
    public int getBalance() {
        return 1000;
    }
}
