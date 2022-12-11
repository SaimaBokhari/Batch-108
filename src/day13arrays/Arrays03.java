package day13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {

        /*
        Example 1: Let user enter student names into the application.
        (Java Language: Create an Array together with the user).
         */

        Scanner input = new Scanner(System.in);

        // Step 1: Create an Array.
        System.out.println("Enter the number of the students you want to enter"); // we ask the number because we need to create that many elements in the Array.
        int numOfStudents = input.nextInt();

        String names[] = new String[numOfStudents];
        System.out.println(Arrays.toString(names));


        // Step 2: Insert the elements into the Array.

        for(int i=0; i<numOfStudents; i++){
            System.out.println("Enter the student name");
            String stuName = input.next();
            names[i] = stuName;
        }
        System.out.println(Arrays.toString(names));

        System.out.println("===================");

        // To make the code more dynamic

        for(int i=0; i<numOfStudents; i++){
            System.out.println("Enter the " + (i + 1) + ". student name. To stop insertion press Q");
            String stuName = input.next();
            names[i] = stuName;
        }
        System.out.println(Arrays.toString(names));

        // (i + 1) gives the order number... index + 1
        // We didn't use for-each-loop in this example, because it deals with elements, not indexes.
        // We need indexes in this example, so we use for loop only.

        /*
        Another scenario for the same question:
        If user gives 5 numbers, but add only 3 names and then wants to stop. What do we do?
        We add one if condition inside the for-loop.

         */

//        for(int i=0; i<numOfStd; i++){
//            System.out.println("Enter the " + (i + 1) + ". student name. To stop, press Q");
//            String stdName = input.next();
//            if(!stdName.equalsIgnoreCase("q")) {
//                names[i] = stdName;
//            }else{
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(names));
//














    }
}
