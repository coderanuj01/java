package AccessControlAndMore;

public interface Rodent {
    abstract void size();
    abstract void color();
    abstract void price();
}
class Mouse implements Rodent{
    public Mouse(){
        System.out.println("hi hi hi.. here i'm a mouse");
    }
    @Override
    public void size() {
        System.out.println("I am a big fat mouse.");
    }
    @Override
    public void color() {
        System.out.println("My color is greyishh...");
    }
    @Override
    public void price() {
        System.out.println("You can buy me at rs 400");
    }

}

class Gerbil implements Rodent{
    public Gerbil(){
        System.out.println("ha ha ha.. im a gerbil");
    }
    @Override
    public void size() {
        System.out.println("I am not so big Gerbil");
    }
    @Override
    public void color() {
        System.out.println("hii.. my color is black");
    }
    @Override
    public void price() {
        System.out.println("hi my price is rs 567");
    }

}
