package day27exceptionscollections;
// To make a class Exception Class, make it a child of Exception Class by using "extends" keyword.
// If you use "extends Exception", it will be "Compile Time Exception" (Checked Exception)

public class IllegalGradeException extends Exception {

    public IllegalGradeException(String message){   // This is constructor
        super(message);  // parent constructor will make my message as Exception
    }
}
