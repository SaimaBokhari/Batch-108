package day12variabletypesstaticblock;

public class VariableTypes01 {

    //There are three types of variables:
    //1)  "name" is called "non-static" or "object" or "instance" variable.
     String name = "Tom Hanks";

    //2) "age" is "static" or "class" variable.
    public static int age = 13;

    /* 3)
    Local variable:
    If you create a variable inside a method, it is called "local variable".
    Notes:
    1. For local variable, you must assign a value, otherwise you can't use it or print it. It complains.
    2. If the return type is different from "void", you have to use "return" keyword inside the method.
    3. Local variables can be used just inside the method. If you  try to use it
       outside the method, it will give error.

     */

    // 5 steps:  access modifier       return type      methodName       ()      {}

    public int add(int a, int b){

        // to do addition, we need two integers: a and b

        int x = 12;        // variable x is created inside add method, so it's a local variable.
                           // System.out.println(name); Static or class variables can be used inside the method as well.

        return a+b;       // 'return' is the keyword here.

    }

    // Create a method to do multiplication.
    public int multiply(int l, int m){

        String s = "Java";     // local variable

        return l*m;
    }

    // Note: When you create a method, use "return" keyword in the last step.
    //  After using it, you cannot type any code.




}
