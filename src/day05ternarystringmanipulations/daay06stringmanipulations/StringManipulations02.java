package day05ternarystringmanipulations.daay06stringmanipulations;

import java.sql.SQLOutput;

public class StringManipulations02 {
    public static void main(String[] args) {
         /*
         Example 1: Type code to see the order number of the first occurrence
          of the character 'a'.  "I want to learn Java".
          Remember to count space as a regular character.
          */

        String str = "I want to learn Java";

        str.indexOf('a');
        /* indexOf() method gives you the first occurrence of the character
        in any specific word/string.
        indexOf() gives you index of the first occurrence of that character only,
       and it returns integer value. So create integer container.
         */
        int idx = str.indexOf('a');
        System.out.println(idx); // index is 3 but order number is index + 1
        System.out.println(idx + 1); // order will be 4


        /*
         Example 2: Type code to see the order number of the first occurrence
          of 'Java'.  "I like to study Java, learn Java, earn money, Java is easy".
          Remember to count space as a regular character.
          */

        String s = "I like to study Java, learn Java, earn money, Java is easy";

        s.indexOf("Java");
        int i =  s.indexOf("Java");
        System.out.println(i); // 16 is the index of the word 'Java'.
        System.out.println(i + 1); // 17 is the order number of the word 'Java'.

        // Note: The functionality of indexOf() gives you the index of the first letter of the word when used in'String'.
        // indexOf() can be used with 'char' as well as 'String' data types. It works for both.
        // indexOf() method returns -1 for non-existing characters e.g. s.indexOf("xyz"); of
        // above String will be -1 because there is no 'x' in the above String.

        s.indexOf("x");
        int t =  s.indexOf("x");
        System.out.println(t); // -1


        /* Example 3: Type code to check if a String has 'a' in it or not. Print
        appropriate messages for the scenarios.
        String word = "I like to study";
         */

        //1st way:

        String word = "I like to study";
        if(word.indexOf('a')==-1){
            System.out.println("There is no 'a' ");
        }else{
            System.out.println("There is 'a' ");
        }

        //2nd way:
        String result = word.indexOf('a') == -1 ? "There is no 'a' " : "There is 'a' ";
        System.out.println(result);


        /*
        Example 4: Type code to find the order number of last occurrence of "Java"
         in a sentence. "I like to study Java, learn Java, earn money, Java is easy."
         */

        String r = "I like to study Java, learn Java, earn money, Java is easy.";

        r.lastIndexOf("Java");
        int f =  r.lastIndexOf("Java");
        System.out.println(f); // 46 is the index of the last occurrence of the word Java.
        System.out.println(f + 1);

        int c1 = 'A';   // returns ASCII value
        char c2 = 'A';   // returns as symbol


        /* Example 5: Type code to check if a character is unique in a String
        or not.
        e.g. "Hello"  ==> H is unique, e is unique, o is unique
        but not l because it's repeated.
         */

        String m = "Hello";

        //1st Way: if else

        if(m.indexOf('l') == -1){
            System.out.println("The character doesn't exist");
        }else if(m.indexOf('l') == m.lastIndexOf('l')){
            System.out.println("The character is unique");
        }else{
            System.out.println("The character is not unique");
        }

        // 2nd way: ternary
        String res = m.indexOf('H') == -1 ? "The character doesn't exist" : m.indexOf('H') == m.lastIndexOf('H') ? "The character is unique" : "The character is not unique";
        System.out.println(res);













    }
}
