package Anuj.assignment;

public class Data {
    int number;
    char character;

    public void printValue(){
        System.out.println(number);
        System.out.println(character);
    }

    public void printInnerValue(){
        int number1 = 5;   // cannot be printed without initialisation
        int character1 = 'a'; // cannot be printed without initialisation
        System.out.println(number1);
        System.out.println(character1);
    }
}
