package day15multidimensionalarrayslist;

import java.util.Arrays;

public class MultidimensionalArrays03 {
    public static void main(String[] args) {

        /*
        Convert Multidimensional Arrays to one dimensional arrays.
        {{"Learn", "Java", "it"}, {"is", "easy"}} ==> { "learn", "java", "it", "is", "easy"}
         Logic:
         Mlti... will be given (input), one dime.... would be the output
         */

        String arr [][] = {{"Learn", "Java", "it"}, {"is", "easy"}};

        // First step: Find the total number of elements in the given multidimensional arrays.

        int sum = 0;
        for(String [] w: arr){       // w is the name of the container in the loop which will have the element every repeat of the loop
            sum = sum +w.length;
        }

        // Step 2: Create one dimensional array by using the total number of elements in multidimensional arrays.
        String brr[] = new String[sum];
        System.out.println(Arrays.toString(brr));

        // Step 3: Transfer the elements from multidimensional to one dimensional arrays.


        int idx = 0;    // to transfer the elements, we need index.

        for(String[] w: arr){
            for(String u:w){
                brr[idx] = u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));










    }
}
