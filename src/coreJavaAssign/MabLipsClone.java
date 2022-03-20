package coreJavaAssign;

import java.util.Scanner;

public class MabLipsClone {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String adjective1;
        String girlsName;
        String adjective2;
        String occupation;
        String nameOfPlace;
        String clothing;
        String hobby;
        String adjective3;
        String occupation1;
        String boyName;
        String menName;

        System.out.println("Enter an adjective : ");
        adjective1 = keyboard.nextLine();

        System.out.println("Enter a girl's name : ");
        girlsName = keyboard.nextLine();

        System.out.println("Enter another Adjective : ");
        adjective2 = keyboard.nextLine();

        System.out.println("Enter an occupation : ");
        occupation = keyboard.nextLine();

        System.out.println("Enter the name of place : ");
        nameOfPlace = keyboard.nextLine();

        System.out.println("Enter the name of peice of clothing : ");
        clothing = keyboard.nextLine();

        System.out.println("Enter the name of hobby : ");
        hobby = keyboard.nextLine();

        System.out.println("Enter another adjective : ");
        adjective3 = keyboard.nextLine();

        System.out.println("Enter anther occupation : ");
        occupation1 = keyboard.nextLine();

        System.out.println("Enter boy's name : ");
        boyName = keyboard.nextLine();

        System.out.println("Enter men's name : ");
        menName = keyboard.nextLine();

        System.out.println("There once was a " +adjective1 +  " girl named " + girlsName + " who was a " +adjective2  +" "+ occupation + " in the kingdom of " + nameOfPlace +  ".");
        System.out.println("She loved to wear " + clothing + " and to "+ hobby + ". She wanted to marry "+ adjective3 + " "+ occupation1 + " named "+boyName + "but her father, king " +menName+ " forbid her from seeing him.");
    }
}
