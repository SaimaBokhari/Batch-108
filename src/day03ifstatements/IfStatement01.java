package day03ifstatements;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        /*  If Statements:

        We sometimes need to execute some codes under specific conditions.
        "If it rains, I'll cancel the picnic."
        If statements are called conditional statements. If clause is condition,
        and second phrase is result.
        If the condition is true (if it rains), the result will happen (picnic will be cancelled)
        In Java, we say if the condition is true, the result will be activated;
        if it's false, the result will not be activated.
        e.g. 1) if number<0 is true, print negative if number>=0 is false print not negative

        We use If statements to change the code execution according to the conditions.

         */

        //1.step: Create object from Scanner class
        Scanner input= new Scanner(System.in);

        //2.Step: Send message to the user.Ask user to enter his/her grade
        System.out.println("Enter your grade");

        //3.Step: Create a container with the appropriate data type
        int score= input.nextInt();

        //4.Step: Type code condition with if statement

        // Example 1: Type code to print negative for the numbers less than zero,
        // non-negative for the numbers greater than or equal to zero.
        double d = 2.3;
        if(d<0){
            System.out.println("Negative");
        }
        if(d>=0){
            System.out.println("Non-negative");
        }

        // Example 2: Type code to print "Divisible by 5". If the number can be
        // divided by 5; otherwise print "Not divisible by 5" if the number cannot
        // by divided by 5.
        // Note: % sign in Java is an operator that gives you the remainder in division operation
        // it's called "modulus operator"
        // == sign checks equality in Java like = in Maths.
        // ! in Java means 'not'
        // != means doesn't equal to

        // 1st Way of using If statement code: (Multiple If statement)

        int i = 17;
        if(i%5 == 0){
            System.out.println("Divisible by 5");
        }
        if(i%5 !=0){
            System.out.println("Not divisible by 5");
        }

        /* if i = 15, the remainder is zero which is equal to zero in our code, so
        the console will show "Divisible by 5". If we put i=17, the remainder is 2 which
        is not equal to zero in our code, so the console will not show the result for the
        first code. But will show result of the second code  "Not divisible by 5" because
        we asked for it in our second code.
         */

        //2nd Way of using If statement code: (If-else statement)

        int k = 17;
        if(k%5 == 0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not divisible by 5");
        }
        // The 2nd way works the same as 1st. The only difference is Java has to work less:
        // Java has to apply 2 codes and apply the % operator twice in 1sy way; while in 2nd way,
        // Java has to apply first code only, if it's not true, Java prints second result on the console.
        //2.Way: if else statement => Use it if you have just two conditions
        // In the second way Java checked just 1 condition, but in the first Java is checking 2 conditions.
        //       If you type the code like in the second way
        //       i)You will prevent repetition ii)Java will execute your code faster

        /*
        Note: Make your application faster by following these rules:
        1) Avoid repetition
        2) Make JAVA WORK LESS
        So in this case, choose the 2nd way of applying If statement code coz it avoids repetition
        of the same codes and make Java work less by applying % operator only once.

         */


    }
}
