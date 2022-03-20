package coreJavaAssign;

public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        for(int i=0;i<myArray.length;i++){
            myArray[i] = i+1;
        }

        for(int element : myArray){
            System.out.print(element + " ");
        }
    }
}
