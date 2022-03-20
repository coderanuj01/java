package coreJavaAssign;

public class ControlStatementIntro {
    public static void main(String[] args) {
        int age = 16;

        if(age >= 21){
            System.out.println("You are eligible for marriage");
        }else{
            System.out.println("don't think about marriage");
        }

        for(int i=1;i<=age;i++){
            System.out.println("I am " + i + " years old");
        }
    }
}
