package org.meicode.GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberGuess = rand.nextInt(500) + 1;
        int remainingTries = 0;
        int guess;
        boolean gameEnds = false;

        System.out.println("**************************************************************************************************\n"+
                "****** Welcome to my infamous guess the number game here you will have 5 tries to guess the ******\n"+
                "****** number correctly and you will have a little bit of assistance with each number since ******\n"+
                "****** the range is from numbers 1 - 500, so after the first guess I will notify you if your******\n"+
                "********** guess was to high or to low to guide you in the right direction so good luck! *********\n" +
                "**************************************************************************************************\n");

        System.out.println("What is your name? or should I just call you human.\n");
        String name = sc.next();

        while (!gameEnds){
            System.out.println("Pick a number 1 - 500: ");
            guess = sc.nextInt();
            remainingTries++;

            if (guess == numberGuess){
                gameEnds = true;
            }
            else if(guess < numberGuess){
                System.out.println("Your guess is to low!\n");
            }
            else {
                System.out.println("Your guess is to high\n");
            }
        }

        System.out.println("************\n" +
                "**CONGRATS**\n" +
                "**YOU WIN **\n" +
                "************\n");
        System.out.println("The number was " + numberGuess);
        System.out.println("It took you " + remainingTries + " tries");


    }
}
