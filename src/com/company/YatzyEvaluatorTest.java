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
        int [] roll = {1,2,3,4,5};
        boolean isFourofAKind=YatzyEvaluator.isFourOfAKind(roll);
        assertFalse(isFourofAKind);

        int [] roll2 = {1,3,3,3,3};
         isFourofAKind=YatzyEvaluator.isFourOfAKind(roll2);
        assertTrue(isFourofAKind);


    }

    @org.junit.Test
    public void isThreeofAKind() {
        int [] roll = {1,2,3,4,5};
        boolean isThreeofAKind=YatzyEvaluator.isThreeofAKind(roll);
        assertFalse(isThreeofAKind);

        int [] roll2 = {3,1,1,3,3};
        isThreeofAKind=YatzyEvaluator.isThreeofAKind(roll2);
        assertTrue(isThreeofAKind);
    }
}