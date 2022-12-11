package day05ternarystringmanipulations.daay06stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        /*
        /1.Example: Print the first and the last character of the given
        String on the console. "Java is easy" ==> Jy
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String str = input.nextLine();

        // 1st way: By using charAt()

        char firstChar = str.charAt(0);
        // index of last character is length()-1 every time.

        str.charAt(str.length()-1);
        char lastChar = str.charAt(str.length()-1);
        System.out.println(firstChar + lastChar);
        // Note: If you use char data type in Math operation,
        // Java uses ASCII value (console shows 162) not the characters.
        // Remember to count space as a character when you deal with char method.
        // Space is a regular character in Java.

        System.out.println("" + firstChar + lastChar);
        //When you put empty "" + this will make it concatenation,
        // and you'll get String result, not ASCII value.

        /*
        2nd way: By using substring ()
       Substring method returns a part of the string.

       In substring method, first index is inclusive, while ending index is exclusive.
         */

       // str.substring(0,1); // substring substring(0,1) gives you first character every time.

        String firstCharacter = str.substring(0,1);

        str.substring(str.length()-1);
        //substring(beginning index) gives you the character beginning from
        // a specific index to the last index of that string.

        String lastCharacter = str.substring(str.length()-1);

        System.out.println(firstCharacter + lastCharacter);

        /* 2 Example: Print just the animal names from the String:
        "I like lion, horse, laptop and cat"

         */

        String s =  "I like lion, horse, laptop and cat";

        String lion = s.substring(7,11);
        String horse = s.substring(13,18);
        String cat = s.substring(31);
        System.out.println(lion+horse+cat);

        /* 3. Example: Type code to get initials of the first name
        and the last name of a given name.
        Ali Can ==> Mary Star ==> MS etc.
         */

        String name = "Tom Hanks";

        name.substring(0,1);
        String initialOfFirstName = name.substring(0,1);

        // name.split(" ")[1];
        String initialOfLastName = name.split(" ")[1].substring(0,1);

        System.out.println(initialOfFirstName + initialOfLastName);

        /* 4 Example: Type code to find the number of words in a String:
        "I like to move it,move it" ==> 7
        */

        String words = "I like to move it, move it.";

        // int numOfWords = words.split(" ");
        /* to count the number of words, we need to use split method with space (to split the
         string at each word, we can print those words. But in this task, we need to know
         the number of words, so we use length after split method.
         Note: If you use "Length" after split method, don't use parenthesis.
         When you use it for String, use parenthesis after the 'length'.
         */

        int numOfWords = words.split(" ").length;
        System.out.println(numOfWords);









    }

}
