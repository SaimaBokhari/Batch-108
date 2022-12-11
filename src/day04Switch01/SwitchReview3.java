package day04Switch01;

import java.util.Scanner;

public class SwitchReview3 {

    public static void main(String[] args) {

        /*
3) Type a code which prints the all month names starting with the given month numbers.
Example: If the month number is 9 output will be September October November December

 */
        // practiced in live session)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number");
        byte monNumber = input.nextByte();

        switch(monNumber){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }


        //Test for all Critical values and Boundary values.//

    }
}
