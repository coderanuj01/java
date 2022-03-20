package InputStringChecker;

public class StringChecker {
    public static boolean checker(String input){
        int[] checkArray = new int[26];
        for(int i=0;i<26;i++){
            checkArray[i] = 0;
        }
        for(int i=0;i<input.length();i++){
           checkArray[input.charAt(i)-97] = 1;
        }
        for(int i=0;i<26;i++){
            if(checkArray[i] == 0){
                return false;
            }
        }
        return true;
    }
}
