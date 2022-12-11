package day32lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP02 {
    /* c odes starting like this  (t -> t**) is called lambda expressions
       1. "variable or variables" ==> "logic" ==> this structure is called "lambda expressions"
       2. In Functional Programming, we can use "lambda expressions", it is allowed but not recommended
          Instead of "lambda expressions", we prefer "method reference".
       3. "Method Reference" is Class Name::Method Name
           For example:             String::Length (Do not type method parenthesis, just the name)
                                    Arrays::toString
                                    Utility::getCube

           You can use your own class to create the required methods for your application.
           For instance: You created "Animal" class, and you created eat() ==> Animal ::eat
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

        printEvenElementsFunctional(myList);
        System.out.println();

        printEvenElements(myList);
        System.out.println();

        printSquareOfOddElements(myList);
        System.out.println();

        printCubeOfDistinctOddElements(myList);
        System.out.println();

        sumOfSquareOfDistinctEvenElements(myList);
        System.out.println();

        sumOfSquareOfDistinctEvenElements02(myList);
        System.out.println();

        productOfCubesOfDistinctEvenElements(myList);
        System.out.println();

        getMaxElement(myList);
        System.out.println();

        getMinGreaterThanSevenEvenNum(myList);

        getHalfOfDistinctEleInReverseOrder(myList);





    }

     /* 1. Create a method to print the elements on the console in the same
            line with a space between two consecutive elements.
         */

    public static void printEvenElementsFunctional(List<Integer> list) {
        //list.stream().forEach(System.out::print);      // prints 891311091028 with no space

        /*
         Create your own Utility class (like a storage), create your own methods with method body
         and conditions according to the task (if any) that you're going to use again and again. then you don't need to type
         them again in your solution. You can just use :: and refer the method name. It will act as a
         library created by you.

         */
        list.stream().forEach(UtilsClass::printWithSpace);  //prints the output with required condition 8 9 131 10 9 10 2 8
    }

    /*
      2.  Create a method to print the even elements from the list on the console in the same
           line with a space between two consecutive elements. (Functional with method reference)
     */
    public static void printEvenElements(List<Integer> list){
     list.stream().filter(UtilsClass::checkEvenElements).forEach(UtilsClass::printWithSpace);
    }

    /*
    3. Create a method to print the square of odd list elements on the console
    in the same line with a space between two consecutive elements
     */

    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter(UtilsClass::checkOddElements).map(UtilsClass::getSquare).forEach(UtilsClass::printWithSpace);
    }

    // 4. Create a method to print the cube of distinct(different) odd list elements (Functional Method Reference)

    public static void printCubeOfDistinctOddElements(List<Integer> list){
        list.stream().distinct().filter(UtilsClass::checkOddElements).map(UtilsClass::getCube).forEach(UtilsClass::printWithSpace);
    }

    // 5. Create a method to calculate the sum of the squares of distinct even elements.

    // 1st way:
    public static void sumOfSquareOfDistinctEvenElements(List<Integer> list){
     Integer sum = list.stream().distinct().filter(UtilsClass::checkEvenElements).map(UtilsClass::getSquare).reduce(0,Math::addExact);
        System.out.println(sum);
    }

    // 2nd way:
    public static void sumOfSquareOfDistinctEvenElements02(List<Integer> list){
        Integer sum = list.stream().distinct().filter(UtilsClass::checkEvenElements).map(UtilsClass::getSquare).reduce(0,Integer::sum);
        System.out.println(sum);
    }


    // 6. Create a method to calculate the product of the cubes of distinct even elements

    // 1st way:
    public static void productOfCubesOfDistinctEvenElements(List<Integer> list){
        Integer product = list.stream().distinct().filter(UtilsClass::checkEvenElements).map(UtilsClass::getCube).reduce(1,Math::multiplyExact);
        System.out.println(product);
    }

//    // 2nd way:
//    public static void productOfCubesOfDistinctEvenElements02(List<Integer> list){
//        Integer product = list.stream().distinct().filter(UtilsClass::checkEvenElements).map(UtilsClass::getCube).reduce(1,Integer::m);
//        System.out.println(product);
//    }

    // 7. Create a method to find the maximum value from the list elements.
    public static void getMaxElement(List<Integer> list){
       Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);
    }

    // 8. Create a method to find the minimum value of the list element (in 2 ways)

    // by using method reference
//    public static void getMinElement (List<Integer> list){
//        list.stream().distinct()
//    }

    // 9.  Create a method to find the minimum value which is greater than 7 and
    // even elements from the list

    public static void getMinGreaterThanSevenEvenNum(List<Integer> list){
       Integer min = list.stream().filter(t -> t>7).filter(UtilsClass::checkEvenElements).reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }

    /*
     If we know that we are going to use this "greater than 7" condition again and again,
     create method in the UtilsClass
    public static boolean isGreaterSeven(int a){
    if(a>7)
    {
        return true;
    }else return false;

    But because it's very specific task for this question, we can just type lambda expression within
    our code, and we don't have to create that method in UtilsClass.
}
     */

    // 10. Create a method to find the half of the elements which are distinct and greater than
    //     5 in reverse order in a list

    public static void getHalfOfDistinctEleInReverseOrder(List<Integer> list){
        List<Double> revList= list.
                                   stream().
                                   distinct().
                                   filter(t -> t>5).
                                   filter(UtilsClass::checkEvenElements).
                                   map(UtilsClass::getHalf).
                                   sorted(Comparator.reverseOrder()).
                                   collect(Collectors.toList());
        System.out.println(revList);

    }


/*
//String Class is "immutable" because of that it does not change existing value.
//If you want to assign a new value to a variable, Java will create a new container inside the "String Pool"
//then will put new value in it, then changes the address pointer to the new container.
 */



}


