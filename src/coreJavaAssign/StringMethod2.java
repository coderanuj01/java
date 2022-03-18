package coreJavaAssign;

public class StringMethod2 {
    public static void main(String[] args) {
        String nameOfAnuj = "Anuj Bhatt";
        String actorName = "James Bond";

        String lowerActor = actorName.toLowerCase();
        System.out.println(lowerActor);

        String upperName = nameOfAnuj.toUpperCase();
        System.out.println(upperName);

        String sirName = actorName.substring(6);
        System.out.println(sirName);

        int bhattIndex = nameOfAnuj.indexOf("Bhatt");
        System.out.println(bhattIndex);

     }
}
