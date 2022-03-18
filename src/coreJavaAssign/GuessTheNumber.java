package coreJavaAssign;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int numberToguess = random.nextInt(100);
        numberToguess++;

        System.out.println("This is a guess game : ");

        System.out.println("Enter your Guess : ");
        int guess = keyboard.nextInt();
        int numberOfGuess = 1;

        while(guess != numberOfGuess){
            if(guess < numberToguess){
                System.out.println("your guess was too low");
            }else if(guess > numberToguess){
                System.out.println("your guess was too high");
            }else{
                break;
            }
            guess = keyboard.nextInt();
            numberOfGuess++;
        }

        System.out.println("Congratulation you have guessed the coorect number in " + numberOfGuess + " Guesses");
        System.out.println("the correct number was " + numberToguess);
    }
}
