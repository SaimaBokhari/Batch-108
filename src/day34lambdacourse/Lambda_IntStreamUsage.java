package day34lambdacourse;

import day32lambdacourse.UtilsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda_IntStreamUsage {
    public static void main(String[] args) {

        /*
        IntStream is an interface which acts like an artificial list when we don't have actual one/defined one.
        IntStream  is a ready integer list provided by Java.
         */

//        List<Integer> myList = new ArrayList<>();
//        myList.add(8);
//        myList.add(9);
//        myList.add(131);
//        myList.add(10);
//        myList.add(9);
//        myList.add(10);
//        myList.add(2);
//        myList.add(8);

        System.out.println(sumFromSevenToHundred01());

        System.out.println(sumFromSevenToHundred02());

        System.out.println(productOfIntFromTwoToEleven());

        System.out.println(calculateFactorial(-5));

        System.out.println(calculateFactorial2(7));

        System.out.println(sumOfGivenInts(9,-4));

        System.out.println(sumOfDigits(98, 12));
    }

       /* Java created a structure called IntStream to handle numeric values
          without having a numeric list.
          - IntStream is an interface which provides us the list of integers
          - IntStream.range() has the same functionality as for-loop in structural programming
          - range() and rangeClosed() have same function except that for range() first parameter is inclusive
            but the second is not whereas for rangeClosed() both parameters are inclusive
        */

        // 1. Create a method to find the sum of the integers from 7 to 100

    // 1st way:
    public static int sumFromSevenToHundred01(){
       return IntStream.range(7,101).reduce(0,Math::addExact);
       // In range(), first parameter is inclusive but 2nd is exclusive that's why we put 101 so that 100 can be included in our values
    }
    // reduce() is used to tell Java to return the output in a single value

    // 2nd way:

    public static int sumFromSevenToHundred02(){
        return IntStream.rangeClosed(7,100).reduce(0,Math::addExact);
        // In rangeClosed(), both parameters are inclusive, we put 100 because the ending value is inclusive in rangeClosed()
    }

    // 2. Create a method to find the multiplication of the integers from 2 (inc) to 11 (inc).

    public static int productOfIntFromTwoToEleven(){
        return IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);  // 39916800
    }

    // 3. Create a method to calculate the factorial of a given number. (5! ==> 1*2*3*4*5)

    // 1st way:
    public static int calculateFactorial(int x){
        if(x>0) {
            return IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
        }else{
            System.out.println("Don't use negative numbers for factorial operations");
            return 0; // developers usually use this return 0 options to know for the negative numbers
        }
    }

    // 2nd way:
    public static Object calculateFactorial2(int x){ // use Object data type to cover both String and integer
            return x>0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact) : "Don't use negative numbers for factorial operations" ;  // using ternary
    }

    // 4. Create a method to calculate the sum of even integers between two integers.

    public static int sumOfGivenInts(int a, int b){ // in order to handle any negative values, we swap the numbers because a should be smaller than b
        int x=0;
        if(a>b){
            x=a;
            a=b;
            b=x;
        }
      return   IntStream.rangeClosed(a,b).filter(UtilsClass::checkEvenElements).sum();
    }

    // 5. Create a method to calculate the sum of digits of every integers between given two integers
    //     23 and 32 ==> 2+3  2+4  2+5  2+6  2+7  2+8  2+9 3+0  3+1 3+2 ==> for each sum part we will use sum of digits
    // 0-9 are digits
    // we will use modulus (%10) and then divide by 10 to get each digit in a given integer

    public static int sumOfDigits(int a, int b){
        int x = 0;
        if (a>b) {
            x = a;
            a = b;
            b = x;
        }
       return IntStream.rangeClosed(a,b).map(UtilsClass::getSumOfDigits).sum();
    }











}
