package day27exceptionscollections;
// When you extend to "RuntimeException" class, your custom exception will be run time exception.

public class IllegalNameException extends RuntimeException{
    public IllegalNameException (String message){
        super(message);  // parent constructor will make my message as Exception
    }
}
