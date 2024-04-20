package samplelesson;

public class Strings {
    public static void main(String[] args) {

        String str = "Java is easy";
        // length() method returns the length of the given string

        System.out.println(str.length());  // 12

        String str1 = "Java is easy.";
        int length = str1.length();
        System.out.println(length);


        // CONCATENATION  => JOINING / Combining of the String
        // 1. Way

        String str2 = "I love Java";
        System.out.println(str + str2);  // Java is easyI love Java
        System.out.println(str +". "+ str2 + ".");  // Java is easy. I love Java.

        // 2. way concat()

        System.out.println(str.concat(str2));  // Java is easyI love Java

        // Locating a character in a string
        char firstChar = str.charAt(0);
        char lasttChar = str.charAt(str.length()-1);
        System.out.println(firstChar + lasttChar);  // 195

        // ASCII OF J=74  ,  y=121
        System.out.println("" + firstChar + lasttChar);  // Jy

        // Note: If we use char data type in Math operation , we get the ASCII value of the characters
        // To solve this problem, we can use string "" so Java will read the code from left to right and do the concatenation

        // 2. substring()

        String firstCharacter = str.substring(0,1);  // always returns the first character
        String lastCharacter = str.substring(str.length()-1);
        System.out.println(firstCharacter + lastCharacter); // Jy

        // indexOf()
        System.out.println(str.indexOf('a'));  // 1

        // Note: indexOf() returns the first occurrence of that character.



    }

}
