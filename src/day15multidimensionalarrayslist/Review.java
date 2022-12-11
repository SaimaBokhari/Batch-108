package day15multidimensionalarrayslist;

import java.util.Arrays;

public class Review {
    public static void main(String[] args) {

        // Example 1: Type code to find the number of elements in a multidimensional arrays.
        String crr[][] = {{"Tom", "Jim"},{"Angie"},{"Carl", "Chris", "Ali"}};

        int sum=0;
        for(String[] w: crr){
          sum = sum + w.length;
        }
        System.out.println(sum);

         /*
        Example: Print the element which have "a" from two Multidimensional Arrays.
         */

        for(String[] w: crr){
            for(String u: w){
                if(u.contains("a") || u.contains("A")){
                    System.out.print(u + " ");
                }
            }
        }

        System.out.println();

        //Example 2: Create an integer multidimensional array then find the sum of the elements
        int brr[][] = { {12, 54}, {3, 2, 7}, {21} };

        int sum1 = 0;
        for(int[] w: brr){
            for(int u: w) {
                sum = sum + u;
            }
        }
        System.out.println(sum);

        System.out.println();

        /*
        Convert Multidimensional Arrays to one dimensional arrays.
        {{"Learn", "Java", "it"}, {"is", "easy"}} ==> { "learn", "java", "it", "is", "easy"}
         */

        String arr[][] = {{"Learn", "Java", "it"}, {"is", "easy"}};

        //Step 1: get the number of elements
        int sum2 =0;
        for(String[] w: arr){
             sum2 = sum2 + w.length;
        }
        System.out.println(sum2);

        //Step 2: create one dimensional arrays and assign the number of elements (with default value "null")
        String drr[] = new String[sum2];
        System.out.println(Arrays.toString(drr));

        // Step 3: Transfer the String data to the null elements.

       int idx = 0;

        for(String[] w: arr){
            for(String u:w){
                drr[idx] = u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(drr));

        System.out.println();

        /*
      Example:
      Find the maximum element in a two-multidimensional Arrays.
        { {5,0}, {-2,4}, {65, -12, 23} }
       */

        int grr[][] = { {5,0}, {-2,4}, {65, -12, 234} };

        int max = grr[0][0];

        for(int[] w: grr){
            for(int u: w){
                if(max<u){
                    max=u;
                }
            }
        }
        System.out.println(max);

        System.out.println();















    }
}
