package coreJavaAssign;

import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random random = new Random();
        int randomGenerator = random.nextInt();
        System.out.println("the new random number is " + randomGenerator);

        System.out.println("The number between 1 and 6 is " + ((randomGenerator%6)+6)%6);

        int randomNumberToSix = random.nextInt(6);
        System.out.println(randomNumberToSix);

    }
}
