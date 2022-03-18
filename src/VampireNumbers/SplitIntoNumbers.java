package VampireNumbers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitIntoNumbers {
    public String splitIntoNumbers(int a,int b){

        String aString = Integer.toString(a);


        String bString = Integer.toString(b);


        String ans = aString + bString;
        char[] ansChar = ans.toCharArray();

        Arrays.sort(ansChar);

        ans = String.valueOf(ansChar);

        return ans;
    }
}
