package day04Switch01;

import java.util.Scanner;

public class SwitchReview6 {
    public static void main(String[] args) {

        /*
6) Use switch statement to create a simple calculator which does addition, subtraction,
multiplication, and division with any 2 numbers.

a) When user entered 10.2 and 5 and + sign your code should print "The result is 15.2" on the
console
b) When user entered 10 and 5 and - sign your code should print "The result is 5.0" on the
console
c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0" on the
console
d) When user entered 10 and -5 and / sign your code should print "The result is -2.0" on the
console
e) When user entered 10 and -5 and operation different from +, -, *, / your code should print
"That operation cannot be done"
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = input.nextDouble();
        System.out.println("Enter the value of y");
        double y = input.nextDouble();

        System.out.println("Enter the operation among +, -, *, /, % ");
        char operation = input.next().charAt(0);

        switch(operation){
            case '+':
                System.out.println("The result is" + " " + (x+y));
                break;
            case '-':
                System.out.println("The result is" + " " + (x-y));
                break;
            case '*':
                System.out.println("The result is" + " " + (x*y));
                break;
            case '/':
                System.out.println("The result is" + " " + (x/y));
                break;
            case '%':
                System.out.println("The result is" + " " + (x%y/100));
                break;
            default:
                System.out.println("This operation is not supported by this calculator");
        }



        //Test for all Critical values and Boundary values.//


    }
}
