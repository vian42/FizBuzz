package com.practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizBuzzTest {

    @Test
    public void expect_same_number() {
        int aNumber = 1;

        String sameNumberAsString = FizBuzz.translate(aNumber);

        assertEquals("1", sameNumberAsString);
    }

    @Test
    public void expect_fiz_given_multiple_of_3() {
        int aNumber = 3;
        String result = FizBuzz.translate(aNumber);
        assertEquals("fiz", result);
        assertEquals("fiz", FizBuzz.translate(6));
        assertEquals("fiz", FizBuzz.translate(9));
    }

}