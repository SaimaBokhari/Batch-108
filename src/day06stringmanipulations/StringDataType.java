package day06stringmanipulations;

public class StringDataType {
    public static void main(String[] args) {

        /*
        String data type?

        String is a "Non-Primitive Data Type".
        Strings are used to store text, However a String variable can contain a collection of characters as well.
        Strings are always surrounded by double quotes ""

        Strings are Non-Primitive Data Type which means they not only have value but also methods.
        There are many string methods available
        For example: toUpperCase() and toLowerCase(), length(), concat(), indexOf(), substring() etc.

             What are the differences between "Primitive Data Types" and "Non-Primitive Data Types"?
             1)"Primitive Data Types" have just value but "Non-Primitive Data Types" have values and methods
             2)"Primitive Data Types" were created by Java, we cannot create any Primitive Data Type.
               But we can create Non-Primitive Data Types whenever we need.
             3)"Primitive Data Types" use just lower cases in their names
               But Non-Primitive Data Types starts with upper cases.
             4)Usage of memory in "Primitive Data Types" changes from data type to data type
               But all Non-Primitive Data Types use same amount of memory
         */

        String str = "Java is easy";
        String str1 = "Java is easy";
        // length() -> returns how long the string is including spaces or any other special characters such as full stop, comma etc.
        System.out.println("The length of the string is: " + str.length());

        // toLowerCase() method converts all letters to lower case
        System.out.println("Lower case: " + str.toLowerCase());

        // toUpperCase() method converts all letters to upper case
        System.out.println("Upper case: " + str.toUpperCase());

        //      ----------- String Concatenation -------------
//        The process of joining two strings is called CONCATENATION
//        There are two ways to join the two strings
        // 1st Way: The + operator can be used between strings to combine them
        String str2 = "I love Java";
        System.out.println(str + ". "+ str2);

        // 2nd Way: concat()
        System.out.println(str.concat(str2));

//  --------- Locating a character / word in Strings -------------
        //1.Way: By using charAt()
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
        System.out.println(firstChar + lastChar);

        //195 => 74 + 121
        // Note: If you use "char" data type in a math operation, Java uses ASCII values
        // not the characters

        System.out.println("" + firstChar + lastChar);
        //Note:When you put "" at the beginning it will be concatenation operation, you will get String

        //2.Way: By using substring()
        String firstCharacter = str.substring(0, 1);//substring(0, 1) gives you first character everytime
        String lastCharacter = str.substring(str.length()-1);//substring(beginning index) gives you the characters from a specific index to the last index
        System.out.println(firstCharacter + lastCharacter);

        // 3. way: By using indexOf()
        // indexOf() method returns the index (the position) of the FIRST occurrence of a
        // specified character in a string (including whitespace)
        System.out.println("The index of a is: " + str.indexOf("a"));  // 1


        // Practice:

        //Example 1: Print just the animal names from the String; "I like lion, horse, laptop and cat"
        String s = "I like lion, horse, laptop and cat";
        String lion = s.substring(7,11);
        String horse = s.substring(13, 18);
        String cat = s.substring(31);
        System.out.println(lion +" " +horse +" " + cat);

        //Example 2: Type code to get initials of the first name and the last name of a given name. Ali Can ==> AC, Mary Star ==> MS etc.
        String name = "Tom Hanks";
        String initialOfFirstName = name.substring(0, 1);
        String initialOfLastName = name.split(" ")[1].substring(0, 1);
        System.out.println(initialOfFirstName + initialOfLastName);

        //Example 3: Type code to find the number of words in a String; "I like to move it, move it" ==> 7
        String word = "I like to move it, move it.";
        //Note: If you use "length" after split() method do not use parenthesis, when you use it for Strings

        int numOfWords = word.split("").length;
        System.out.println(numOfWords);












    }
}
