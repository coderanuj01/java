package coreJavaAssign;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println("hello there");
            pw.println("my name is anuj bhatt");
            pw.close();
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
        }
    }
}
