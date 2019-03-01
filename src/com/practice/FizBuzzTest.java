package com.practice;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class FizBuzzTest {

    private static FizBuzz fizbuzz = new FizBuzz();

    @Before
    public void parameterizeFizBuzz(){
        fizbuzz.addToTheTree(new BigInteger("3"),"fiz");
        fizbuzz.addToTheTree(new BigInteger("5"),"buzz");
    }

    @Test
    public void expect_same_number() {
        BigInteger aNumber = new BigInteger("1");
        String sameNumberAsString = fizbuzz.translate(aNumber);
        assertEquals("1", sameNumberAsString);
    }

    @Test
    public void expect_fiz_given_multiple_of_3() {
        BigInteger aNumber = new BigInteger("3");
        String result = fizbuzz.translate(aNumber);
        assertEquals("fiz", result);
    }

    @Test
    public void expect_buzz_given_multiple_of_5() {
        BigInteger aNumber = new BigInteger("5");
        String result = fizbuzz.translate(aNumber);
        assertEquals("buzz", result);
    }

    @Test
    public void expect_fizbuzz_given_multiple_of_15() {
        BigInteger aNumber = new BigInteger("15");
        String result = fizbuzz.translate(aNumber);
        assertEquals("fizbuzz", result);
    }
}