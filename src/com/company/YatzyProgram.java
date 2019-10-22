package com.company;

import java.util.Scanner;

public class YatzyProgram
{
    int[] dices = {1,2,3,4,5,6};
    Roll roll = new Roll();

    public void Menu(){
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        System.out.println("1.Roll the dices");
        switch (choice){
            case "1":
                dices = roll.rollDices(dices);
                System.out.println(dices);
                break;

        }
    }
}
