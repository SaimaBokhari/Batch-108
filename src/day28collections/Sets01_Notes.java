package day28collections;

public class Sets01_Notes {
    /*
    HashSet
1) It consists of unique elements,
an element can be used only once in Sets. no duplicate elements
2) If you want to add an element back to the HashSet,
the old one is deleted and the new one is overwritten.
3)HashSets are the fastest among Sets.
The order in which the values are entered is not taken into account.
4) HashSet can use "null" object as element.
However, if you want to add multiple null values to a HashSet,
 there will be only one null value.

 LinkedHashset :
 1) They do not accept repeated elements. They arrange the elements according to the insertion order.
 2) LinkedHashSet runs slower than HashSet.
 3) LinkedHashSet can use "null" object as element.
4) They are fast in adding and removing operations.

TreeSet :
1) TreeSet does not accept repeated elements, because it is Set.
2) Arranges the elements according to natural Order (alphabetical if String, smallest to largest).
3) TreeSet is the slowest of the sets. That's why you should be careful when using TreeSet...
4)TRICK :TreeSet "null" object cannot be used as an element.

Set Methods:
            .add(element);-->Adds element to Set
            .addAll(collection);-->adds all the elements of the desired collection
            .contains(element);-->freezes true if the desired element is in set, false otherwise.
            .containsAll(collection);-->freezes true if all of the requested collection exists in the searched set, false otherwise
            .remove(element);-->removes and freezes true if the desired element is found, false if not found
            .removeAll(collection);-->removes all elements of the requested collection if it finds it and freezes true, if not found false returns
            .equals(set2);--> freezes true if all elements are the same as the requested set2, false otherwise
            .retainAll(collection1);-->Deletes all elements except the elements of collection1, true if deleted, false otherwise (returns the intersecting common elements.)
            .clear();-->Delete all elements in sett
            .isEmpty();-->Freezes true if the set has no elements, false if any
            .size();-->returns the number of elements of the set
            .clone();--> when you use clone method, you can make data type "Object"
     */
}
