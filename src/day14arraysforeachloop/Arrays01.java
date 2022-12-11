package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
        Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
         //        [2, 3, 12, 0, 0, 0]
         */

       // int arr[] = new int[6];  This takes long time as you have to type 6 elements separately.

        int arr[] = {0, 2, 3, 0, 12, 0};

        int brr[] = new int[arr.length];

        int idx = 0;   // This will be indexes for brr.

        for(int i=0; i<arr.length; i++){
            if(arr[i] !=0){
                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

        /*
        Example 2: Type code to check if a specific element exists in an array or not.
        int crr[] = {-12, 23, 5}; check if 23 exists in the array or not.
         */

        int crr[] = {-12, 23,5};

        // We'll use for-each-loop in this example coz we don't need to deal with
        // indexes. We'll check the elements only.

        int counter = 0;

        for(int w: crr){
            if(w==23){
                counter++;
            }
        }
        if(counter>0){
            System.out.println("it exists");
        }else{
            System.out.println("it doesn't exist");
        }

        // we can also use the same code to check how many times any character exists.
         System.out.println("There are " + counter + "times 23");

        // better code: Don't put specific value in the code; make a separate container like below

//        int counter = 0;
//        int element = 23;
//
//        for(int w: crr){
//            if(w==element){
//                counter++;
//            }
//        }
//        if(counter>0){
//            System.out.println("it exists");
//        }else{
//            System.out.println("it doesn't exist");
//        }
//
//        // we can also use the same code to check how many times any character exists.
//        System.out.println("There are " + counter + "times 23");
//

















    }
}
