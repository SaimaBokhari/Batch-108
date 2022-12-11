package day11constructorsmethodcallstatickeyword;

public class DoWhile01 {
    public static void main(String[] args) {

        /*
        Type code to print digits just in the decimal part of the given decimal number
        with an asterisk.
        For example; 75.4238 ⇒ *4*2*3*8
         */

        double num = 75.4238;
        //we have to change data type from double to string, so we can use
        // valueOf().

        String str = String.valueOf(num); // now 75.4238 has become a string data.

        String s =""; // Create an empty container to store new data.
        int i = 0;

        String decimalPart = str.split("\\.")[1];
        // [1} means the use the second substring. After the splitting action, the index of first string is 0, and
        // the index of second string is 1.
        // we need forward \\ before dot, otherwise Java doesn't accept it as a dot.
        // When you use "." in split(), use it like "\\."



        do{
            String r = decimalPart.substring(i, i+1);
            s = s + "*" + r;

            i++;
        }while(i<decimalPart.length());

        System.out.println(s);












    }
}
