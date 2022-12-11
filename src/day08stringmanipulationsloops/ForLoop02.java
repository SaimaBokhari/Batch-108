package day08stringmanipulationsloops;

public class ForLoop02 {
    public static void main(String[] args) {

        // For-loops for Strings

        /*
        Put * between 2 consecutive characters and to
        the end in a String. For example; Java ==> J*a*v*a*
        Make the starting value index 0 while working with String
        to start from the first character.
         */
        String str = "Java";
        // when we work with string we use index that's why we start with 0.
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "*");
        }

        // for condition part, i<=str.length()-1 can be replaced with i<str.length().
        // it works the same but more efficient as Java has to work for one condition only.

        System.out.println();


        /* Example 2: Type code to print unique characters in a String. Hello ==> Heo

         */

        String s = "Hello";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                System.out.print(s.charAt(i));
            }
        }










    }
}
