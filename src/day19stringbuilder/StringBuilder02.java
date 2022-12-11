package day19stringbuilder;

public class StringBuilder02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Mississippi");
        System.out.println(sb1);
       //  String test = sb1;
        // It will complain cos the data types are different.


        //toString() is used to change StringBuilders to Strings.

        sb1.toString();
        System.out.println(sb1);
        String test = sb1.toString();
        // it doesn't complain now cos the data types are same.

        // reverse() is used to reverse a String.
        // Interview question: "How to reverse a String?"
        // I can reverse a String by using a reverse method from StringBuilder class.
        // I can reverse a String by using loops.
        // Interviewer will tell you to use loops coz they want to see your logic.

        StringBuilder revSb1 = sb1.reverse();
        System.out.println(revSb1);  // ippississiM

        // if there's no issue of mutable or immutable, then use reverse method coz you
        // will need StringBuilder which is mutable.

        // deleteCharAt() is used to delete a character at a specific index.
        sb1.deleteCharAt(0);
        System.out.println(sb1); // ppississiM coz it's reversed already.

        // Unbold methods cannot change original value. Methods coming
        // from String class cannot change the original value . So be careful.

        sb1.delete(2, 5);   // first index is inclusive, last index is exclusive.
        System.out.println(sb1);

        // delete (starting index, ending index) is used to delete characters
        // from "starting index" to "ending index".
        // we can also delete all characters by using (0, sb1.length)

        sb1.replace(2, 4,"IS");
        System.out.println(sb1); // ppISsiM
        // replace() in StringBuilder can have three parameters.
        // replace(starting index, ending index, new value);
        // from "starting index" to "ending index" to a "new value".


        sb1.insert(3, "xxx");
        System.out.println(sb1);
        // offset 3 means after first three characters (skip first three characters),
        // put new value (xxx).


        // compareTo() doesn't ignore cases. It checks alphabetical order
        // by using ASCII values.

        StringBuilder sb2 = new StringBuilder("Java is love");
        StringBuilder sb3 = new StringBuilder("Java is love");

        int result = sb2.compareTo(sb3);
        System.out.println(result);

        /*
        The value 0 if this StringBuilder contains the same character sequence as
        that of the argument StringBuilder; a negative integer if the first StringBuilder
        is lexicographically less than the second StringBuilder argument; or a positive
        integer if the first StringBuilder is lexicographically greater than the second
        StringBuilder argument.
         */


        // setCharAt(index, new char value) is used to update a specific character at a specific index.
        sb3.setCharAt(8, 'm');
        System.out.println(sb3);

        // replace() updates multiple characters; setCharAt() updates one character.



    }
    /*
            You should understand:
    1) Mechanisms behind the "immutability".
    2) Benefits of "immutability".
    3) Differences between "immutability" and "mutability".
    4) Features of the StringBuilder

     */






}
