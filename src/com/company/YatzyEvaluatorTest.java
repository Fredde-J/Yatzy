package com.company;

import org.junit.Test;

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

    @Test
    public void isBigStraight() {
        int [] roll = {2,2,4,5,3};
        boolean isBigStraight=YatzyEvaluator.isBigStraight(roll);
        assertFalse(isBigStraight);

        int [] roll2 = {2,6,3,4,5};
        isBigStraight=YatzyEvaluator.isBigStraight(roll2);
        assertTrue(isBigStraight);
    }

    @Test
    public void isSmallStraight() {
        int [] roll = {2,2,4,5,3};
        boolean isSmallStraight=YatzyEvaluator.isSmallStraight(roll);
        assertFalse(isSmallStraight);

        int [] roll2 = {1,2,3,4,5};
        isSmallStraight=YatzyEvaluator.isSmallStraight(roll2);
        assertTrue(isSmallStraight);
    }
}