package coreJavaAssign;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        Scanner nameFile;
        Scanner ageFile;
        PrintWriter pw;

        try{
            nameFile = new Scanner(new File("student_name.txt"));
            ageFile = new Scanner(new File("student_age.txt"));
            pw = new PrintWriter("names_ages.txt");

            String tempName;
            int tempAge;

            while(nameFile.hasNext()){
                tempAge = ageFile.nextInt();
                tempName = nameFile.nextLine();

                pw.println(tempName + " is " + tempAge + " years old");
            }

            nameFile.close();
            ageFile.close();
            pw.close();
        }catch(FileNotFoundException ex){
            System.out.println("file not found");
        }
    }
}
