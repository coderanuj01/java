package AccessControlAndMore;

public class Main {
    public static void main(String[] args) {
        Rodent[] rodentArray = new Rodent[2];
        Mouse mouseObj = new Mouse();
        Gerbil gerbilObj = new Gerbil();

        rodentArray[0] = gerbilObj;
        rodentArray[1] = mouseObj;

        rodentArray[0].size();
        rodentArray[1].price();


    }
}
