package day32lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP01 {
    /*
    1. Lambda is Functional Programming
         functions in FP  is called in methods in Java.
         functions are existing methods (ready-made by Java and tested by Java hence more reliable)
    2. Functional Programming was added to Java in Java 8, before we were using just Structured Programming
        But now we are able to use both.
    3. Structured Programming focuses on "How to do" most of the time , Functional Programming focuses on
        "What to do".
    4. Functional Programming is used with Collections(lists, sets, queue)  and Arrays.





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

        getMinGreaterThanSeven(myList);
        System.out.println();

        getMinGreaterThanSeven2(myList);
        System.out.println();

        getHalfOfDistinctElementsInReverseOrder(myList);



    }

    /* 1. Create a method to fid the minimum value which is greater than 7
           and even elements from the list.
         */

    // 1st way:
    public static void getMinGreaterThanSeven(List<Integer> list){
        Integer minValue = list.stream().distinct().filter(t -> t%2==0).filter(t -> t>7).sorted().findFirst().get();
        System.out.println(minValue);
        // Use findFirst().get() methods together to get the output in integer.
    }

    // 2nd way:
    public static void getMinGreaterThanSeven2(List<Integer> list){
        Integer minValue = list.stream().distinct().filter(t -> t>7 && t%2==0).reduce(Integer.MAX_VALUE, (t,u) -> t<u?t:u);
        System.out.println(minValue);
    }


    /*
       2. Create a method to find the half of the elements which are
          distinct and greater than 5 in reverse order in a list
     */

    public static void getHalfOfDistinctElementsInReverseOrder (List<Integer> list){
       List<Double> result = list.
                             stream().
                             distinct().
                             filter(t -> t>5).
                             map(t -> t/2.0).
                              sorted(Comparator.reverseOrder()).
                              collect(Collectors.toList());
        System.out.println(result);
    }










}
