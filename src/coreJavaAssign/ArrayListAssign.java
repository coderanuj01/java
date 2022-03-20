package coreJavaAssign;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAssign {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> myList = new ArrayList<>();

        System.out.println("Enter 0 or more to put in the array and -1 to exit");
        double inputdata = keyboard.nextDouble();

        while(inputdata >= 0){
            myList.add(inputdata);
            System.out.println("Enter 0 or more to put in the array and -1 to exit");
            inputdata = keyboard.nextDouble();
        }

        for(int i=myList.size()-1;i>=0;i--){
            System.out.println(myList.get(i));
        }
    }
}
