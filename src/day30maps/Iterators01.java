package day30maps;

import java.util.*;

public class Iterators01 {

    /*
       Iterator is an object that can be used to loop through collections. (like ArrayList and HashSet).
       It is called an "iterator" because "iterating" is the technical term for looping.
       To use an iterator, you must import it from the java.util library.

       We have for-loop, while-loop, do-while-loop and for-each-loop.

       for-each-loop is better to use because it is easier to use and its performance is better
       than the others.
       But by using for-each-loop it is impossible to remove or modify a collection.

       Therefore, Java created a new structure to be able to remove some elements from a Collection
       or modify a collection.

       The new structure is called "Iterators".
            There are 2 iterators
            i)Iterator: Has one direction, from right to left. Iterator is just for removing element/s
            ii)List Iterator: Has two directions from right to left and from left to right. (Bi-directional)
                              ListIterator can be used to update as well.

            "for-each-loop" and "iterators" have same performance but iterators are the best to remove
            elements or to modify elements in a collection
     */
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1);//[Ali, Can, Aliye]

        //Example 1: Update every element by putting "!" to end
        //1.Way: for-each-loop could not update the collection without using set() method

        for(String w: list1) {
            w = w+"!";
        }
        System.out.println(list1); // [Ali, Can, Aliye] no update
        // list is not being updated despite this w = w+"!"; because for-each loop cannot update a collection.

//        for(String w: list1) {
//            list1.set(list1.indexOf(w), w+"!");
//        }
//        System.out.println(list1); // [Ali!, Can!, Aliye!]
        // if we use set() for list to update it, it works. But here list is not being updated because of
        // for-each loop, it's being updated because of set() which has iterator behind.
        // same stands true for remove(). It has iterator behind it.

        //2.Way: By using iterators

        ListIterator<String> itr = list1.listIterator();

        while(itr.hasNext()){
           String element = itr.next();
           itr.set(element + "*");
        }
        System.out.println(list1); // [Ali*, Can*, Aliye*]

        /*
        Note: When you deal with iterators, you need to be careful where the last position of the pointer
              is e.g. in above example after finishing the loop and printing [Ali*, Can*, Aliye*], the pointer is
              still after Aliye*. So we try to use another iterator after this, the pointer will tell false as it can't
              see the next element, the loop will not run and broken in the very first step.
              So it will keep printing the same result again and again.

              Inorder to deal with that situation, we need to use LitIterator as
              that is Bi-directional and go in backwards order as well.
         */

        while(itr.hasPrevious()){
            String element = itr.previous();
            itr.remove();
        }
        System.out.println(list1); // []



        //Remove all elements by using iterator
//        Iterator<String> itr1 = list1.iterator();  // iterator() will convert list into iterator data type. looks the same but you should know data type is different
//        while (itr1.hasNext()){
//           String element= itr1.next();
//           itr1.remove();
//        }
//        System.out.println(list1); // []

        /*

        1. hasNext() will go to the pointer and ask do you have an element after you, if true, loop starts running, if false, loop doesn't run.
        2. next() gets the element after the pointer, and put it in the String container "element".
            Then it takes the pointer and puts it after the first element.

         */










    }
}
