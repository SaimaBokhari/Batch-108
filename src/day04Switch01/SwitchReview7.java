package day04Switch01;

import java.util.Scanner;

public class SwitchReview7 {
    public static void main(String[] args) {

        /*7) Use switch statement to create a converter which converts mile to km, second to hour,
fahrenheit to celsius. Find the formulas for conversions from Google.

a) When user entered 10 and mileToKm String, your code should print "16 km" (The number
will be dynamic) on the console
b) When user entered 7200 and secondsToHours String, your code should print "2 Hours"(The
number will be dynamic) on the console
c) When user entered 83 and fahrenheitToCelsius String, your code should print "28.3333
celsius"(The number will be dynamic) on the console
d) When user entered operation different from mileToKm, secondsToHours, fahrenheitTo-
Celsius your code should print "That operation was not defined for that converter"

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter mile");
        double mile = input.nextDouble();
        System.out.println("Enter seconds");
        double seconds = input.nextDouble();
        System.out.println("Enter fahrenheit");
        double fahrenheit = input.nextDouble();

        System.out.println("Enter your operator from M, S, F");
        String operator = String.valueOf(input.next().charAt(0));

        switch(operator){
            case "mileToKm ":
                System.out.println(mile/0.621 + "km");
                break;
            case "secondsToHours":
                System.out.println((seconds/60)/60);
                break;
            case "fahrenheitToCelsius":
                System.out.println((fahrenheit-32)*5/9);
                break;
            default:
                System.out.println("This operation was not defined for that converter");
        }




        //Test for all Critical values and Boundary values.//

    }
}
