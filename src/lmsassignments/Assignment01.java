package lmsassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {

        /*
        - Type code to ask user to enter the int elements and add elements into the list.
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.
         */


        // Step 1:

        Scanner input = new Scanner(System.in);
        System.out.println("How many elements you want to enter to your list");
        int num = input.nextInt();

        List<Integer> myList = new ArrayList<>();
        System.out.println("Enter the numbers one by one");

        Scanner scanner = new Scanner(System.in);
        for(int i=0 ; i < num ; i++){
            myList.add(scanner.nextInt());
        }
        System.out.println(myList);



        // Step 2:
        System.out.println("Enter the number that you want to remove");
        int removeNum = input.nextInt(); //2
        int idxOfRemovedNum = myList.indexOf(removeNum);

        // Step 3:

        System.out.println("Enter the number that you want to update.");
        int newNum = input.nextInt(); // 77
        if(!myList.contains(removeNum)){
            System.out.println("This number doesn't exist");
        }else {
            myList.set(idxOfRemovedNum, newNum);
            System.out.println(myList);
        }




    }

}
