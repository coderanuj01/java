package coreJavaAssign;

import java.util.Scanner;

public class RepetetionFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any positive number : ");
        int num = keyboard.nextInt();
        int sum = 0;
        while(num >= 0){
            sum = sum + num;
            System.out.println("The sum till now is : " + sum);
            System.out.println("Enter a positive number or negative number to exit : ");
            num = keyboard.nextInt();
        }
        System.out.println("Done ! ");
    }
}
