package VampireNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class VampireNumber {

    public static void main(String[] args) {

        int vampireNummberCount = 0;

        for (int i = 10; i <= 1000; i++) {
            for (int j = i; j <= 1000; j++) {
                if (isVampireNumber(i, j,true)) {
                    vampireNummberCount++;
                    System.out.println(vampireNummberCount + ") " + i*j + " = " + i + " * " + j);
                    if(vampireNummberCount == 100){
                        return;
                    }
                }
            }
        }

    }


    static boolean isVampireNumber(int a, int b, boolean noPseudoVamireNumbers ) {

        if (noPseudoVamireNumbers) {
            String aString,bString;

            aString = Integer.toString(a);
            bString = Integer.toString(b);

            if (!(aString.length() == bString.length())) {
                return false;
            }
        }

        SplitIntoNumbers splitToNumber = new SplitIntoNumbers();

        int mul = a*b;
        String mulString = Integer.toString(mul);
        char[] mulChar = mulString.toCharArray();
        Arrays.sort(mulChar);
        mulString = String.valueOf(mulChar);

        String factorDigits = splitToNumber.splitIntoNumbers(a,b);

        return mulString.equals(factorDigits);
    }

}