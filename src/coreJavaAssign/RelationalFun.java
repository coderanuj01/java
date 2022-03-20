package coreJavaAssign;

public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int bobAge = 20;
        int johnAge = 32;
        int tomAge = 20;

        String myName = "anuj";
        String yourName = "anuj";

        System.out.println("myBool = " + myBool);
        System.out.println("YourBool = " + yourBool);
        System.out.println("is bob == john ? " + (bobAge==johnAge));
        System.out.println("is our name same ? " + myName.equals(yourName));
    }
}
