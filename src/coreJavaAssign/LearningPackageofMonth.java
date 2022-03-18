package coreJavaAssign;

import java.util.Scanner;

public class LearningPackageofMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the package you want to adopt : 1 2 3");
        int selectedPackage = keyboard.nextInt();
        System.out.println("Enter the number of courses you want to read : ");
        int numberOfCourses = keyboard.nextInt();

        int completePackage;
        int remainingPakage;
        int cost;

        if(selectedPackage == 1){

            completePackage = numberOfCourses/2;
            remainingPakage = numberOfCourses%2;
            cost = (completePackage * 10) + (remainingPakage * 6);

        }else if(selectedPackage == 2){

            completePackage = numberOfCourses/4;
            remainingPakage = numberOfCourses%4;
            cost = (completePackage * 12) + (remainingPakage * 4);

        }else{

            completePackage = numberOfCourses/6;
            remainingPakage = numberOfCourses%6;
            cost = (completePackage * 15) + (remainingPakage * 3);

        }

        System.out.println("The cost of your course is " + cost);
    }
}
