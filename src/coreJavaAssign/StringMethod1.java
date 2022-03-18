package coreJavaAssign;

public class StringMethod1 {
    public static void main(String[] args) {
        String name = "Anuj Bhatt";
        String name1 = "Alok Gupta";
        String name3 = "Anuj Bhatt";

        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();

        if(name.equals(name3)){
            System.out.println("name == name3");
        }else{
            System.out.println("they are not equal");
        }

        if(name.compareTo(name1) > 0){
            System.out.println("name > name3");
        }else if(name.compareTo(name1) == 0){
            System.out.println("they both are same ");
        }else{
            System.out.println("name3 > name");
        }
    }
}
