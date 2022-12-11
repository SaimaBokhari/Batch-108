package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        /*
        Example 1: Type code to check if a specific element exists in an Array or not.
         */

        String str[] = {"Ellie", "Susan", "Michael", "Carl","Angie"};

        //1st way:
        String name = "Carl";
        int counter =0;

        for(String w: str){
            if(w.equals((name))){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(name + " "+ "exists in the array.");
        }else{
            System.out.println(name + " "+ "doesn't exist in the array.");
        }

        /*
        I’ll write in steps:

1.	First element “Ellie” comes to the w container.
2.	Apply the if condition…
3.	Ellie is not equal to George, condition is false.
4.	Condition is false so counter++ will not increase and it’s value will stay 0.
5.	Next loop starts, the second element “Susan” comes in the w container.
6.	Step 2, 3, and 4 are repeated .. counter value stays 0.
7.	Same process for the next element “Michael.
8.	After that next element “George” comes to the w container.
9.	Apply if condition… “Carl” equals “Carl”, condition is true.
10.	Condition is true, so counter ++ will work this time and increase the value of int counter to 1.
11.	Loop starts again to check the last element … same process
12.	Loop is broken because there is no more element left to be checked.
13.	Outside the loop, we give condition (counter>0) which means the given element {George) was found at least and that’s why the counter value increased.





         */
        //2.Way: We will use binarySearch() method

        // 1) If the element exists binarySearch() method returns the index of the element.
        // 2) to use binary search method, we must use sort method first.

        Arrays.sort(str); // sort method puts the elements in the alphabetical order first. ["Ali", "Angie", "Carl", "Tom"]

        int idx = Arrays.binarySearch(str, "Carl");
        System.out.println(idx);     //If the index is zero or more, it means the element exists

        int idxMiami = Arrays.binarySearch(str, "Miami");

        System.out.println(idxMiami);// -4 ==> "-" means does not exist.
                                        //   "4" means if it existed, it would be 4th element









    }
}
