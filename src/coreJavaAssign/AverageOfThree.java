package coreJavaAssign;
import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Enter first number : ");
        num1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter second number : ");
        num2 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter third number : ");
        num3 = keyboard.nextInt();
        keyboard.nextLine();

        double average = (double) (num1 + num2 + num3)/3;

        System.out.println("The average of three input is : " + average);
    }
}
