package day25exceptions;

public class E01 {
    /*
        1)"Exception" means un-expected issues in code executions (e.g. divide by zero)
        2)There are two ways to work with Exceptions
            i)  Using try-catch block: Handling Exception
            ii) Throw Exception and block the application
        3) If you do not handle the Exception, Java stops execution and the application is blocked.
        4) "try" can be used with a "single" or "more" catch blocks
        5) "try" "cannot" be used "alone"

Try block is like asking for help when something unexpected happens in the coding.
So it doesn't block the application.
Exceptions are not errors.

Exceptions that we learnt today:
- ArithmeticException
- ArrayIndexOutOfBoundsException
- NullPointerException
- NumberFormatException
     */


    public static void main(String[] args) {
        divide(6,2);  // 3 normal and expected division operation
        divide(6,0);  // an un-expected issue for Java in arithmetic operation coz division can't be done by zero.

       // divide2(6,3);
        divide2(6,0);

    }


    //      1.Way:(using conditional statements) We do not recommend that way.

    //       i)  It is not mandatory for developers to know all maths rules.
    //       ii) In Maths, there may be very problematic rules,
    //           it is so difficult to cover all in if statements

    public static void divide(int a, int b){
        if(b==0){
            System.out.println("A number can't be divided by zero");
        }else {
            System.out.println(a / b);
        }
    }


    //   2.Way: Handle Exception by using try-catch block:

    public static void divide2(int a, int b){
        try{
            System.out.println(a/b);
            System.out.println("Hi Exception"); // just to check whether other codes are still working or not
            System.out.println("By Exception");
        }catch(ArithmeticException e){
            System.out.println("A problem occurred in division");
        }
    }





}
