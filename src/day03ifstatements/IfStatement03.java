package day03ifstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        /* Q.1
 Type code to print
  a) "Winter" for December, January, February
  b) "Spring" for March, April, May
  c) "Summer" for June, July, August
  d) "Fall" for September, October, November
  e) "Invalid month name" for all the others
 */

// Step 1: Create Scanner object
        Scanner scan = new Scanner(System.in);
//Step 2: Give message to the user
        System.out.println("Enter the name of the month");


        // Step 3: Create the container with appropriate data type
        String month = scan.next().toLowerCase();

// Step 4: Create If-else if statement

        if(month.equals("december") || month.equals("january") || month.equals("february")){
            System.out.println("Winter");
        }else if(month.equals("march") || month.equals("april") || month.equals("may")){
            System.out.println("Spring");
        }else if(month.equals("june") || month.equals("july") || month.equals("august")){
            System.out.println("Summer");
        }else if(month.equals("september") || month.equals("october") || month.equals("november")) {
            System.out.println("Fall");
        }





        /* Q.2

        Type code to print
a) "Valid Password" if the password has at least 8 characters different from space
character
b) "Do not use space character in password" if the password has any space
character in any position
c) "Invalid Password" if a and b conditions are not satisfied
Note: Be careful about the orders of conditions in the solution
         */

        //Step 1: Create Scanner object (already done in Q.1)
        //Step 2: Give message to the user
        // System.out.println("Enter password");
        // Step 3: Create the container for the input



        /* Q.3
        Type code to print
a) "Round up by last digit:" and print the rounded value if the last digit is greater than
or equal to 5
b) "Round down by last digit" and print the rounded value if the last digit is less than 5

         */
        //Step 1: Create Scanner object (already done in Q.1)
        //Step 2: Give message to the user
        System.out.println("Enter the digit, please");
        // Step 3: Create the container for the input
        int i = scan.nextInt();
        //Step 4: Type the If code

        if(i%10>=5){
            System.out.println("Round up by last digit:" + (i/10+1)*10);
        }else {
            System.out.println("Round down by last digit:" + (i/10)*10);
        }

        /* Q.4
         Type code to print the name of the month when you entered the number of the month.
          Example; For 1 output is "January", for 2 output is "February" etc.
         */

        System.out.println("Enter the number of month");
        int numOfMonth = scan.nextInt();

        if(numOfMonth==1){
            System.out.println("January");
        }else if(numOfMonth==2){
            System.out.println("February");
        }else if(numOfMonth==3){
            System.out.println("March");
        }else if(numOfMonth==4){
            System.out.println("April");
        }else if(numOfMonth==5){
            System.out.println("May");
        }else if(numOfMonth==6){
            System.out.println("June");
        }else if(numOfMonth==7){
            System.out.println("July");
        }else if(numOfMonth==8){
            System.out.println("August");
        }else if(numOfMonth==9){
            System.out.println("September");
        }else if(numOfMonth==10){
            System.out.println("October");
        }else if(numOfMonth==11){
            System.out.println("November");
        }else if(numOfMonth==12){
            System.out.println("December");
        }else{
            System.out.println("Invalid name");
        }

        /* Q.5
       Type code to print
a) "Isosceles Triangle" if two sides of a triangle are equal in length.
b) "Equilateral Triangle" if all sides of a triangle are equal in length.
c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
         */
        int a = 8;
        int b = 8;
        int c = 12;

        if(a==b && b==a){
            System.out.println("Isosceles Triangle");
        }else if(a == b && b != c || a == c && b != c || b == c && a != c){
            System.out.println("Equilateral Triangle");
        }else{
            System.out.println("Neither isosceles, nor equilateral");
        }





        /* Q.6
        Type code to create a converter which converts mile to km, second to hour, fahrenheit to
celsius. Find the formulas for conversions from Google.
a) When user entered 10 and mileToKm String, your code should print "16 km"(The
number will be dynamic) on the console
b) When user entered 7200 and secondsToHours String, your code should print "2
Hours"(The number will be dynamic) on the console
c) When user entered 83 and fahrenheitToCelsius String, your code should print
"28.3333 celsius"(The number will be dynamic) on the console
         */


//Step 1: done above
// Step 2: Give message to teh user
//Step 3: Create container with appropriate data type

        System.out.println("Enter miles");
        double mile = scan.nextDouble();
        System.out.println(mile*1.60934 + "km");

        System.out.println("Enter seconds");
        double seconds = scan.nextDouble();
        System.out.println(seconds/60/60 + "hours");


        System.out.println("Enter the temp");
        double tem = scan.nextDouble();
        System.out.println(tem-(32*5/9) + "C");

 /* Q.7
 Type code to check the grammatical rules for full name
a) Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
b) Your code should print "First name or last name missed" for single words like
"Ali" or "Can" or "ali"
c) Your code should print "Format error" for all the format like "ALI CAN"
d) Your code should print "Name was not entered" for one or more space
characters like " " or " "
e) Your code should print "Invalid Name" if the name has any character different
from letters and space.
Note: If the abbreviation has more than 1 error all related error messages should be
printed. For example; for "ali3" your code should print "Error in initials", "First name
or last name missed", and "Invalid Name"
  */







        // Example from student channel:
        // "Type java code by using if-else statement, Write a program to print absolute value
        // of a number entered by user.  Absolute Value:
        // Hint: If the number is positive or zero, return the number itself
        // If the number is negative, return the number after multiplying by -1"

        System.out.println("Enter the number");
        double num = scan.nextDouble();

        if(num>=0){
            System.out.println(num);
        }else if (num<0){
            System.out.println(num*-1);
        }

 /* Q.8

 Q.9
 Type code to create a simple calculator which does addition, subtraction, multiplication,
and division with any 2 numbers
a) When user entered 10.2 and 5 and + sign your code should print "The result is
15.2" on the console
b) When user entered 10 and 5 and - sign your code should print "The result is 5.0"
on the console
c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0"
on the console
d) When user entered 10 and -5 and / sign your code should print "The result is -2.0"
on the console
  */
        System.out.println("Enter the value of x and y");
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        String operator = "+";

        if(operator.equals("+")){
            System.out.println("The result is:" + (x+y));
        }else if(operator.equals("-")){
            System.out.println("The result is:" + (x-y));
        }else if(operator.equals("*")){
            System.out.println("The result is:" + (x*y));
        }else if(operator.equals("/")){
            System.out.println("The result is:" + (x/y));
        }

/* Q.10
10) Type code to print the messages about the Body Mass Index(BMI) for the given BMI values
Invalid BMI value < 0
Underweight = <18.5
Normal weight = 18.5–24.9
Overweight = 25–29.9
Obesity = BMI of 30 or greater
 */
        System.out.println("Enter BMI value");
        double bmi = scan.nextDouble();

        if(bmi<0){
            System.out.println("Invalid BMI value");
        }else if(bmi<18.5){
            System.out.println("Underweight");
        }else if(bmi<24.9 && bmi>18.5){
            System.out.println("Normal weight");
        }else if(bmi>29.9 && bmi<25){
            System.out.println("Overweight");
        }else if(bmi>=30){
            System.out.println("Obese");
        }


    }
}
