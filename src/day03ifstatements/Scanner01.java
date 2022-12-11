package day03ifstatements;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        /* Example 1: Get first, middle, last name and social security number
        and then print them like the given format.
        Tom Jim Hanks
        236748633
         */
        Scanner input = new Scanner(System.in);
        // Scanner() acts like a cook who needs to put all things in the
        // oven (Scanner class in this case). Some cooks need extra things
        // some don't. This one needs so we put System.in inside the
        // parenthesis Scanner(System.in)

        //1.step: Create object from Scanner class
        // Scanner input= new Scanner(System.in);

        //2.Step: Send message to the user.Ask user to enter his/her grade
        System.out.println("Enter your grade");

        //3.Step: Create a container with the appropriate data type
        int score= input.nextInt();

        //4.Step: Type code condition with if statement

        System.out.println("Enter your first name");
        String firstname = input.next();

        System.out.println("Enter your mmiddle name");
        String middlename = input.next();

        System.out.println("Enter your last name");
        String lastname = input.next();

        System.out.println("Enter your socialsecuritynum");
        String socialsecuritynum = input.next();

        System.out.println(firstname + " " + middlename + " " + lastname + " " + socialsecuritynum);

        // In order to get the space between names and social security number, use " "
        // with a space between and use + sign before and after it.


    }
}
