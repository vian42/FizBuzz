package com.practice;

import java.math.BigInteger;

public class PrintFizBuzzNumber {

    public static void main(String[] args) {
        FizBuzz fizbuzz = new FizBuzz();
        fizbuzz.addToTheTree(new BigInteger("3"), "fiz");
        fizbuzz.addToTheTree(new BigInteger("5"), "buzz");
        fizbuzz.addToTheTree(new BigInteger("6"), "toto");
        StringBuilder ret = new StringBuilder();

        for (int i = 1; i < 100; i++) {

            ret.append(fizbuzz.translate(new BigInteger("" + i)));
            ret.append(" ");
        }
        System.out.println(ret.toString());
    }
}
