package day17listsandpassbyvalues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists03 {
    public static void main(String[] args) {
        /*
        Example 1:
        Increase the value of every element by 3 except 7.
         */
//        List<Integer> a = new ArrayList<>();
//        a.add(11);
//        a.add(31);
//        a.add(22);
//        a.add(7);
//        a.add(15);
//        a.add(22);
//        System.out.println(a);
//
//        for(Integer w: a){
//            if(w==7){
//                continue;
//            }
//            a.set(a.indexOf(w),w+3);
//        }
//        System.out.println(a);
//        System.out.println("===================");

        // Example 2: Convert all elements to * except the last four elements.

        List<String> b = new ArrayList<>();
        b.add("11");
        b.add("31");
        b.add("22");
        b.add("17");
        b.add("15");
        b.add("34");
        b.add("21");
        b.add("67");
        System.out.println(b);

        // You need to be careful about the repeated elements because indexOf() gives you the index of first occurrence
        // of that character everytime no matter if it's repeated twice or three times, it will give the same index.
        // That's why we don't use for-each-loop for this question. We use for loop.

       for(int i=0; i<b.size(); i++){
           if(i== (b.size()-4) || b.size()<5){  // we add || b.size()<5 this condition so if the list has less than 4 or 4 elements, it shouldn't change to *.
               break;                          // if we don't use this condition || b.size()<5, it will change all elements to * if the list has 4 or less elements.
           }
           b.set(i, "*");
       }
        System.out.println(b);

       // 2nd way:

        for(int i=0; i<b.size()-4; i++){
            b.set(i, "*");
        }
        System.out.println(b);








    }
}
