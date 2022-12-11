package day04Switch01;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        /* Switch statement does the same as 'if-else-if statement.
         It has just different syntax. It's more readable and easy to type.
         */

        // Get the number of days from user and print the name of the day.
        // e.g. 1 ==> Monday     2 ==> Tuesday

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day number");

        byte dayNumber = input.nextByte();

        // 1st way (If else statement):
        if(dayNumber==1){
            System.out.println("Monday");
        }else if(dayNumber==2) {
            System.out.println("Tuesday");
        }else if(dayNumber==3) {
            System.out.println("Wednesday");
        }else if(dayNumber==4) {
            System.out.println("Thursday");
        }else if(dayNumber==5) {
            System.out.println("Friday");
        }else if(dayNumber==6) {
            System.out.println("Saturday");
        }else if(dayNumber==7) {
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid day number");
        }

        /* Test for all critical values:
        Critical values: 1 2 3 4 5 6 7
        Boundary values: byte value before 1 is -1 or any -ve;
        byte value after 7 is 8 or greater.
         */

        /* 2nd way (Switch statement)
          Works just like If-else statements but simpler to write.
          The main differences between the two ways are:
             a) you don't need to write if condition "if(dayNumber==1)".
             b) order of the values is not important in Switch. You can
                write case 4 before and case 1 later. It doesn't affect
                the results in Switch.
                case 1:
                System.out.println("Monday");
                break;
                function of break; is literally to break Java from further action and
                stop when it finds the true result and take you outside the switch code.
         */

        switch(dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }


        /* Test for all critical values:
        Critical values: 1 2 3 4 5 6 7
        Boundary values: byte value before 1 is -1 or any -ve;
        byte value after 7 is 8 or greater.
         */


    }
}
