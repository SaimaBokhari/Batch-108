package day10Loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {

        /*
    1.Example:Type code to get the output like
                Week: 1   // weeks is outer loop, days are inner loop
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
 */
        for(int i=1; i<5; i++){
            System.out.println("Week: "+ i);
            for(int k=1; k<8; k++){
                System.out.println("   Day: " + k); // put three spaces before the word Day to print
                                                    // it a bit to the right on the console.
            }

        }

        System.out.println();
        /*
     2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                 ****
                 ****
                 ****
     Note: Get the number of rows and columns from user.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = input.nextInt();

        System.out.println("Enter the number of columns");
        int column = input.nextInt();

        for(int i=1; i<=row; i++) {
            for (int k = 1; k <= column; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

            //System.out.println(); We don't have anything to print for the outer
            // loop, that's why we don't need sout body in this example.

        /*
        3.Example: Type code to get the output like
               1
               1 2
               1 2 3
               1 2 3 4
               1 2 3 4 5
              There is repetition, horizentally and vertically, so we need to use nested loop.
               */

        System.out.println("Enter the number of rows");
        int numofRow = input.nextInt();

        System.out.println("Enter the number of columns");
        int numOfColumn = input.nextInt();

        for(int i=1; i<=numofRow; i++){
            //nothing to print coz Java needs to move vertically down. so we create inner loop.
            for(int k=1;k<=i; k++){// k<=i so that the last digit should be the same as the num of row.
                System.out.print(k);
            }
            System.out.println(); // This moves the pointer down to start the next row.
        }

















    }
}
