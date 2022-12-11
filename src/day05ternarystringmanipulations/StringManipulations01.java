package day05ternarystringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {


        /*
                Strings are non-primitive, non-primitives have values and methods in them.\

            1) equals() method compares two Strings by not ignoring cases
               "Tom".equals("tom"); ==> false
               equals() method returns "boolean"
            2)equalsIgnoreCase() method compares two Strings by ignoring cases
             "Tom".equalsIgnoreCase("tom"); ==> true
             equalsIgnoreCase() method returns "boolean"
            3)toLowerCase() method converts all characters in a String to lower cases
               "AuGuSt".toLowerCase(); ==> august
               toLowerCase() method returns String
            4)toUpperCase() method converts all characters in a String to upper cases
               "AuGuSt".toUpperCase(); ==> AUGUST
               toUpperCase() method returns String
            5)charAt() method gives you a character in the String by using index
               "Java is my love".charAt(2); ==> v
               "Java is my love".charAt(6); ==> s
               charAt() method returns char
            6)length() method returns the number of characters in a String
               "Learn Java earn money".length(); ==> 21
               length() method returns integer
         */

        // Task: Count the alphabetical characters in a given String.
        //  "Tom ... Hanks ...." Java won't count the spaces in this case cos we are asking
        // to count alphabets only.

        Scanner scan = new Scanner(System.in);

        String name = "    Tom2....Hanks    ";
        int numOfLetters = name.replaceAll("[^A-Za-z]", "").length();
                // ^ means other than.. this is very important in this method
        // the parenthesis in front of replacement is kept empty to tell Java to remove
        // all non alphabets and replace them with nothing.

        System.out.println(numOfLetters);

        /*
        If your code gives you correct output for some data, but it's not giving you
        correct output for some other; it's called "Hard Coding"
        It's not accepted.
        If it works for all data, it's called "Dynamic Coding".
        Try the above code for different scenarios to make it dynamic.

         */

        String name1 = "Tom";
        int numOfLetters1 = name1.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfLetters1);





    }
}
