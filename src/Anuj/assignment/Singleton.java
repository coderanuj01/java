package Anuj.assignment;

public class Singleton {
    String myString;

    public static Singleton function(String myString){
        Singleton sgtn = new Singleton();
        sgtn.myString = myString;           // we cannot use this(keyword) here if we use Static with function
        return sgtn;
    }

    public void printString(){
        System.out.println(myString);
    }
}
