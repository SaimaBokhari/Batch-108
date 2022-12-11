package day10Loops;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        // While loop:

        int i = 1;
        while(i<1){
            System.out.println("While Loop");
            i++;
        }

        /* We will get nothing on the console coz condition is false,
         loop will be broken. So no code would be executed.
         Zero execution is possible.
         While Loop is wise. It thinks first then acts.
         */

        // Do While Loop

        int k = 1;

        do{
            System.out.println("Do While Loop");
            k++;
        }while(k<1);

        /* sout body will be printed on the console although the condition is false,
         loop will be broken in this case as well.
         Zero execution is impossible. Loop body will be executed at least once.
         Do While Loop acts first, think later :)
         */

        // If it is a must to execute the code inside loop body at least once,
        // use do while. e.g. ATM machine... Enter your password. or games

         /*
              Example 1: Ask user to enter an integer.
              If the integer is less than 100, tell user "You won!"
              Otherwise, tell user "Lost!"
        */

        Scanner input = new Scanner(System.in);

        int num=0;   // Every loop need starting value. Value given by user
                    // will be put in this container.

        do{
            System.out.println("Enter a number to play");
             num = input.nextInt();

            if(num<100){
                System.out.println("You won!");
            }
        }while(num<100);   // if we use num outside the scope of do while loop {}, it will error.
                           // To fix it, we create the starting value container which is not limited in scope.
        System.out.println("You lost!");

        /* {} give the scope of the variable.
        In this example, we didn't use increment/decrement (i++)
        because user is doing increment/decrement by entering the new
        value again and again.
         */

        /*
        In the do-while loop, the body of a loop is always executed at
        least once. After the body is executed, then it checks the condition.
         If the condition is true, then it will again execute the body of a
         loop. Otherwise, the control is transferred out of the loop.
         */

        // Infinite Loop:
        // Note: If you do mistake in increment/decrement part,
        //your loop will be infinite. Don't create infinite loop. it's considered a big mistake.

//        for(int p=1; p<10; p--){
//            System.out.println(p + " ");
//        }

        // This loop will not be broken and work forever.
        //Note: If you do mistake in increment/decrement part the loop will be infinite loop. Do not create infinite loop
//

        //Note: If you do not type increment/decrement part, the loop will be infinite loop. Do not create infinite loop
//        for(int p=1; p<10;      ){
//            System.out.print(p + " ");
//        }

        //Note: By putting "true" inside the while parenthesis, we can create infinite loop,
        // and we break the loop by the codes inside the loop body
//        int r = 0;
//        while(true){
//            System.out.println("Hi!");
//            r++; // if we don't use if condition here, this will be infinite loop.
//            if(r==5){
//                break;
//            }
//        }














    }
}
