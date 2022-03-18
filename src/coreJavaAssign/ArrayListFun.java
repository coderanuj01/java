package coreJavaAssign;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Anuj");
        nameList.add("rohit");
        nameList.add("pawan");
        nameList.add("aman");
        nameList.add("mohit");

        for(int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
        }

        for(String elements : nameList){
            System.out.println(elements);
        }
    }
}
