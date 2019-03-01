package com.practice;

public class FizBuzz {
    public static String translate(int number) {
        if (number % 3 == 0) {
            return "fiz";
        }
        return "" + number;
    }
}
