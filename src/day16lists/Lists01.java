package day16lists;

import java.sql.Array;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        /*
        When you create an Array, you have to declare the length of the Array.
        But when you use "Lists" no need to declare the number of elements at the beginning.
        "Lists" are flexible for length but Arrays are not.
        Lists are for storing multiple data in the same data type.
        Lists store non-primitive data types, Arrays cannot.
        Lists cannot store primitive data types.
        Lists have many useful methods, Arrays do not.

        Arrays are so fast.
        Arrays uses less memory.

         */

        // How to create a List (the official name is ArrayList).

   // 1. Way:

    ArrayList<Integer> myList = new ArrayList<Integer>();
  // 2. way:

  ArrayList<Integer> myList2 = new ArrayList<>();

  // 3 way: is shorter and preferable

        List<Integer> myList3 = new ArrayList<>();

        // How to print a list on the console?
        System.out.println(myList3);
        // just put the name of the variable... no need to add Arrays.toString().
        // We don't need to add number of elements in the lists that's why it can print empty on the console.


        // How to add elements into a list?
        // Note: add() puts the elements in insertion order.

        myList3.add(12);
        myList3.add(7);
        myList3.add(23);

        System.out.println(myList3);  // [12, 7, 23]

        // How to add an element into a specific index?

        // To insert an element in the middle somewhere, use add() (second from the dropdown list) with index and Integer
        myList3.add(1,50);
        System.out.println(myList3);     // [12, 50, 7, 23]

        myList3.add(3,99);
        System.out.println(myList3);     // [12, 50, 7, 99, 23]


        // How to join two lists?

        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b = new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        a.addAll(b);
        System.out.println(a);    // [A, B, X, Y, Z]
        System.out.println(b);    // [X, Y, Z]

        // to add (x,y,z) in the middle of list a

        a.addAll(1,b);
        System.out.println(a);   // [A, X, Y, Z, B, X, Y, Z]

        // How to get the number of elements in a list?

        int sizeOfA = a.size();
        System.out.println(sizeOfA);  // 8

        int sizeOfB= b.size();
        System.out.println(sizeOfB);  // 3

        // Note: When we need the number of elements for Arrays, we use length();
        // for the lists, use size().

        /*
        Example 1: Type code to check if the given list is empty or not?
         */

//          my solution:
//        boolean isListA = a.isEmpty();
//        System.out.println(isListA);


        // 1. way:

        List<Character> c = new ArrayList<>();  // it won't take char as it is primitive data type . so we add its wrapper class.

        c.add('x');
        c.add('y');

        int sizeOfC = c.size();
        if(sizeOfC==0){
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");
        }

        // 2. way:

        /* Java created a method to check if the list is empty or not?
         c.isEmpty(); isEmpty method returns true if the list has no elements;
         and returns false if the list has at least one element.

         */

        boolean isEmpty = c.isEmpty();

        if(isEmpty){
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");
        }

        // Note: If Java has created a method for a specific function, use the method. It's preferable and recommended.
        // 2nd way is better here, Java has fewer tasks to do, so works faster.

        /*
        Example 2: Type code to check if the list doesn't have any element different from space.
        or the list doesn't have any element.
        [] ==> acceptable   [ , , ] ==> acceptable   [a] ==> not acceptable

         */

        List<String> d = new ArrayList<>();
        d.add(" ");
        d.add(" ");
        d.add(" ");
        // d.add("a");
          System.out.println(d);       // [ , , , a]

  // To be able to use removeAll() method, you need List, that's why we created a list that contains space character.
  // removeAll() is used to remove multiple elements from a list.
  // When you use removeAll (), you will need a list that store those elements you want to remove.


          List<String> e = new ArrayList<>();
          e.add(" ");    // e has just space.

        d.removeAll(e);
          System.out.println(d);       // [a]

          if(d.isEmpty()){
                System.out.println("The list is empty or has just space character");
          }else{
                System.out.println("The list has a character/s different from space character");
          }


//          // remove () suggested by a student.
//          e.add(" ");
//          e.add("a");
//          boolean isTrue = d.remove(" ");
//          System.out.println(d);
//





    }

}
