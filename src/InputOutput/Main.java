package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> countermap = new HashMap<Character,Integer>();

        Scanner infile;
        try{
            infile = new Scanner(new File("assignment_input"));
            String input;

            for(int i=97;i<=122;i++){
                countermap.put((char)i,0);
            }

            while(infile.hasNext()){
                input = infile.nextLine();
                for(int i=0;i<input.length();i++){
                    char key = input.charAt(i);
                    if((key >= 'a') && (key <= 'z')){
                        // System.out.println(key);
                        int val = countermap.get(key) + 1;
                        countermap.put(key, val);
                    }
                }
            }

            PrintWriter pw = new PrintWriter("assignment_output.txt");
            for(Map.Entry<Character, Integer> value : countermap.entrySet()){
                System.out.println(value.getKey() + " " + value.getValue());
                pw.println(value.getKey() + " " + value.getValue());
            }
            pw.close();
            infile.close();

        }catch (FileNotFoundException ex){

            System.out.println("Can't find file");
            System.out.println(ex.getMessage());

        }catch (InputMismatchException ex){

            System.out.println("Input type did't match");

        }
    }
}
