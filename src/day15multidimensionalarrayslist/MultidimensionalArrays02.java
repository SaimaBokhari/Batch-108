package day15multidimensionalarrayslist;

public class MultidimensionalArrays02 {
    public static void main(String[] args) {
        /*
        Example: Print the element which have "a" from two Multidimensional Arrays.

         */

        String arr[][] = {{"Learn", "Java", "it"}, {"is", "easy"}};
        // we need to check each element in the inner array whether it has "a" or not. But first we need to go the outer array.

        for(String[] w: arr) {         // with this part of the code, we tell Java to go to the first element (of the outer loop) which is a String arrays.
            for (String u: w){        //   (Then we'll go to the first element of the inner array which is a normal String. so we don't use [].
                if (u.contains("a")) {
                    System.out.print(u + " ");
                }
            }
        }

// Note: nested loops are not recommended. coz it takes more time to run.

        System.out.println("========================");
        /*
        Example: 2
        Create an integer multidimensional array then find the sum of the elements
        int brr[][] = { {12, 54}, {3, 2, 7}, {21} };
         */

        int brr[][] = { {12,54}, {3,2,1}, {21} };

        int sum = 0;
        for(int[] w: brr){
            for(int u: w){
                sum = sum +u;
            }
        }
        System.out.println(sum);









    }

}
