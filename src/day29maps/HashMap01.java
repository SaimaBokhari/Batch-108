package day29maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/*
           1)Maps have key - value structure
           2)Keys are unique but values are not
           3)Every element in a Map is called as "Entry"
           4)All elements are called as "EntrySet"
           5)Key cannot be null in maps except "HashMap" but value can

           6)HashMap's put the entries in random order, because of that
             it is super-fast
 */
public class HashMap01 {
    /*
       "Hashing Technique" means Java creates unique values for each elements.
       'Map' should remind you of dictionary. word on one side and its definition/
       explanation on the other side.
       In a 'Map', one part (left side) is called "Key" which is unique.
       While on the other side is "value" part which can be repeated.

       The two parts (Key = Value) together are called "Entry".
       We don't have elements / nodes in maps. It's called "Entry".
       More than one (like all elements) is called "EntrySet".

       HashMap can accept "Key" as null; other Maps don't.
       Value can be null repeatedly.

       The order in HashMap is random order. It's super-fast.



        */
    public static void main(String[] args) {

        // How to create a HashMap?
        // We cannot use primitive data types in Maps. They must be non-primitive data types.

        HashMap<String, Integer> stdAges = new HashMap<>();

        // How to put entries into a HashMap? We don't "add" in maps, we "put" the entries.

        stdAges.put("Ali Can", 13);
        stdAges.put("Tom Hanks", 46);
        stdAges.put("Brad Pit", 55);
        stdAges.put("Anglina Julie", 48);
        System.out.println(stdAges); // {Tom Hanks=46, Brad Pit=55, Ali Can=13, Anglina Julie=48}

        // How to fetch just keys from a Map?

        //stdAges.keySet(); //  Java will put the keys in a Set when we use this method.
                           // So we have to create a Set to store the keys.
                           // we don't know which set is created, but we need set coz keys are unique.
                           // so we use general term "set", no need to be specific

        Set<String> keys = stdAges.keySet();
        System.out.println(keys);   // [Tom Hanks, Brad Pit, Ali Can, Anglina Julie]

        // How to get just values from a Map?

        // stdAges.values(); // values can be repeated so we don't need to create set to store them

        Collection<Integer> ages = stdAges.values();
        System.out.println(ages); //  [46, 55, 13, 48]


        // Can I put null into a key?
        // yes, you can use null just in HashMap Key

        stdAges.put(null,23);
        System.out.println(stdAges); // {null=23, Tom Hanks=46, Brad Pit=55, Ali Can=13, Anglina Julie=48}


        // Can I put null into value?
        // Yes, repeatedly.
        stdAges.put("Ajda Pekkan", null);
        System.out.println(stdAges);

        stdAges.put("Someone else", null);
        System.out.println(stdAges);

        // What happens if we use same key repeatedly?
        // Java doesn't add the key again but updates its value to the 2nd entry.
        // Java accepts the final value for the key (called overwriting)
        stdAges.put("Anglina Julie", 23);
        System.out.println(stdAges); // {null=23, Tom Hanks=46, Brad Pit=55, Someone else=null, Ajda Pekkan=null, Ali Can=13, Anglina Julie=23}

        // How to get value of a key?
        // Use get()     stdAges.get("Tom Hanks");
        Integer tomAge = stdAges.get("Tom Hanks");
        System.out.println(tomAge);

        //What happens if the key doesn't exist when you use get() method?
        // It returns null for non-existing keys.
        Integer unknownAge = stdAges.get("Abc Xyz");
        System.out.println(unknownAge); // null

        // another method to check the value of non-existing key
        //getOrDefault("Abc Xyz", 0); method returns the value of "Abc Xyz" if Abc Xyz exists among the keys.
        //                                   returns the values of second parameter if Abc Xyz does not exist among the keys.

        Integer unknownAge2 = stdAges.getOrDefault("Abc Xyz", 0);
        System.out.println(unknownAge2);

        // /I want to put an entry if it does not exist, if the entry exists I will not put it.

        stdAges.putIfAbsent("Brad Pit", 44);
        System.out.println(stdAges); // Brad Pit=55, It won't change because this key is present already

        stdAges.putIfAbsent("Cuneyt Arkin", 44);
        System.out.println(stdAges);  // Cuneyt Arkin=44 ... this will be added as it was absent before this code.

        // How to update the value of an existing key?
        // first method is (just by checking the key)

        stdAges.replace("Tom Hanks", 56);
        System.out.println(stdAges); // use replace() ... Tom Hanks=56


        //  second method is by checking the key and existing (old) value, if both exist new value will be updated.
        stdAges.replace("Tom Hanks", 56, 66);
        System.out.println(stdAges); // {null=23, Tom Hanks=66, Brad Pit=55, Cuneyt Arkin=44, Someone else=null, Ajda Pekkan=null, Ali Can=13, Anglina Julie=23}


        // how to remove an entry from a Map?
        // first method is (just by checking the key)
        stdAges.remove("Someone else");
        System.out.println(stdAges); // {null=23, Tom Hanks=66, Brad Pit=55, Cuneyt Arkin=44, Ajda Pekkan=null, Ali Can=13, Anglina Julie=23}

        //  second method is by checking the key and existing (old) value, if both exist new value will be updated.
        stdAges.remove("Ajda Pekkan", null);
        System.out.println(stdAges); // {null=23, Tom Hanks=66, Brad Pit=55, Cuneyt Arkin=44, Ali Can=13, Anglina Julie=23}


        // How to get entries one by one from a Map?
        stdAges.entrySet(); // every entry is unique, that's why Java puts them in Set.
        Set<Map.Entry<String, Integer>> entries = stdAges.entrySet();
        for(Map.Entry<String, Integer> w: entries){
            System.out.print(w + "!"); // null=23!Tom Hanks=66!Brad Pit=55!Cuneyt Arkin=44!Ali Can=13!Anglina Julie=23!




        }


    }
}
