package day04Switch01;

import java.util.Scanner;

public class SwitchReview5 {
    public static void main(String[] args) {

        /*
5) Type a code to display the number of days in a given month of a given year.
Example: The number of days in February of 2000 was 29.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int month = input.nextInt();
        System.out.println("Enter the number of the year");
        int year = input.nextInt();

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of Days = 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of Days = 30");
                break;
            case 2:
                if((((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))){ //(copied formula from the given resource)
                    System.out.println("Number of Days = 29");
                }else{
                    System.out.println("Number of Days = 28");
                }
                break;
            default:
                System.out.println("Invalid day");

        }
//Test for all Critical values and Boundary values.//



    }
}
