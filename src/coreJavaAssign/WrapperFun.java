package coreJavaAssign;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(23);
        mylist.add(55);
        mylist.add(12);
        mylist.add(76);

        for (int elements : mylist){
            System.out.println(elements);
        }

        String mynum = "453";
        int actualNumber = Integer.parseInt(mynum);
        System.out.println(actualNumber + 10);

        String pii = "3.14";
        double piiValue = Double.parseDouble(pii);
        System.out.println(piiValue + 10);

    }
}
