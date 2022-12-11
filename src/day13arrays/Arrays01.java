package day13arrays;

import java.util.Arrays;

public class  Arrays01 {

    /*
        When we create byte, short, int, long, float, double, char, boolean containers we can store just a single value in them
        Sometimes we need to store multiple values in a single container.
        To be able to store multiple values Java created a new structure, its name is "Array".

        Note: Arrays are to store multiple data  that belong to same data type.
              You cannot store different data types in an array.
         */

    public static void main(String[] args) {

        // How to create an Array: (syntax) Arrays is a class name. There are many methods in Arrays class.
        // container/ data  type   variable name   []  = new  datatype [];
        // need to put number of elements inside the array [] otherwise it shows error.

        String names [] = new String[5];

        // How to print an Array?

        // initially Java will put 'null' as default value for String.
        System.out.println(Arrays.toString(names)); // [null, null, null, null, null]

        // Arrays is a class name; toString() is a method... it prints the Array by it's name (mentioned in the().
        // Arrays have indexes for the elements.

        names[1] = "Tom";
        names[4] = "Mark";
        names[2] = "Mary";
        names[0] = "Jim";
        names[3] = "Suzan";
        System.out.println(Arrays.toString(names));

        //How to print a specific element in an Array?

        System.out.println(names[3]);

        /*
        Example 1: Create an integer array and print the sum of the first
         and the last elements on the console.
         For numbers, default values in Java is zero.
         */

        int ages [] = new int[9];
        System.out.println(Arrays.toString(ages));

        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 25;
        ages[3] = 14;
        ages[4] = 12;
        ages[5] = 17;
        ages[6] = 14;
        ages[7] = 29;
        ages[8] = 75;
        System.out.println(Arrays.toString(ages));

        System.out.println(ages[0] + ages[ages.length-1]);

        /*
        Example 2: Create a double array and find the sum of all elements in the array
                  [1.2, 2.3, 5.0, 4.51] ==> 13.01
         */
        double prices [] = new double[4];
        prices[0] = 1.2;
        prices[1] = 2.3;
        prices [2] = 5.0;
        prices [3] = 4.51;

        System.out.println(Arrays.toString(prices));

        // 1st way:
       double sum = 0;   // to store new value

        for(int i=0; i<prices.length; i++){   // we use prices.length to get the last index in Arrays.
            sum = sum + prices[i];
        }
        System.out.println(sum);

        /* 2nd way: We will solve the task by using for-each-loop.
        for-each-loop can be used with Arrays and Collections.
        How to construct for-each-loop?

        for(data type of the arrays w: name of the array ){}
         */

        double sum1 = 0;

        for(double w : prices){
            sum1 = sum1 + w;     // w is just the name of the value. Just like we always use i in for loops.
        }
        System.out.println(sum1);













    }
}
