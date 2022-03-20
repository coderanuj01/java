package AccessControlAndMore;

public class Cycle {
    public void balance() {
        System.out.println("hii balance cycle");
    }
}

class Unicycle extends Cycle{
    public void balance(){
        System.out.println("this is the balance of unicycle");
    }
}

class Bicycle extends Cycle{
    public void balance(){
        System.out.println("this is the balance of bicycle");
    }
}

class Tricycle extends Cycle{
}
