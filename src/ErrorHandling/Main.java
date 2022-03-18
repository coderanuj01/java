package ErrorHandling;

class ShortPassword extends Exception{
    public ShortPassword(String message) {
        super(message);
    }
}

class LongPassword extends Exception{
    public LongPassword(String message) {
        super(message);
    }
}

class BlankPassword extends Exception{
    public BlankPassword(String message) {
        super(message);
    }
}

class ExceptionHandler{
    void throwExceptions(int passwordLength) throws Exception{
        if(passwordLength < 6){
            throw new ShortPassword("your password is too short : ");
        }else if(passwordLength > 15){
            throw new LongPassword("your password is too long");
        }else if(passwordLength == 0){
            throw new BlankPassword("password cannot be blank");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ExceptionHandler exceptionHandler = new ExceptionHandler();
        try{
            exceptionHandler.throwExceptions(5);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("done...");
        }
    }
}
