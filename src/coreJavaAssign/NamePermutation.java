package coreJavaAssign;

import java.util.ArrayList;
import java.util.Scanner;

public class NamePermutation {
    public static void main(String[] args) {
        ArrayList<String> nameArray = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> givenName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();

        for(int i=0;i<5;i++){
            System.out.println("Enter name " + (i+1));
            String name = keyboard.nextLine();

            int ind = name.indexOf(" ");
            givenName.add(name.substring(0,ind));
            lastName.add(name.substring(ind+1));
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println(givenName.get(i) + " " + lastName.get(j));
            }
        }
    }
}
