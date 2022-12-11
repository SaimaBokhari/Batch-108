package day28collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    /*
    1. Queues are for storing multiple non-primitive data in the same data type. (because it's a Collections)
    2. Queues are used for FIFO (First In First Out)
       e.g. application for a warehouse ... selling products in a warehouse.. FIFO
       like balls coming out through a tube .. first comes out first from the bottom

Queues are interfaces but it uses constructor.. (but Interfaces don't have constructors)
two options:
a) constructor from LinkedList
b) constructor from PriorityQueue

     */
    public static void main(String[] args) {
        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse); // [Milk, Meat, Bread, Honey, Tomatoes] in insertion order

        //wareHouse.poll();   // Retrieves (gives you) and removes the head of this queue or returns null if this queue is empty.
        String element1 = wareHouse.poll();
        System.out.println(element1);  // Milk
        System.out.println(wareHouse); // [Meat, Bread, Honey, Tomatoes]

        // poll() is good for selling products in the warehouses/supermarket or any other selling functionality

        // wareHouse.peek(); // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        String element2 = wareHouse.peek(); // Meat
        System.out.println(wareHouse); // [Meat, Bread, Honey, Tomatoes]


        String element3 = wareHouse.element(); // Retrieves, but does not remove, the head of this queue. This method differs
                             // from peek only in that it throws an exception if this queue is empty.

        System.out.println(element3); // Meat
        System.out.println(wareHouse);  // [Meat, Bread, Honey, Tomatoes]


        Queue<String> emptyWareHouse = new LinkedList<>();
        String element4 = emptyWareHouse.peek();
        System.out.println(element4); // null

//        String element5 = emptyWareHouse.element();
//        System.out.println(element5); // NoSuchElementException

        // If the Queue is empty, element() throws NoSuchElementException. It's RunTime (Unchecked) Exception.


        /*
        Inserts the specified element into this queue if it is possible to do so immediately
        without violating capacity restrictions. When using a capacity-restricted queue,
        this method is generally preferable to add(), which can fail to insert an element
        only by throwing an exception.
        Returns true if the element was added.

        Throws:
ClassCastException – if the class of the specified element prevents it from being added to this queue
NullPointerException – if the specified element is null and this queue does not permit null elements
IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */

        boolean result1 = wareHouse.offer("Chocolate");
        System.out.println(result1);  // true
        System.out.println(wareHouse); // [Meat, Bread, Honey, Tomatoes, Chocolate]


        /*
     remove()   Retrieves and removes the head of this queue.
               This method differs from poll() only in that it throws an exception if this queue is empty.
Returns: the head of this queue
Throws:
NoSuchElementException – if this queue is empty
         */
       String element6 = wareHouse.remove();
        System.out.println(element6); // Meat
        System.out.println(wareHouse);  // [Bread, Honey, Tomatoes, Chocolate]

        String element7 = emptyWareHouse.poll();
        System.out.println(element7);  // null
        String element8 = emptyWareHouse.remove();
        System.out.println(element8); // NoSuchElementException


    }
}
