package coreJavaAssign;

public class CountUpTo {
    public static void main(String[] args) {
        countFunction(29,45);
    }

    public static void countFunction(int from,int to){
        if(from <= to){
            System.out.println(from);
            countFunction(from + 1,to);
        }
    }
}
