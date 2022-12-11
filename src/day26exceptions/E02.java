package day26exceptions;

public class E02 {
    public static void main(String[] args) {
        /*
        1)If you want to execute a code for every (happy as well as negative) scenario, use "finally" block after "try" body
        2)"try" can be used like
                i) try + single catch
                ii)try + multiple catch
                iii)try + single catch + finally
                 iv)try + multiple catch + finally
                  v)try + finally
        "finally" keyword is like putting a full stop at the end of a code.
        Note: "try" cannot be used alone

        Note:What's the difference between "final" and "finally"?
             "final" keyword is used with class, method and variable whereas "finally" keyword
             is used within try-catch block.

        "final class" cannot have a child class;
        "final method" it's body cannot be updated therefore cannot be overridden.
        "final variable" cannot be updated; it should be initialised.

        "finally" works as the last thing that every code has to do under all scenarios.

        3)"ArithmeticException", "NullPointerException", "ArrayIndexOutOfBoundsException", "NumberFormatException",
          "StringIndexOutOfBoundsException", "IllegalArgumentException"  are displayed on the
          console after I click on "Run" button therefore those are called "RunTime Exception" or "UnChecked Exceptions"

        4)There is "Compile Time Exception", they will be displayed before clicking on the "Run" button.
          Therefore, they are called "Compile Time Exception" or "Checked Exceptions"
     */

            divide(6, 0); // actual value we receive for the data is called arguments.
        }

        //Create a method to do division then save the result into database.
        // we'll learn how to create connection with database in JDBC..... now we only focus on how to use try-catch block
        public static void divide(int a, int b){

            try {
                System.out.println(a / b + " was saved into database");
            }catch(ArithmeticException e){
                System.out.println("Do not use zero as divisor");
            }finally{
                System.out.println("Cut the connection with the database");
            }

        }
    }

