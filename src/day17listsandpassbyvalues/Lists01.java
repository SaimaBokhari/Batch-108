package day17listsandpassbyvalues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {
        /*
        Example 1:
        Type code to make all elements in a List unique.
        {2,3,2,5} ==> {2,3,5}
         */

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        a.add(3);

        List<Integer> b = new ArrayList<>();

        for(Integer w: a){
            if(!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);
        // b.equals(w) with  continue can also be used for this question.

        /*
         Example 2: Ask user to enter a letter, if the letter exists inside the list,
         convert the element to "Got it".
         Otherwise, add the element into the list
           [A, K, R, S] ==> User --> K ==> [A, Got it, R, S]
           [A, K, R, S] ==> User --> P ==> [A, K, R, S, P]
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        String str = input.next();

        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        if(c.contains(str)){
            c.set(c.indexOf(str) ,"Got it");   // indexOf() gives you the index of first occurrence of a specific element.
        }else{                                // indexOf() returns -1 for non-existing elements.
            c.add(str);
        }
        System.out.println(c);

        List<String> d = new ArrayList<>();
        d.add("Ab");
        d.add("Kl");
        d.add("Rs");
        d.add("St");

        int e = d.indexOf("Rs");
        System.out.println(e);

        d.indexOf("Xy");
        int f = d.indexOf("Xy");
        System.out.println(f);

        // How can you understand the existence of a specific element in a List?
        // We use the indexOf () if the result is -1, it means the element doesn't exist.
        // If the result is not -1, it means the element exists.
        // Use contains()... This is better.

        int h = d.lastIndexOf("Rs");   // returns the last occurrence of a specific character.

        System.out.println(h);








    }
}
