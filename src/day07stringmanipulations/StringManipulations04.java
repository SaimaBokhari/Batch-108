package day07stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {

        String str = "String is a non-primitive data type in Java.";

        str.isEmpty();
        // isEmpty() method returns true if the String has no character, otherwise it returns false.
        boolean result1 = str.isEmpty(); // false
        System.out.println(result1);

        /* isEmpty() and str.length()==0 has same meaning. But we use
       isEmpty(). Two reasons:
           a) If Java has created a method for any function, we prefer
              to use the method instead of signs.
           b) For str.length()==0,  Java has to perform two functions:
              check the length as well as see if it's equal to 0 or not.
              which is not efficient.
         */

        str.isBlank();
        // isBlank("")==> true ; isBlank(" ") ==> true
        // isEmpty("") ==> true ; isEmpty(" ") ==> false
        boolean result2 = str.isBlank();
        System.out.println(result2);

        /* Example: Check if a String has just letters and spaces in it.
        "Learn Java earn money"

         */

        String s = "Learn Java earn money!";

        s.replaceAll("[a-zA-Z ]", "").isEmpty();
        boolean result3 = s.replaceAll("[a-zA-Z ]", "").isEmpty();
        System.out.println(result3);

        /* Check social security number (SSN) for the following rules:
           1) it must have only digits only
           2) it must have 9 digits

         */

        String ssn = "123A45678";

        // 1) it must have only digits only
        ssn.replaceAll("[0-9]", "").isEmpty();
        boolean firstRule = ssn.replaceAll("[0-9]", "").isEmpty();

        // 2) it must have 9 digits
        boolean secondRule = ssn.length()==9;

        if(firstRule && secondRule){
            System.out.println("Valid ssn");
        }else{
            System.out.println("Invalid ssn");
        }





    }
}