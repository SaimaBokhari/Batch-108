package day12variabletypesstaticblock;

 /*
    1)  If you don't assign any value to "static" and "non-static" variables, Java
    assigns default values to them. But it doesn't assign default value for
    "local variables" and it starts complaining.
    2)  Default values are 'zero' for numeric data types, 'null' for String and 'false' for boolean.

     */


// Class is non-primitive.... because it has methods in it. That's why it's stored in Heap memory.


public class StaticBlock01 {

    /* Important notes:
    1. Java Class Loader: Makes the class ready to use for you.
    2. Java Class Loader prepares the class for you (class members are loaded) in this order normally:
             1) main method  2) methods and variables
    3. But sometimes we need some data to be available before we start the main method, in that case,
    we use "static block" even before the main method.
              1) static block   2) main method    3) methods and variables
                   see example of static block of pi.
    4. Rule: "static" structures can work with just static class structures.
       Do not put non-static class members (methods or variables) into static methods. It will give error.
    5. "static block" can be used just with "static" variables (as defined in number 4.)
    6. "static block" is used to initialise (means assigning first value) "static variables"

    Note:
    When we create a variable inside a main method, we don't use "static" keyword because
    Java knows everything inside the main method is static.


    If there are multiple static blocks, Java comes from top.
     */



    public static double pi;      // It doesn't complain coz it's static variable.

    static{
        pi = 3.14;
    }

    public static void main(String[] args) {
        System.out.println("This is main method");






    }

}
