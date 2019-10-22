package com.company;

public class YatzyEvaluator {

    public static boolean isYatzy(int[] roll) {
        for (int i = 0; i < roll.length; i++) {
            for (int j = 1; j < roll.length; j++) {
                if (roll[i] != roll[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isFourOfAKind(int[] roll) {
        int countMatches = 0;
        int index = 0;
        for (int j = 0; j < roll.length; j++) {
            if (countMatches == 4) {
                return true;
            }
            countMatches = 0;
            index++;
            for (int i = 0; i < roll.length; i++) {
                if (index == roll[i]) {
                    countMatches++;
                }
            }
        }
        return false;

    }

    public static boolean isThreeofAKind(int[] roll) {
        int countMatches = 0;
        int index = 0;
        for (int j = 0; j < roll.length; j++) {
            if (countMatches == 3) {
                return true;
            }
            countMatches = 0;
            index++;
            for (int i = 0; i < roll.length; i++) {
                if (index == roll[i]) {
                    countMatches++;
                }
            }
        }
        return false;
    }

    public static boolean isBigStraight(int[] roll) {
        int countMatches = 0;
        int index = 0;
        for (int j = 0; j < roll.length; j++) {
            index=2;

            for (int i = 0; i < roll.length; i++) {
                if (index == roll[i]) {
                    countMatches++;
                }
                index++;
            }
        }
        if (countMatches == 5) {
            return true;
        }
        return false;
    }

    public static boolean isSmallStraight(int[] roll){
        int countMatches = 0;
        int index = 0;
        for (int j = 0; j < roll.length; j++) {
            index=1;

            for (int i = 0; i < roll.length; i++) {
                if (index == roll[i]) {
                    countMatches++;
                    break;
                }
                index++;

            }
        }
        if (countMatches == 5) {
            return true;
        }
        return false;
    }


}
