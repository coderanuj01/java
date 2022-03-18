package StringAndTypeInformation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Pattern  p = Pattern.compile("^[A-Z].*[.]$");
        String inputString = keyboard.nextLine();

        if (p.matcher(inputString).matches()) {
            System.out.println("Yes input is correct!");
        }else{
            System.out.println("NO it is not correct input");
        }


    }


}
