package com.example.demo;

import org.springframework.stereotype.Service;

@Service("savingAccount")
public class SavingAccount implements CitiBank{

    @Override
    public int getBalance() {
        return 2000;
    }
}
