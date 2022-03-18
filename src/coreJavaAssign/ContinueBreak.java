package coreJavaAssign;

public class ContinueBreak {
    public static void main(String[] args) {
        int counter = 0;

        while(counter <= 10){
            if(counter%2 == 1){
                counter++;
                continue;
            }
            System.out.println(counter);
            counter++;
        }
    }
}
