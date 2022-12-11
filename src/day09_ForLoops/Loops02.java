package day09_ForLoops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {

        /*
        Example 1: Type code to print characters except 'm'
        in a String.
        e.g. Andromeda ==> Androeda
         */

        // 1st way:

        String str = "Andromeda";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != 'm'){
                System.out.print(ch);

            }
        }
        System.out.println();

        // 2nd way:

        String str1 = "Mama";

        for(int i=0; i<str1.length(); i++){
            char ch1 = str1.charAt(i);
            if(ch1=='m'){
                continue;
            }
            System.out.print(ch1); // maa
        }

        // If you want to skip any value in loop, use "continue".
        // but it carries on processing the remaining values in the loop.


        System.out.println();
        /*
        Example 2:
        Type code to print characters before 'm' in a String.
        e.g. Luxembourg ==> Luxe
         */

        String city = "Luxembourg";

        for(int i=0; i<city.length();i++){
            char ch2 = city.charAt(i); // this code gives the characters one by one.
            if(ch2 == 'm'){
                break;
            }
            System.out.print(ch2);
        }

        //If you want to skip any value in a loop, use 'continue':
        // break : stops the loop once the condition is valid and leaves
        // the loop without processing other values.



        /*
        IT Learning steps:

        1) What?
        2) Why?
        3) Simple implementations
        4) Mid-level implementations
        5) Advanced implementation
        6) Project

         */
        System.out.println();

        /*
        Example 3:
        Type code to find the sum of the unique digits
        in an integer.
        e.g. 1232 ==> 1+3=4
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to see the sum of the unique digits in it");

        String num = input.next(); // we make this container String
        // because String has many useful methods to get the unique numbers
        int sum = 0;

        for(int i=0; i<num.length(); i++){
            String digit = num.substring(i, i+1);
            if(num.indexOf(digit) == num.lastIndexOf(digit)){ // This is the rule to get unique values.
                sum = sum + Integer.valueOf(digit);
            }
        }
        System.out.println(sum);


        // Write a program to multiply counting numbers from 7 to 15 by using for-loop.
// Print the multiplication on the console

        int multiplication = 1 ;
        for(int i= 7 ; i<16; i++){

            multiplication= multiplication*i;
        }

        System.out.print(multiplication);







    }
}
