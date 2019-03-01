package com.practice;

import java.math.BigInteger;
import java.util.Set;
import java.util.TreeMap;

public class FizBuzz {

    private static TreeMap<BigInteger,String> map = new TreeMap<>();

    public void addToTheTree(BigInteger number,String translation){
        map.put(number,translation);
    }

    public String translate(BigInteger number) {
        StringBuilder translatedNumber = new StringBuilder();

        Set<BigInteger> key = map.keySet();

        for (BigInteger next : key) {
            if (number.mod(next).equals(new BigInteger("0"))) {
                translatedNumber.append(map.get(next));
            }
        }

        if(translatedNumber.length()==0) {
            return "" + number;
        } else {
            return translatedNumber.toString();
        }
    }
}
