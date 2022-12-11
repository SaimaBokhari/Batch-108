package day08stringmanipulationsloops;

public class ForLoop01 {
    public static void main(String[] args) {

        /*
        Example 1: Type code to print "Hi" five times on the console.
         */

        // 1st way:
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        /*
        1st step: Type what they asked. Run the code to see if it's working.
        2nd Step: Check if it meets the coding standards or not. If it doesn't, it will be rejected.
        e.g. repetition, difficult to type, maintain and update ... not recommended.
         */

        /* 2nd way: to do repeated actions, Java created "Loops".
         There are four types of loops in Java.
         1) for-loop 2) while-loop   3) do-while-loop    4) for-each-loop
         */

        /*
        for-loop... follow this structure (like if-statements)
        Inside the (), there should be three parts:
        a) for the first part, put starting value (for the above example int i = 1)
        b) for the second part, put the condition (i<=5)
        c) for the third part,put increment (i=i+1 or 2 or 3 or...) /decrement (i=i-1....)
        increment can be done by addition and multiplication, decrement can be done with subtraction and division.

        Note: Java syntax for increment is i+=1; or i*=1
        OR  i++; ==> i=i+1 (but this method is used to increase only by 1.
        Same goes for decrement.
        i++ or i-- works only for addition or subtraction by 1.



             starting value ;  condition   ; increment/decrement){
        for(int i = 1       ;      i<=5    ;         i++    ){
          System.out.println("Hi");
        }
         */

        for(int i = 1; i<=5; i++){
            System.out.println("Hi");
        }

        /* Example 2: Type all integers from 11 to 44 in the same line with a space
        between consecutive integers.
         */

        for(int i = 11; i<45; i++){    //  i<45 is better than i<=44; coz Java will have to check only one condition
            System.out.print(i+ " "); // remove 'ln' to print all numbers on the same line
        }                             // use space between "" to create space among the numbers

        System.out.println(); // typing this sout with () takes the cursor to the next line on the console.

       /* Example 3: Type all integers from 44 to 11 in the same line with a space
        between consecutive integers.
         */
        for(int i=44; i>10; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        /*
        Example 4: Type even integers from 11 to 44 in the same line with a space
        between consecutive integers. integer % 2 e.g 6, 12, -8,0,...
         */

        for(int i=11; i<45; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        /* Example 5: Type odd integers from 68 to 13 in the same line with a space
        between consecutive integers.

         */

        for(int i=68; i>12; i--){
            if(i%2 !=0){
                System.out.print(i + " ");
            }
        }

        System.out.println();


        /* Example 6:  Type all integers which are divisible by 4 and not divisible
        by 6 from 120 to 11 in the same line with a space between consecutive integers
         */

        for(int i=120; i>10; i--){
            if(i%4==0 && i%6!=0){
                System.out.print(i + " ");
            }
        }














    }
}
