package day30maps;

/*
// Tree means natural order (ascending).
        1)TreeMap puts the entries in "Natural Order" according to the "Keys"
        2)TreeMap is the slowest Map
        3)TreeMap is not "thread-safe", and is not "synchronized"

        HashTables and TreeMaps don't take null.

      If you need speed, and don't need any order, multi-thread or synchronisation, use HashMap.
      If you need multi-thread and synchronisation, the only option is HashTable.
      If you need natural order, you have only one option, TreeMap.

     */

import java.util.*;

public class TreeMap01 {
    public static void main(String[] args) {

        TreeMap<String, Integer>  countryPopulations = new TreeMap<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 85000000);
        countryPopulations.put("Turkey", 81000000);
        countryPopulations.put("Afghanistan", 30000000);


        System.out.println(countryPopulations);

        /* If the "key" inside the ceilingEntry() parenthesis is the same with any key
           inside the TreeMap, you will get the entry itself.
           ceilingEntry() returns the next entry.As TreeMaps give output in alphabetical order,
           whatever word/letter you use inside the (), it will produce the entry next in alphabetical
           order.
           If the "key" inside the ceilingEntry() method parenthesis is before any key,
           it returns the next entry.
           Returns null, if the input is beyond the alphabetical order of the existing keys.

         */

        // For next key
        Map.Entry<String, Integer> abc=  countryPopulations.ceilingEntry("R");
        System.out.println(abc); // Turkey=81000000

        // for previous key
        Map.Entry<String, Integer> def = countryPopulations.floorEntry("S");
        System.out.println(def);  // Germany=85000000

        Map.Entry<String, Integer> ghi =  countryPopulations.lowerEntry("S");
        System.out.println(ghi);

        //lowerEntry("Germany") method gives the previous entry under every condition but floorEntry("Germany") method gives the same entry for the existing keys
        //lowerEntry("Germany") method is like "<", floorEntry("Germany") is like "<="



        // for descending order (opposite to natural order)
        NavigableSet<String> keysInDescendingOrder =  countryPopulations.descendingKeySet();
        System.out.println(keysInDescendingOrder); // [USA, Turkey, Germany, Afghanistan]

        NavigableMap<String, Integer> mapInDescendingOrder = countryPopulations.descendingMap();

        System.out.println(mapInDescendingOrder); // {USA=400000000, Turkey=81000000, Germany=85000000, Afghanistan=30000000}

        // getting part of the map .. like substring
        // first one is default
        SortedMap<String, Integer> subMap1 = countryPopulations.subMap("Afghanistan", "Turkey");
        System.out.println(subMap1);

        // second one is more flexible; you can choose which keys to make inclusive or exclusive.
        NavigableMap<String, Integer> subMap2 =  countryPopulations.subMap("Afghanistan", false,"Turkey",true);
        System.out.println(subMap2);

        // like substring() with single parameter. it gives you all keys after the one that you input
        SortedMap<String, Integer> tailMap1 = countryPopulations.tailMap("Turkey");
        System.out.println(tailMap1);  // {Turkey=81000000, USA=400000000}

        SortedMap<String, Integer> tailMap2 = countryPopulations.tailMap("Turkey", false); // false means don't include Turkey.
        System.out.println(tailMap2);  // {USA=400000000}








    }


}
