package com.practice;

public class FizBuzz {
    public static String translate(int number) {
        if (number % 3 == 0) {
            return "fiz";
        } else if (number % 5 == 0){
            return "buzz";
        }
        return "" + number;
    }
}
