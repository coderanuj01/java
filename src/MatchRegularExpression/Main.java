package MatchRegularExpression;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        
        String home = System.getProperty("user.home");
        home = home + "\\Documents\\Zemoso_Folder\\Zemoso_practice\\java";

        System.out.println(home);

        // String home = "D:anujdocuments";
        //System.out.println("Enter the file you want to search : ");
        String extension = " ";
        System.out.println();
        //String extension = keyboard.nextLine();

        GetPath getPathObject = new GetPath();


        getPathObject.getPath(Paths.get(home),extension);

    }
}
