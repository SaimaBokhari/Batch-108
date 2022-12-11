package day02typecastingscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        /* Scanner Class: We get data from users into our codes.
         Every application interacts with the users e.g. calculator, ATM machine etc.
         Users input data, data goes in the application. Scanner class is used to get
         that data from users.
         How to get data from users?
         Step 1: Create an object from Scanner class.

         When you will type word 'Scanner', it will show error. Put your arrow on the word
         for a couple of seconds, it will show the option of 'import class', click on it
         and you can see that this class is imported from util library. (see line 3 above)

         */
        /* Class Name  Object Name   Assignment Operator  new keyword     Constructor ==> Class name + ()
            Scanner      input          =                   new           Scanner();
            Scanner      input          =                   new           Scanner(System in);
                                 Scanner Constructor wants to use (System in)

         */
        Scanner input = new Scanner(System.in);

        // 2nd Step: Give a message to user about the data you ask (e.g ATM machine)//

        System.out.println("Enter your address");
        String address = input.nextLine();
        System.out.println(address);

        // 3rd Step: Get the data by the help of the "input" object//

        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println(age);

        System.out.println("Enter your name");
        String name = input.next();
        System.out.println(name);










    }
}
