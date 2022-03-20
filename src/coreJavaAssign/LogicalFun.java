package coreJavaAssign;

public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = true;

        boolean combined = isRaining && isSunny;
        System.out.println("is raining and sunny : " + combined);

        combined = isRaining || isSunny;
        System.out.println("is raining or sunny : " + combined);

        combined = !combined;
        System.out.println("is not rainig : " + combined);
    }
}
