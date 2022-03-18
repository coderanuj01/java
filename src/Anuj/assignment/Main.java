package Anuj.assignment;

public class Main {
    public static void main(String[] args) {

        Data data = new Data();
        data.printValue();
        data.printInnerValue();

        Singleton stn = Singleton.function("hii");
        stn.printString();
    }
}
