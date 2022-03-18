package coreJavaAssign;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(5));
        System.out.println(getResult(6,3));
        System.out.println(getResult(7,"6"));
    }

    public static int getResult(int a){
        return a;
    }
    public static int getResult(int a , int b){
        return a*b;
    }
    public static int getResult(int a,String s){
        int b = Integer.parseInt(s);
        return a*b;
    }
}
