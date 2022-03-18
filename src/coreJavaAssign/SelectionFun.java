package coreJavaAssign;

import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        System.out.println("Enter your age : ");
        age = keyboard.nextInt();
        keyboard.nextLine();
        if(age >= 21){
            System.out.println("you can drink a beer");
        }else if(age >= 16){
            System.out.println("you can drive");
        }else{
            System.out.println("you can drink a coke");
        }

        char grade;
        System.out.println("Enter a grade");
        grade = keyboard.nextLine().charAt(0);

        switch (grade){
            case 'A':
            case 'a':
                System.out.println("you are exellent");
                break;
            case 'B':
            case 'b':
                System.out.println("you can do better");
                break;
            case 'C':
            case 'c':
                System.out.println("your performance is declining");
                break;
            case 'D':
            case 'd':
                System.out.println("what are you doing");
                break;
            default:
                System.out.println("you have entered a incorrect grade");
        }

        System.out.println("Enter your age : ");
        int ageOfFaternity;
        ageOfFaternity = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter your gender : ");
        char gender = keyboard.nextLine().charAt(0);

        if(ageOfFaternity >= 19 && (gender == 'M' || gender == 'm')){
            System.out.println("welcome tp the event : ");
        }else{
            System.out.println("sorry you are a kid : ");
        }



    }
}
