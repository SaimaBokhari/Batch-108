package day28collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    /*
    Sets are for storing multiple Non-Primitive data in same data type. (same like arraylists and linkedlists)

    What's the difference?
    Sets are for storing unique data. Inside the sets, you can't put repeated data.
    for instance: to store email addresses, social security numbers, phone numbers (in a country)

    There are three different sets:
    1. HashSet .. a)  uses "Hashing technique". This is a technique to create unique codes
                      called "Hash Code". These codes are unique and created automatically.
                      Hash Table is used to create Hash code.
                  b)  It doesn't put the elements in any order. (random order). It's good characteristics coz
                      ordering/sequencing elements take longer. That's why we use HashSets mostly in application.
                  c) HashSet accepts just a single "null" as element. We can't put more than one as it won't be unique anymore

    ==> If you want to add an element back to the HashSet, the old one is deleted and the new one is overwritten.

    2. LinkedHashSet ... puts the elements in "Insertion Order". If we want to store unique data in order of "insertion",
                         we use LinkedHashSet.

    3. TreeSet ... puts the elements in "natural order" (Ascending order in numbers, Alphabetical order in String).
                   TreeSet is so slow in adding elements.It needs even more time than ordering in insertion order.

Question: If you need to store "unique elements" in "natural order", which collection do you use?
Answer: TreeSet
Question: As you know, TreeSet is so slow in adding elements, how can you improve your code?
Answer:  i) Create a HashSet
         ii) Add elements into the Hashset
         iii) Convert Hashset to TreeSet


     */
    public static void main(String[] args) {

        // HashSet
        HashSet<String> emails = new HashSet<>();
        System.out.println(emails); // []  ... Java uses [] for Collections

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add("Dates");
        emails.add("Mango");  // If you add repeated data, last value will override the previous one.
        System.out.println(emails);  // [Apple, Fig, Mango, Apricot, Dates, Orange] There's no rule for order of elements
                                     // random order of elements

        emails.remove("Fig");
        System.out.println(emails);   // [Apple, Mango, Apricot, Dates, Orange]

        emails.add(null);   // HashSet accepts null as an element. HashCode for null is zero so mostly it will be in the beginning
        emails.add(null);   // If you add repeated value, HashSet will print it only once
        System.out.println(emails);

//        emails.clear();  // deletes all elements from HashSet
//        System.out.println(emails);  // []

       // When you use clone(), make data type "Object" but this is so general.
        // but for emails, we need specific data type
        // 1st option:
       Object emails2 = emails.clone();
        System.out.println(emails2);  // [null, Apple, Mango, Apricot, Dates, Orange]

        // 2nd option:
        HashSet<String> emails3 = (HashSet<String>) emails.clone();  // type casting , explicit narrowing
        System.out.println(emails3);  // [null, Apple, Mango, Apricot, Dates, Orange]

        // by using clone(), we protect the original data, and make updates on the clone.

     // These are all "Data structures": HashSets, LinkedList, ArraysList
        // We use them according to the needs of the application.


       // LinkedHashSet

        LinkedHashSet<Integer> ssn = new LinkedHashSet<>();

        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);
        System.out.println(ssn); // [123456789, 234567891, 345678912, 456789123] puts the elements in insertion order

        ssn.add(null);
        System.out.println(ssn);

        // TreeSet
        // 1st way: this is slow process
        //Long starting = System.currentTimeMillis(); // to check duration of the code
        Long starting = LocalTime.now().toNanoOfDay();
        TreeSet<Integer> nums1 = new TreeSet<>();

        nums1.add(23);
        nums1.add(5);
        nums1.add(17);
        nums1.add(67);
        nums1.add(41);
        nums1.add(-5);
        System.out.println(nums1);  // [-5, 5, 17, 23, 41, 67] in natural order .. Ascending order

       // Long middle = System.currentTimeMillis();
        Long middle = LocalTime.now().toNanoOfDay();
        // 2nd Way: create hashset first and then convert it to TreeSet to get the elements in natural order (faster process)
        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(23);
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(41);
        nums2.add(-5);
      //  System.out.println(nums2); // [17, 67, -5, 5, 23, 41] random order

        // convert nums2 to TreeSet

        TreeSet<Integer> perfectNums = new TreeSet<>(nums2);
        System.out.println(perfectNums);  // [-5, 5, 17, 23, 41, 67]

       // Long ending = System.currentTimeMillis();
        Long ending = LocalTime.now().toNanoOfDay();
        // we can remove "Tree" from the TreeSet in the beginning.

        System.out.println("First way:" + (middle-starting));
        System.out.println("Second way:" +(ending - middle) );
    }
}
