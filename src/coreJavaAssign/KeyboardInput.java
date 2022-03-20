package coreJavaAssign;
import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double cgpa;

        System.out.println("what is your age : ");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("what is your name : ");
        name = keyboard.nextLine();

        System.out.println("what is your city : ");
        city = keyboard.nextLine();

        System.out.println("Enter your CGPA");
        cgpa = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("your name is : " + name);
        System.out.println("your age is : " + age);
        System.out.println("your city is : " + city);
        System.out.println("your CGPA is : " + cgpa);


    }
}
