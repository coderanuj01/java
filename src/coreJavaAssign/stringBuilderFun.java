package coreJavaAssign;

public class stringBuilderFun {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Madan Malviya");

        str.append(" was a freedom fighter");
        System.out.println(str);

        str.insert(5," Mohan");
        System.out.println(str);

        str.replace(20,23,"is");
        System.out.println(str);

        str.delete(5,11);
        System.out.println(str);
    }
}
