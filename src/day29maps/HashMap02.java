package day29maps;

import java.util.HashMap;
/*
        1)When you create a HashMap, Java creates 16 "buckets" in memory and index them from 0 to 15
        2)When you use "put()" method, Java creates an integer HashCode and calculates HashCode%16
        3)The result of HashCode%16 will be the index to select bucket
        4)After selecting bucket, Java will put the entry into the selected bucket as a node of a Linked list
        5)Every node will have 4 parts in it i)HashCode ii)Key iii)Value  iv)Pointer
        6)Java makes every HashCode unique but sometimes Java can create same HashCodes accidentally, this is called "HashCode Collision"
        7)"HashCode Collisions" are common phenomena of hashing functions.
        8)If the key is "null" hashcode will be zero, that's why the entry whose key is "null" will
          be put into the bucket whose index is zero
     */

public class HashMap02 {
    public static void main(String[] args) {

        //                    Mechanism in HashMap

        HashMap<String, Double> coursePrices = new HashMap<>();
        // this code creates 16 buckets (boxes) with indexes.

        coursePrices.put("Full Stack Java Development", 6000.00);
        /* when you put an entry, Java creates an Integer Hashcode for the key part,
            e.g. Integer Hashcode -> 33%16=1 (so this entry will go in bucket 1.
            Inside the bucket, Java will create 4 boxes. in the first goes, Hashcode, in the 2nd one,
            goes the key "Full Stack Java Development", in the 3rd one, goes value "6000.00",
            and the 4th box has pointer.

            If you put another entry which has the same index i.e. 1... Java will create 4 more
            boxes next to the pointer of the first entry and create a Linked List structure.

            Indexes can be shared but Hash codes are usually unique.
            Sometimes Java can accidentally create same Hash codes .. it's called "Hash Collision"

         */

        coursePrices.put("Full Stack Automation Engineer", 5800.00);
        coursePrices.put("SalesForce Development", 4500.00);
        System.out.println(coursePrices);














    }
}
