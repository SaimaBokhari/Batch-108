package day31lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaFP01 {
    /*
    The Lambda expression is used to provide the implementation of an interface which has functional interface.
    It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing
     the implementation.
     A lambda expression (t-> t%2==0) is a short block of code which takes in parameters and returns a value.

     Lambda expressions are similar to methods, but they do not need a name, and they can be implemented
     right in the body of a method.
     Lambda is a Functional Programming. To type codes in functional programming is shorter and error free.
     In functional programming, we use the methods that were created by Java.
     The usage of structured programing is a longer way to type codes in Java.

     For ex; substring() is created by Java it is error free bec it was created by Java which means that it was tested
     thousands of times before it was deployed. Functional programming can be used for arrays, collections and maps,
     but we cannot use maps directly in functional programming. At the beginning we should convert a map to a
     collection, then we can use maps for functional programming as well ==>How to convert a map into a collection??

      by using entrySet() we can convert a map into a set and set is collection then you can use
      Collections in functional programming.

      1. Lambda is functional programming. IT field started to use Lambda in Java 8.
      2. In functional programming, we focus on "what to do?" but in structured programming language we focus on
         "how to do?"
      3. Functional programming can be used just with Arrays and Collections
      4. By using entrySet() method, Java converts Map to Set then you can use functional programming in Maps as well.
     */


    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(8);
        myList.add(9);
        myList.add(131);
        myList.add(10);
        myList.add(9);
        myList.add(10);
        myList.add(2);
        myList.add(8);
        System.out.println(myList);

        printElements(myList);
        System.out.println();
        printElementsFunctional(myList);

        System.out.println();
        printEvenElements(myList);

        System.out.println();
        printEvenElementsFunctional(myList);

        System.out.println();
        printOddElements(myList);

        System.out.println();
        printOddElementsFunctional(myList);

        System.out.println();
        printSquareOfOddElements(myList);

        System.out.println();
        printCubeOfDistinctOddElements(myList);

        System.out.println();
        sumOfSquareOfDistinctEvenElements(myList);

        System.out.println();
        productOfCubesOfDistinctEvenElements(myList);

        System.out.println();
        getMaxElement(myList);

        System.out.println();
        getMaxElement1(myList);

        System.out.println();
        getMinElement(myList);

        System.out.println();
        getMinElement1(myList);

        System.out.println();
        getMinElement2(myList);

    }
      /* 1. Create a method to print the elements on the console in the same
            line with a space between two consecutive elements.
         */


    public static void printElements(List<Integer> list){
        // structured programming language:

        for(Integer w: list){
            System.out.print(w + " " );
        }

    }
    // functional programming language:
    public static void printElementsFunctional(List<Integer> list){
        list.stream().forEach(t -> System.out.print(t + " "));   // t is like w in for-each loop
    }

    /*
      2.  Create a method to print the even elements from the list on the console in the same
           line with a space between two consecutive elements.
     */
    public static void printEvenElements(List<Integer> list){
        // structured programming language:
        for (Integer w: list){
            if(w%2==0){
                System.out.print(w + " ");
            }
        }
    }

    // functional programming language:
    public static void printEvenElementsFunctional(List<Integer> list){
        list.stream().filter(t-> t%2==0).forEach(t -> System.out.print(t + " "));
    }

    public static void printOddElements(List<Integer> list){
        // structured programming language:
        for (Integer w: list){
            if(w%2!=0){
                System.out.print(w + " ");
            }
        }
    }

    // functional programming language:
    public static void printOddElementsFunctional(List<Integer> list){
        list.stream().filter(t -> t%2!=0).forEach(t -> System.out.print(t + " "));
    }

    /*
    3. Create a method to print the square of odd list elements on the console
    in the same line with a space between two consecutive elements
     */

    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter(t -> t%2 !=0).map(t-> t*t).forEach(t -> System.out.print(t + " "));
    }                                  // map() is used for changing/updating the value of the elements .. for mathematical operation in this code


    // 4. Create a method to print the cube of distinct(different) odd list elements
    public static void printCubeOfDistinctOddElements(List<Integer> list){
        list.stream().distinct().filter(t -> t%2 !=0).map(t-> t*t*t).forEach(t -> System.out.print(t + " "));
    }              // distinct() is used to get unique elements / remove repeated elements

    // Note: the order of methods for functional language is important


    // 5. Create a method to calculate the sum of the squares of distinct even elements.
    public static void sumOfSquareOfDistinctEvenElements(List<Integer> list){
        Integer sum = list.stream().distinct().filter(t -> t%2 ==0).map(t-> t*t).reduce(0, (t,u) -> t+u);  // for sum make the first parameter zero
        System.out.print(sum);    // reduce() returns single value/element
        /* Notes about reduce():
          0 stands for sum container; t and u the values that Java will add(square of the unique even numbers)
          reduce() method will take all the  squares and reduce them into a one single sum value

         */
    }

    // 6. Create a method to calculate the product of the cubes of distinct even elements

    public static void productOfCubesOfDistinctEvenElements(List<Integer> list){
        Integer product = list.stream().distinct().filter(t -> t%2==0).map(t -> t*t*t).reduce(1, (t,u) -> t*u);
        System.out.println(product);
        // reduce() returns single value/element
    }

    // 7. Create a method to find the maximum value from the list elements.

    //1st way:
    public static void getMaxElement(List<Integer> list){
       Integer maxValue = list.stream().reduce(Integer.MIN_VALUE, (t,u) -> t>u ? t : u);     // using ternary here t>u?t:u
        System.out.println(maxValue);

//Java will take the elements one by one with the help of stream() method
//And then eliminate repeated ones the help of distinct() method
//And then compare the elements with the Min Integer Value with the help of Integer Wrapper Class Min_Value() method
//And then return  the greater value with the help of Ternary Structure
    }

    // 2nd way:

    public static void getMaxElement1(List<Integer> list) {
        Integer maxValue = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        // sorted() always puts the elements in ascending order
        System.out.println(maxValue);
    }

    // Homework: Create a method to find the minimum value of the list element (in 2 ways)

    //1st way:
    public static void getMinElement (List<Integer> list){
        Integer minValue = list.stream().reduce(Integer.MAX_VALUE, (t,u) -> t<u?t:u);
        System.out.println(minValue);
    }

    //2nd way:

    public static void getMinElement1(List<Integer> list){
        Integer minValue1 = list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t, u) -> u);
        System.out.println(minValue1);             // Comparator.reverseOrder() will reverse the stream and put in descending order
    }

    // 3rd way:
    public static void getMinElement2(List<Integer> list){
       Integer minValue1 = list.stream().distinct().sorted().findFirst().get();
        System.out.println(minValue1);
    }

}
