package com.company;

import static org.junit.Assert.*;

public class YatzyEvaluatorTest {

    @org.junit.Test
    public void isYatzy() {
        int [] roll = {1,2,3,4,5};
        boolean isYatzy=YatzyEvaluator.isYatzy(roll);
        assertFalse(isYatzy);


        int [] roll2 = {3,3,3,3,3};
        isYatzy=YatzyEvaluator.isYatzy(roll2);
        assertTrue(isYatzy);
    }

    @org.junit.Test
    public void isFourOfAKind() {
        int [] roll = {1,3,3,3,3};
        boolean isFourofAKind=YatzyEvaluator.isFourOfAKind(roll);
        assertTrue(isFourofAKind);

        int [] roll2 = {1,2,3,4,5};
        isFourofAKind=YatzyEvaluator.isFourOfAKind(roll2);
        assertFalse(isFourofAKind);
    }

    @org.junit.Test
    public void isThreeofAKind() {
        assertTrue("true",false);
    }
}