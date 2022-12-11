package day27exceptionscollections;

import java.util.Collections;
import java.util.LinkedList;

/*
Collections are for storing multiple data in the same data type. (like Arrays but more advanced)
Collections are flexible (in length). Arrays are fixed (in length).
Collections have many useful methods. (advanced structure but slower than Arrays as they use a lot of memory)

There are three main Collections:
   1) List(interface)  ==>  a) ArrayList  (concrete class)     b) LinkedList (concrete class)
   2) Queue ==>  a)Priority Queue   b) Deque
   3) Set   ==>  a) HashSet         b) LinkedHashSet   c) TreeSet

   a) ArrayLists are successful in "search operations" but not good at "adding" and "removing" operations.
   b) LinkedList are successful in "adding" and "removing" operations but not good at "search operations".

Structural difference:
   LinkedLists have "nodes" , not elements. "Nodes" consist of 2 parts 1) data  2) pointer
   "Pointer" act like index but is not an index.

Functional difference:
   When we add or remove any node, LinkedLists don't have to re-index all the remaining data that's why it is
   successful at adding and removing.
   When we add/remove data from LinkedLists , it adds another node (data+pointer) in the middle or remove it in
   removing operation, but doesn't change/check the other nodes.

Collections are interface.
Interfaces don't have constructors.
In Collections, we store Non-Primitive data

 */
public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        // LinkedList is a concrete class. It has constructor ==>LinkedList<>()

        visitors.add("Tom");
        visitors.add("Jane");
        visitors.add("Mary");
        visitors.add("Carl");
        visitors.add("Ali");
        System.out.println(visitors);  // [Tom, Jane, Mary, Carl, Ali]

       // Note: add() comes from List interface. It was an abstract method in interface,
       // so it is overridden when used in its concrete classes ArrayList or LinkedList.

        // Both ArrayLists and Linked lists look the same but their data type is different.

        visitors.addLast("Mahmut");
        System.out.println(visitors);  // [Tom, Jane, Mary, Carl, Ali, Mahmut]

        visitors.addFirst("Chris");
        System.out.println(visitors);  //[Chris, Tom, Jane, Mary, Carl, Ali, Mahmut]


        LinkedList<String> kids = new LinkedList<>();

        kids.add("Abc");
        kids.add("Xyz");
        visitors.addAll(kids);
        System.out.println(visitors); // [Chris, Tom, Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]


        visitors.add(2, "Miami");
        System.out.println(visitors);
        // Normally, LinkedLists don't use indexes. Java displays it as 'index' to make usage easy for us.


        visitors.addAll(6, kids);
        System.out.println(visitors);

        visitors.remove(2);
        System.out.println(visitors); // should remove "Miami"

        visitors.remove("Abc");
        System.out.println(visitors); // remove() removes the first occurrence of that object.

        visitors.removeFirst();
        System.out.println(visitors);

        visitors.remove();
        System.out.println(visitors); // this does the same as removeFirst(), but removeFirst() is more specific.

        visitors.removeFirstOccurrence("Xyz");
        System.out.println(visitors);

        visitors.removeLastOccurrence("Xyz");
        System.out.println(visitors);

        // Example 1: Change all names that start with 'A' to '****'

        for(String w: visitors){
            if(w.startsWith("A")){
                visitors.set(visitors.indexOf(w), "****");
            }
        }
        System.out.println(visitors);

        // LinkedList is mutable because we are able to change the nodes (elements).


        // Example 2: If the number of characters more than 4 , remove them from the list.

        // Interview question

        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexander");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);

        // Don't use for-each loop if you need indexes in your solution
        // because it doesn't use indexes.

        for(int i=0; i<names.size(); i++){
            if(names.get(i).length()>4){
                names.remove(names.get(i));
                i--;
            }
        }
        System.out.println(names);


    }

}
