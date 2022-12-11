package day04Switch01;

import java.util.Locale;
import java.util.Scanner;

public class SwitchReview1 {
    public static void main(String[] args) {

        /*

        1) Use switch statement to print
a) "Winter" for December, January, February
b) "Spring" for March, April, May
c) "Summer" for June, July, August
d) "Fall" for September, October, November
e) "Invalid month name" for all the others
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of the month");
        String nameOfMonth = input.next().toLowerCase(Locale.ROOT);

        switch(nameOfMonth){
            case "december":
                System.out.println("Winter");
                break;
            case "january":
                System.out.println("Winter");
                break;
            case "february":
                System.out.println("Winter");
                break;
            case "march":
                System.out.println("Spring");
                break;
            case "april":
                System.out.println("Spring");
                break;
            case "may":
                System.out.println("Spring");
            case "june":
                System.out.println("Summer");
                break;
            case "july":
                System.out.println("Summer");
                break;
            case "august":
                System.out.println("Summer");
            case "september":
                System.out.println("Fall");
                break;
            case "october":
                System.out.println("Fall");
                break;
            case "november":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid name of the month");
        }

        //Test for all Critical values and Boundary values.//



    }
}
