package coreJavaAssign;

public class MethoDemo {
    public static void main(String[] args) {
        printName();
        System.out.println("I have cgpa = " + returnTen());
        System.out.println(doubleSquare(1.2));
        System.out.println(sum(4,2));
    }

    public static void printName(){
        System.out.println("Anuj is my name : ");
    }

    public static int returnTen(){
        return 10;
    }

    public static double doubleSquare(double d1){
        return d1*d1;
    }

    public static int sum(int a,int b){
        return a+b;
    }
}
