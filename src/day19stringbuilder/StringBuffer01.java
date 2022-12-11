package day19stringbuilder;

public class StringBuffer01 {
    public static void main(String[] args) {

       /*
        StringBuffer is another class to create Strings in Java.
        StringBuffer is very similar to StringBuilder. Both are mutable.

        So what's the difference?

        1) StringBuffer was created at the beginning of java programming language
           StringBuilder was created later.

        2) StringBuffer is multi-thread but StringBuilder is not. (thread means tasks).
          for multi threads, use StringBuffer.

        3) StringBuffer is slower than StringBuilder because it uses multi threads.

         Scenarios:
            1)I need immutable String ==> String Class
            2)I need mutable and not multi-thread ==> StringBuilder
            3)I need mutable and multi-thread == > StringBuffer


            When you use multi-thread you need to create an order for the threads, this called "synchronization"

        */





    }
}
