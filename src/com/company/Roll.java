package com.company;

import java.util.Random;

public class Roll {
    Random rand = new Random();
    public int[] rollDices(int [] dices){
        for(int i=0;i<dices.length;i++){
            dices[i]=rand.nextInt(6);

        }
        return dices;
    }
}
