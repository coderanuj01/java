package coreJavaAssign;

import java.util.ArrayList;
import java.util.Scanner;

public class PerallelArrayAssign {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();

        for(int i=0;i<5;i++){
            System.out.println("Enter the name : ");
            String nameGet = keyboard.nextLine();
            nameList.add(nameGet);
            System.out.println("Enter the age : ");
            int age = keyboard.nextInt();
            ageList.add(age);
            keyboard.nextLine();
            System.out.println();
        }

        for(int i=0;i<5;i++){
            System.out.println(nameList.get(i) + " is " + ageList.get(i) + " years old.");
        }
    }
}
