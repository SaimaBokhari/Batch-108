package day05ternarystringmanipulations;

public class Ternary01 {
    public static void main(String[] args) {

        /*
        Ternary does the same as "if else" by using more simple syntax.

         */

        /* Task:
        If an integer is positive print "The integer is positive"
        otherwise print "The integer is not positive"
         */

        //1st way: if-else statement

        int i = 12;
        if (i > 0) {
            System.out.println("The integer is positive");
        } else {
            System.out.println("The integer is negative");
        }

        // 2nd way: Ternary way:
        //  condition:   "?" will be selected for true condition
        //               ":" will be selected for false condition

        String result = i > 0 ? "The integer is positive" : "The integer is negative";

        // if the condition is true, first part will be activated.
        // if the condition is false, second part will be activated.

        System.out.println(result);

        // Ternary syntax is more commonly used in Java.

        // Type a program to print the minimum of 2 double vales on the console.
        // Use Ternary.
        // e.g out of two values 12  and 23 ==> 12 should be selected          345 , 23 ==> 23    -12 , 3 ==> -12

        double d = 2004, e = 3005;

        double min = d>e ? e : d; // colon acts like else in If-else statements.
        System.out.println(min);


/* Task 2:
/Type code to calculate the absolute value of a number
        //For positive numbers and zero absolute value is the same
          with the number
        //For negative numbers to find absolute value multiply
        the number by -1

 */
        double f = 0;
        double abs = f<0 ? -1*f : f;
        System.out.println(abs);

        // Note: Instead of using '>=', you can use '<'. This works better.
        double betterAbs = f<0 ? -1*f : f;
        System.out.println(betterAbs);


/*
Task:
You have 2 integers;
        If both of the integers are positive do multiplication
        If one is negative the other one is positive return
        "I do not how to multiply"
 */
        int x = -25, y = 12;
        Object res = x>0 && y>0 ? x*y : "I do not how to multiply";
        // Object data type in Java is like Adam to human race.
        // Use Object when data types in the container and result don't match.
        // Normally use specific container according to data types.

        System.out.println(res);




    }
}
