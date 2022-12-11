package day09_ForLoops;

public class Loops01 {
    public static void main(String[] args) {

        /*
        Example 1; Type code to reverse a String.
        e.g. Tom ==> moT
        Note: Interview question.. reverse the String using loop
         */

        String name = "Queen Elizabeth is dead";

        String reversedName = "";

        for(int i=name.length()-1; i>=0; i--){
            char ch = name.charAt(i);
            // System.out.println(ch);
            // To assign the received data to reversed container,
            // we need to create an empty String container and assign
            // the received value to that container.

            reversedName = reversedName + ch;
            System.out.println(reversedName);
        }

        System.out.print(reversedName); // to see the result in one line, you can print it out of the loop brackets.
        System.out.println(); // Leave it empty to create gap on the console.


        // Example:

        String lastName = "Johnson";
        String reversedLastName = "";
        for(int i = lastName.length()-1; i>=0; i--){
            char ch2 = lastName.charAt(i);
            reversedLastName = reversedLastName + ch2;
        }
        System.out.print(reversedLastName);

        System.out.println();

        /* Example 2:
        Find the sum of the integers from 3 to 6.
         */

        // common interview question

        // Create an empty container
        int sum = 0;
        // 0 is identity element in addition operation so we use 0 in addition operation.

        for(int i=3; i<7; i++){
            sum=sum+i;
            // System.out.println(sum);
        }
        System.out.println(sum); // to get the final answer, print it out of the loop.

        /*
        Example 3:
        Find the multiplication of the integers from 3 to 6.
         */
        // 1 is the identity element in multiplication operation.

        int multiplication = 1;
        for(int i=3; i<7; i++){
            multiplication=multiplication*i;
        }
        System.out.println(multiplication);

        /*
        Example 4:
        Type code to find the sum of the digits of an integer.
        584 ==> 5+8+4=17  ==> %10 and Ordinary division by 10

         Note:
         1st step:
         We need to get last digit from the given integer.
         number%10 gives you the last digit. 584%10 = 4 ... remainder is 4.
         4 goes into the container.
         Update the number by simple division (mathematical one)
         584/10=58.4 ... Java removes decimals to get rounded off integers.
         so we get 58.

         2nd Step:
         58%10= 8 is the remainder. 8 goes into the container.
         Update the number by simple division.
         58/10=5.8 .. Java removes the decimal and gives you new
         integer 5

         3rd Step:

         5%10= 5 is remainder coz there's no 10 in 5.
         Update the number by simple division.
         5/10=0.5... Java will round it off to 0.

         */

        int num = -584;

        num = Math.abs(num); // We create this container to convert -ve values to positive values.

        // Math.abs()==> gives the positive value of the integer.
        // Even if it is negative, abs() will convert the value to positive value.
        // decrement by division; instead of i-- we use division method to decrease.

        int sumOfDigits = 0;

        for(int i=584; i>0; i=i/10){
            sumOfDigits= sumOfDigits + i%10;
        }
        System.out.println(sumOfDigits);








    }
}
