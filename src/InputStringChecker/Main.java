package InputStringChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string you want to check : ");
        String userInput = keyboard.nextLine();

        StringChecker checkerObject = new StringChecker();

        if( checkerObject.checker(userInput) ){
            System.out.println("input string contain all character from a to z");
        }else{
            System.out.println("input string does not contain all character from a to z");
        }
    }
}
