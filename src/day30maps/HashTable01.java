package day30maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
           1)Hashtable is a Map
           2)Hashtable does not put entries to any order
           3)Hashtable is slower than HashMap
           4)Hashtable is thread-safe and synchronized, HashMap is not

           Note: When you use multi-thread you need to create an order for the threads,
           this is called "synchronization"

           For example: cooking different items for dinner simultaneously. (multi-thread)

           Hash maps cannot be used for multi-threads but Hashtable can be.

           "synchronization" means creating sensible order for multi-threads.
    */

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 85000000);
        countryPopulations.put("Turkey", 81000000);

        System.out.println(countryPopulations);

       // Example 1: Store students' names together with their emails, ages, grades and nationality.
        // Tom Hanks = th@gmail.com, 21, 2, American

        Hashtable<String, Students> studentsInfo = new Hashtable<>();
        // we'll use Student class as data type.
        // Every class is a non-primitive data type created by us.
        // we can use our own created class as data type.

        studentsInfo.put("Tom Hanks", new Students("th@gmail.com", 21,2, "American"));

        studentsInfo.put("Brad Pit", new Students("bp@gmail.com", 22,3, "Colombian"));

        studentsInfo.put("Angelina Julie", new Students("ag@gmail.com", 19,1, "Peru"));

        // System.out.println(studentsInfo); // {Angelina Julie=day30maps.Students@28a418fc, Brad Pit=day30maps.Students@5305068a, Tom Hanks=day30maps.Students@1f32e575}
        // these are the references printed on console. but that's not good. it's not readable.
        // To convert these references to readable data, we need to create toString in the Student class. (like override )
        // toString() method is for printing object details on the console.

        System.out.println(studentsInfo); // {Angelina Julie=Students{email='ag@gmail.com', age=19, grade=1, nationality='Peru'}, Brad Pit=Students{email='bp@gmail.com', age=22, grade=3, nationality='Colombian'}, Tom Hanks=Students{email='th@gmail.com', age=21, grade=2, nationality='American'}}


        // How to see a detail about a student? like Tom Hanks age

        Students tomInfo = studentsInfo.get("Tom Hanks");
        System.out.println(tomInfo); //[email='th@gmail.com', age=21, grade=2, nationality='American']

        System.out.println(tomInfo.age);  // 21
        System.out.println(tomInfo.nationality); // American


    }
}
