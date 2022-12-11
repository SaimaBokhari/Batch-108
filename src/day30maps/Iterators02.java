package day30maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {

        /*
        Example 1: Increase the numbers in a List by 20 percent then print the elements in the reverse order of the given order
                   [20, 60, 30, 100] ==> [24, 72, 36, 120] ==> [120, 36, 72, 24]
         */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(60);
        numbers.add(30);
        numbers.add(100);

        ListIterator<Integer> myItr = numbers.listIterator();

        // logic:  first step .. take the pointer to the right using hasNext() and next()
        while ((myItr.hasNext())){
            myItr.next();
        }

        // 2nd step: pointer is already at the end.. even if we do updates from
        // right to left, order of list elements doesn't change.
        while ((myItr.hasPrevious())){
            Integer element = myItr.previous();
            myItr.set(element * 120/100);
        }
        System.out.println(numbers); // [24, 72, 36, 120] it's still not in reverse order

        // To change the order, we need to use Collections.reverse(numbers)
        Collections.reverse(numbers);
        System.out.println(numbers);


    }
}
