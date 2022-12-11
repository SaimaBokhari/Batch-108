package day05ternarystringmanipulations;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        Rule 1: If the year is divisible by 100, it must be divisible by 400. ==> 1600, 2000, but 1800 is not leap year
        Rule 2: If a year is not divisible by 100 then it must be divisible by 4. ==> 2004, 1996, but 2021 is not a leap year
 */

        /* If we put another ternary in place of first or second condition or
         both, it becomes nested ternary. (for true or false part)
         */

        int year = 2021;
        String isLeap = year%100 == 0 ? (year%400 == 0 ? "Leap Year" : "Not Leap Year") : (year%4 == 0 ? "Leap Year" : "Not Leap Year");
        System.out.println(isLeap);

        /*
     Type code to check the password
     If it has more than 8 characters, initial should be 'i'
     If it has no more than 8 characters initial should be 'K'
     Solve the task by using nested-ternary
     */

        String pwd = "M123";
        String isValid = pwd.length()>8 ? (pwd.charAt(0)== 'i' ? "Valid" : "Invalid") : (pwd.charAt(0)== 'K'? "Valid" : "Invalid");
        System.out.println(isValid);


        // length () counts the number of characters in a String
    }
}
