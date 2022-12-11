package day04Switch01;

import java.util.Scanner;

public class SwitchReview2 {
    public static void main(String[] args) {

        /*
2) Use a switch statement to print the name of the month when you enter the number of the
month. For example; if user enters 1 your code should print "January",
if user enters 2 your code should print "February" etc. if user enters invalid month number
your code should print "Invalid number”
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number");
        byte monNumber = input.nextByte();

        switch(monNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }

        //Test for all Critical values and Boundary values.//


    }
}
