package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {
        /*
        Example 1:
        Type code to remove the first occurrence of a specific element from a String list.
        [ "Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes" ]
         */

        // To remove first occurrence, Java created a method which is "remove()"

        List<String> a = new ArrayList<>();

        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        a.remove("Shoes");
        System.out.println(a);

        /*
        Example 2:
        Type code to remove all occurrences of a specific element from a String list.
        [ "Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes" ]
         */
// we use the list given in example 1.

        List<String> b = new ArrayList<>();
        b.add("Shoes");
        // b.add("Laptop");
        // We tell Java to remove all elements from list a that are present (or similar to)
        // the elements in a new String container b.
        // use the remove() with object parameter.

        a.removeAll(b);
        System.out.println(a);

        /*
        Example 3:
        Type code to remove an element at a specific index.
        e.g. remove the fifth element from a given list
        [ "Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes" ]
         */

        List<String> c = new ArrayList<>();

        c.add("Shoes");
        c.add("TV");
        c.add("Radio");
        c.add("Laptop");
        c.add("Shoes");
        c.add("Book");
        c.add("Shoes");
        System.out.println(c);

        // use the remove() with index parameter.
        c.remove(4);
        System.out.println(c);

        /*
        Example 4:
        Create an Integer list, then remove the 4th element.
         */

        List<Integer> e = new ArrayList<>();
        e.add(12);
        e.add(4);
        e.add(13);
        e.add(25);
        e.add(432);
        System.out.println(e);

        e.remove(3);
        System.out.println(e);

        /*
        Example 5:
        Create an Integer list, then remove first occurrence of 4.
         */
        List<Integer> f = new ArrayList<>();
        f.add(12);
        f.add(4);
        f.add(13);
        f.add(25);
        f.add(432);
        System.out.println(f);

        f.remove(Integer.valueOf(4));
        System.out.println(f);

        /*
         Note: If you use Integer List element directly inside the remove() like remove(4),
         Java will accept it as index. Because indexes are primitive integers, when you put 4,
         it will be accepted as primitive, and it will be indexed.
         Lists use non-primitive as list elements, therefore you have to convert primitive int to Integer.
         To do that, use valueOf() method from Integer wrapper class.

         valueOf() method changes the data type without changing the value.

         When we use Integer.valueOf(4), we are converting primitive integer 4 to wrapper class
         */

        /*
        Example 6:
        Type code to check if a specific element exists in the list or not.
         */

        List<Double> g = new ArrayList<>();
        g.add(12.99);
        g.add(5.02);
        g.add(11.23);
        System.out.println(g);

        boolean isExist = g.contains(5.03);
        System.out.println(isExist);

        /*
        Example 7:
        Type code to change the element at index (1) to 9.99.
         use the above list
         set() is used ofr updating/changing an element by using index.
         */

        g.set(1,9.99);
        System.out.println(g);

        /*
        Example 8:
        Type code to increase all salaries by 10 percent in an Integer List .
         [5000, 6000, 4500, 3900, 7200]
         */
        List<Double> x = new ArrayList<>();
        x.add(5000.0);
        x.add(6000.0);
        x.add(4500.0);
        x.add(3900.0);
        x.add(7200.0);
        System.out.println(x);

        // 1st way:

        int i = 0;

        for(i=0; i<x.size(); i++){
            x.set(i, x.get(i)*1.1);       // get() is used to get a specific element from that index.
        }
        System.out.println(x);

        // 2nd way:

//        int idx = 0;
//        for (Integer w: i){
//            i.set(idx, w + (w / 10));
//            idx++;
//        }
//        System.out.println(i);


        //3rd way:

//        List<Integer> a =new ArrayList<>();
//
//        a.add(5000);
//        a.add(6000);
//        a.add(4500);
//        a.add(3900);
//
//        System.out.println(a);
//
//        for(int i=0;i<a.size()-1;i++){
//            Integer value=a.get(i);
//
//            a.set(i,(int)(a.get(i)*1.1));
//        }
//
//        //a.remove(1);
//        System.out.println(a);
//
//    }

        // How to check if two lists are same or not.

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('z');
        m.add('y');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        if(m.equals(n)){
            System.out.println("The lists are same.");
        }else{
            System.out.println("The lists are not same.");
        }

        // equals() checks two things:
        // 1. if the elements are same or not
        // 2. if the same elements are at the same index position.
        //If same elements are in the same position, equals() method returns true, otherwise it returns false.

        // How to check if a list contains multiple elements?

        List<Integer> p = new ArrayList<>();

        p.add(12);
        p.add(23);
        p.add(32);
        p.add(14);
        p.add(24);
        p.add(56);

        List<Integer> q = new ArrayList<>();
        q.add(23);
        q.add(56);
        q.add(24);

        // To use containsAll () with collection parameter, we need to create another List (q here)
        // and we put the elements that we want to check if they exist or not.
         boolean exist = p.containsAll(q);
        System.out.println(exist);

        // Note: containsAll() returns "true" if all elements exist; if anyone doesn't exist, it returns "false".


















    }
}
