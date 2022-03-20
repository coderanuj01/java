package AccessControlAndMore;

interface Ship{
    void ship1();
    void ship2();
}
interface MotorCycle{
    void motorcycle1();
    void motorcycle2();
}
interface Car{
    void car1();
    void car2();
}

interface Vehicle extends Ship, MotorCycle, Car{

}

class Concrete{
    public void concreteMethod(){
        System.out.println("This is a concrete class");
    }
}

class ThreeInterface extends Concrete implements Vehicle{

    @Override
    public void ship1() {
        System.out.println("this is ship 1");
    }
    @Override
    public void ship2() {
        System.out.println("This is ship 2");
    }
    @Override
    public void motorcycle1() {
        System.out.println("this is motocycle 1");
    }
    @Override
    public void motorcycle2() {
        System.out.println("This is motorcycle 2");
    }
    @Override
    public void car1() {
        System.out.println("this is car 1");
    }
    @Override

    public void car2() {
        System.out.println("this is car 2");
    }
    public void argumentFunction1(Ship myship){
        System.out.println("this is my ship");
    }
    public void argumentFunction2(MotorCycle mymotocycle){
        System.out.println("this is my motocycle");
    }
    public void argumentFunction3(Car mycar){
        System.out.println("this is my car");
    }
    public void argumentFunction4(Vehicle yehicle){
        System.out.println("this is my veicle");
    }

    public static void main(String[] args) {
        ThreeInterface[] myArray = new ThreeInterface[4];
        ThreeInterface myObj = new ThreeInterface();

        myArray[0] = new ThreeInterface();
        myArray[1] = new ThreeInterface();
        myArray[2] = new ThreeInterface();
        myArray[3] = new ThreeInterface();

        myArray[0].argumentFunction1(myObj);
        myArray[1].argumentFunction2(myObj);
        myArray[2].argumentFunction3(myObj);
        myArray[3].argumentFunction4(myObj);

    }
}


