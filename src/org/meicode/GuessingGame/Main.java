package org.meicode.GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Astro Gaming!");
        System.out.println("Enter a username:");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name);

        System.out.println("Ready to play?");
        System.out.println("\t1. yes");
        System.out.println("\t2. no");

        int start = sc.nextInt();

        while(start != 1){          // if no is selected it will keep displaying the menu and storing the user input
            System.out.println("Ready to play?");
            System.out.println("\t1. yes");
            System.out.println("\t2. no");

            start = sc.nextInt();
        }

        Random rand = new Random();
        int numberGuess = rand.nextInt(100) + 1;    //random generator using numbers 1 through 100
        System.out.println("Take a guess: ");
        int guess = sc.nextInt();

        int remainingTries = 0;
        boolean youWin = false;
        boolean youLose = false;

        while(!youLose){         // this loop will not be broken until you either guess the number correctly or you run
            remainingTries++;    // run out of tries which will then set

            if(remainingTries < 5){
                if(guess == numberGuess){
                    youWin = true;
                    youLose = true;
                }
                else if(guess < numberGuess){
                    System.out.println("You have to guess higher!");
                    numberGuess = sc.nextInt();
                }
                else {
                    System.out.println("You have to guess lower!");
                    numberGuess = sc.nextInt();
                }
            }
            else {
                youLose = true;
            }
        }

        if(youWin == true){
            System.out.println("Congrats! your a guessing champ! It only took you " + remainingTries + "tries to get it right");
        }
        else {
            System.out.println("Game Over!");
            System.out.println("The correct number was " + numberGuess);
        }
    }
}