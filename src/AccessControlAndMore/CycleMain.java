package AccessControlAndMore;

public class CycleMain {
    public static void main(String[] args) {
        Cycle[] cycleArray = new Cycle[3];
        Bicycle myBicycle = new Bicycle();
        Unicycle myUnicycle = new Unicycle();
        Tricycle myTricycle = new Tricycle();

        cycleArray[0] = myBicycle;
        cycleArray[1] = myTricycle;
        cycleArray[2] = myUnicycle;

        //upcasting
        Cycle atlas = new Tricycle();
        //atlas.getBalance();

        // downcasting
        Tricycle tricycle = (Tricycle) atlas;

        for(int i=0;i<3;i++){
            cycleArray[i].balance();
        }
    }
}
