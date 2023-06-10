package com;

import java.util.HashMap;
import java.util.Map;

public class RomanConversion {

    private int romanNumber;
    private int romanValue;
    private Map<String, Integer> numbers = new HashMap<>();


    public RomanConversion(Map<String, Integer> numbers) {
        this.numbers = numbers;
    }


    public Map<String, Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(Map<String, Integer> numbers) {
        this.numbers = numbers;
    }
}
