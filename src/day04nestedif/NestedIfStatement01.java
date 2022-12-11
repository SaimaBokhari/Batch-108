package day04nestedif;

import java.util.Scanner;

public class NestedIfStatement01 {
    public static void main(String[] args) {

        /*
        Ask user to enter a password

If the initial of the password is uppercase
          Check if it is 'A' or not.
          If it is 'A' the output will be "Valid Password"
          otherwise the output will be "Invalid Password"
          For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

If the initial of the password is lowercase
          Check if it is 'z' or not.
          If it is 'z' the output will be "Valid Password"
          otherwise the output will be "Invalid Password"
          For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
          */

        // index always starts from zero.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password");
        // String pwd = input.next().charAt(0);     // the task is to get the initials. so don't use next() method only.

        /* charAt(0) means you want Java to use index of the String character.
            charAt() method returns just a single character, data type in
            Java for single character is 'char'. That's why we use char data
            in this task. type for password in this task. Java will use the
            ASCII values of these letters.

        Golden rule: Always run the code for critical and boundary values and then pass the code to be ok.
         */

        /* Critical values for this task:    A     Z     a    z
           Boundary values for this task: @     M     /     m
           Boundary values mean one number/digit before
           the critical value and one after.
           e.g. user types password like:  @Acdk
           position of each letter is @-1, A-2, c-3, d-4, k-5
           index value of each letter is @-0, A-1, c-2, d-3, k-5

           Tom .. index of T is 0, index of O is 1, index of M is 2

           Index value is different from position of the letter/number
           in the password. charAt(0) means we are asking Java to check
           the value for index value of the password.
           next() method will allow Java to accept whole password;
           charAt(0) method will consider the initial of the password only.
         */
        char pwdInitials = input.next().charAt(0); // make the name relevant to the task to improve readability.

        if (pwdInitials >= 'A' && pwdInitials <= 'Z') {
            if (pwdInitials == 'A') {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        }
        if (pwdInitials >= 'a' && pwdInitials <= 'z') {
            if (pwdInitials == 'z') {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        } else {
            System.out.println("Invalid password");


        }
    }
}
