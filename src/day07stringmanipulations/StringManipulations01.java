package day07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str = "Java is easy";
        // contains() method will check if the given character exists inside the String.
        // If it exists, it will tell me true; it doesn't exist, it gives false.
        // so this method returns boolean. That's why we should create boolean container.
        // Remember String are case-sensitive. Use double speech marks "".


        boolean isExist = str.contains("x");
        System.out.println(isExist);

        // str.startsWith("J"); This step can be merged with the next one by
        // writing the name of the container and data type like below.
        boolean result = str.startsWith("J");
        System.out.println(result);


        // str.startsWith("i", 5);
        boolean res = str.startsWith("i", 5);
        // If you use startswith() method with 2 parameters, second parameter
        // means skip the first ..... number of characters. e.g.
        // 5 means we tell Java to skip 5 characters(including space if there's any)
        // and check if the String starts with 'i' or not.
        System.out.println(res);

        /*
        Example 1:
        Check if the given password
             1) has "A" in any position
             2) has "xy" at the beginning
             3) has "W" as 7th character
             4) has 8 characters in total
         */

        String pwd = "xy1AmSW?";

        // For first condition 1) has "A" in any position, we'll use contains() method.
        boolean firstRule = pwd.contains("A");
        // 2) has "xy" at the beginning
        boolean secRule = pwd.startsWith("xy");
        // 3) has "W" as 7th character
        boolean thirdRule = pwd.startsWith("W", 6);
        // 4) has 8 characters in total
        boolean fourthRule = pwd.length() == 8;

        System.out.println("Is password valid?" + (firstRule && secRule && thirdRule && fourthRule ));


        String s = "Do practice to be better";
        s.endsWith("e");
        boolean rslt = s.endsWith("r");
        System.out.println(rslt);
        // endsWith() method can be used to check words as well
        // e.g. endsWith("better")

       // contcat () method works the same as '+' sign in Java.
        s.concat("!");
        String t = s.concat("!");
        System.out.println(t);

       /* Note: if there's method created by Java, it's preferable to use
       that method instead of signs.
       concat () can be used repeatedly. e.g. String t = s.concat("!").concat(...);
        If you use multiple methods, it's called Method Chain.
        */










    }
}
