package day28collections;

import java.util.Deque;
import java.util.LinkedList;

public class Queues02 {

    /*
    Deque's are storing multiple non-primitive data in the same data type. (because it's a Collections)

    Deque means "Double Ended Queue".. it works successfully in FIFO and LIFO(Last In, First Out) operation
    like loaded truck.. when you are unloading, you take last-in first.
     like balls through a tube.. you allow the user to take the balls from either side: top and bottom

     Queues can have repeated data values
     */
    public static void main(String[] args) {

        Deque<String> furnitureTruck = new LinkedList<>();

        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dinning Table");
        System.out.println(furnitureTruck); // [Chair, Mirror, Sofa, Bed, Dinning Table]

        /*
        Pushes an element onto the stack represented by this deque (in other words,
        at the head of this deque) if it is possible to do so immediately without
        violating capacity restrictions, throwing an IllegalStateException if no
        space is currently available.
This method is equivalent to addFirst.
Params:
e – the element to push
Throws:
IllegalStateException – if the element cannot be added at this time due to capacity restrictions
ClassCastException – if the class of the specified element prevents it from being added to this deque
NullPointerException – if the specified element is null and this deque does not permit null elements
IllegalArgumentException – if some property of the specified element prevents it from being added to this deque

         */
        furnitureTruck.push("TV Unit");
        System.out.println(furnitureTruck); // [TV Unit, Chair, Mirror, Sofa, Bed, Dinning Table]

        /*
        Pops an element from the stack represented by this deque. In other words, removes and
        returns the first element of this deque.
This method is equivalent to removeFirst().
Returns:
the element at the front of this deque (which is the top of the stack represented by this deque)
Throws:
NoSuchElementException – if this deque is empty
         */
        furnitureTruck.pop();
        System.out.println(furnitureTruck); // TV Unit should be removed

        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        System.out.println(furnitureTruck); // [Chair, Mirror, Sofa, Bed, Dinning Table, Bed, Bed]

        furnitureTruck.removeLastOccurrence("Bed");
        System.out.println(furnitureTruck); // [Chair, Mirror, Sofa, Bed, Dinning Table, Bed]

        furnitureTruck.removeLast();
        System.out.println(furnitureTruck);  // [Chair, Mirror, Sofa, Bed, Dinning Table]

    }
}
