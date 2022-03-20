package coreJavaAssign;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int userInput = keyboard.nextInt();

        if(userInput%3 == 0){
            System.out.println("YES it is divisible by 3 : ");
        }else{
            System.out.println("NO it is not divisible by 3 : ");
        }

    }
}
