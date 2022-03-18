package coreJavaAssign;

import java.util.Random;

public class TwoDArrayFun {
    public static void main(String[] args) {
        int[][] myarr = new int[3][3];
        fillArray(myarr);
        showArray(myarr);
        doubleArray(myarr);
        showDoubleArray(myarr);
    }

    public static void fillArray(int[][] myarr){
        for(int i=0;i<myarr.length;i++){
            for(int j=0;j<myarr[i].length;j++){
                Random random = new Random();
                myarr[i][j] = random.nextInt(100);
            }
        }
    }

    public static void showArray(int[][] myarr){
        for(int[] arr : myarr){
            for(int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static void doubleArray(int[][] myarr){
        for(int i=0;i<myarr.length;i++){
            for(int j=0;j<myarr[i].length;j++){
                myarr[i][j] = myarr[i][j]*2;
            }
        }
    }
    public static void showDoubleArray(int[][] myarr){
        System.out.println();
        for(int[] arr : myarr){
            for(int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
