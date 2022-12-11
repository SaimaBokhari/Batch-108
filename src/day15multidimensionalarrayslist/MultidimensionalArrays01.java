package day15multidimensionalarrayslist;

import java.util.Arrays;

public class MultidimensionalArrays01 {
    public static void main(String[] args) {

        /*
        If an array has arrays as elements, it's called "Multidimensional Arrays".
         It stores multiple data that belong to the same data type.
         */

        // How to create Multidimensional Arrays?

        int arr[][] = new int[4][2];

        // first [] is for outer arrays, second [] is for inner array.


        // How to print Multidimensional Arrays?

        System.out.println(Arrays.deepToString(arr)); // [ [0,0], [0,0], [0,0],[0,0], ]
        // We use deepToString() to reach to the depth of the array, means the inner data.

        // How to assign values to Multidimensional Arrays?
        arr[2][1] = 7;
        arr[0][0] = 2;
        arr[0][1] = 3;
        arr[1][0] = 5;
        arr[1][1] = 9;
        arr[2][0] = 10;
        arr[2][1] = 7;
        arr[3][0] = -3;
        arr[3][1] = 8;

        System.out.println(Arrays.deepToString(arr));


       //  String brr[][] = new String[][]; // it complains because arrays need number of elements inside the [].

//        String brr[][] = new String[3][4];   // outer has 3 arrays, inner has 4 arrays.
//        System.out.println(Arrays.deepToString(brr));
       // This one is the long way.


        // Short way to create multidimensional array:

        String brr[][] = {{"Tom", "Jim"},{"Angie"},{"Carl", "Chris", "Ali"}};
        System.out.println(Arrays.deepToString(brr));

        // in the short way, you can make the length of inner elements different.
       //  in the first and long way, you have to keep the length of inner elements same.

        // How to print a specific element from a multidimensional arrays?

        System.out.println(brr[2][1]);  // Chris
        System.out.println(brr[0][0]);  // Tom
//
        //deepToArray is used to print multidimensional array.
        // whereas use normal sout to print a string inside the element.


        // How to print a specific element from outer array?
        // (just like normal array)

        System.out.println(Arrays.toString(brr[2]));

        // Example 1: Type code to find the number of elements in a multidimensional arrays.

        String crr[][] = {{"Tom", "Jim"},{"Angie"},{"Carl", "Chris", "Ali"}};
       // For crr array, the data type of the first element (at the index 0) is array,the data type of that array is String.
        int sum = 0;
        for(String [] w: crr){
            sum = sum + w.length;
        }
        System.out.println(sum);





















    }
}
