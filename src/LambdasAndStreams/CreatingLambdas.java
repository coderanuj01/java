package LambdasAndStreams;

public class CreatingLambdas {
    interface greeting{
        public String giveGreeting(String s);
    }

    public void getGreeting(String a,greeting b){
        String result = b.giveGreeting(a);

        System.out.println("result : "  + result);
    }

    public static void main(String[] args) {
        new CreatingLambdas().getGreeting("harry",(String s)->"hello , " + s);
    }

}
