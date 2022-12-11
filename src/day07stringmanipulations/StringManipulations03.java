package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /* Example 1: How many punctuation marks are used in the given String?
        "Ali is 13 years old, I like Ali, Ali doesn't like me!..."
         */
        String str = "Ali is 13 years old, I like Ali, Ali does not like me!...";

        int numOfAllChars = str.length();
        int numOfAllCharsDiffFromPunctuationMarks = str.replaceAll("\\p{Punct}","").length();
        System.out.println(numOfAllChars - numOfAllCharsDiffFromPunctuationMarks);//6



        /* Example 2:
        Ask user to enter his full name and fix if the user enters
        space at the beginning and at the end.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first and last name please");
        String fullName = scan.nextLine();
        System.out.println(fullName);

        String fixedFullName = fullName.trim();
        // This method removes spaces from the beginning and the end; doesn't touch the
        // spaces in the middle.
        System.out.println(fixedFullName);


    }
}
