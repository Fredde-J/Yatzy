package com.company;

public class YatzyEvaluator {

    public static boolean isYatzy(int[] roll) {
        for (int i = 0;i<roll.length;i++) {
            for (int j = 1; i < roll.length;i++){
                if(roll[i] != roll[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isFourOfAKind(int[] roll){
        return false;
    }
    public static boolean isThreeofAKind(int[] roll){
        return false;
    }

}
