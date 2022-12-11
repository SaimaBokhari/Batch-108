package day07stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String str = "Java is OOP";

        str.replace('O', '*');
        String result1 = str.replace('O', '*');
        System.out.println(result1);

        str.replace("Java", "*");
        String result2 = str.replace("Java", "*");
        System.out.println(result2);


        /*
        Example 1: Change all digits to '*' in the given String.
         */

        // 1st way: not recommended because there's repetition.

        String st = "Ali is 137 years old, but he looks 198";
        String result3 = st.replace('0','*').
                replace('1','*').
                replace('2','*').
                replace('3','*').
                replace('4','*').
                replace('5','*').
                replace('6','*').
                replace('7','*').
                replace('8','*').
                replace('9','*');
        System.out.println(result3);

        // Note: If your code doesn't work for all values, it's called Hard Coding.
        // It's not acceptable.

        // 2nd way: (Recommended)

        String result4 = st.replaceAll("[0-9]", "*");
        System.out.println(result4);
        /* regex is abbreviation for 'Regular expressions. It represents
        a group of data. e.g. in above example all digits [0-9]
        or all lower case letters: [a-z]
        or all upper case letters: [A-Z]
        All lowercase and uppercase letters: [a-zA-Z]
        All lowercase and uppercase letters and digits: [a-zA-Z0-9]
        Some multiple characters e.g. a.e.i.o.u: [aeiou]
        All characters different from digits: [^0-9)  ^ sign reads different from
        All characters different from letters: [^a-zA-Z]
        All characters different from vowels: [^aeiou]


        Space character: \\s
        All characters different from space character: \\S

        All digits: \\d
        All characters different from digits: \\D

        All uppercase, lowercase letters and digits and _: \\w
        Different from All uppercase, lowercase letters and digits and _: \\W

        All punctuation marks: \\p{Punct}

         */

        /* 1)
        Type code to check if a password is valid or not for the following conditions;
        Password must have at least 8 characters different from space character
        Password must have at least 1 symbol
         */

        String pwd = "!1a23b4?es";
        // Password must have at least 8 characters different from space character.
        // pwd.replaceAll("\\s","").length()>7;
        boolean firstRule = pwd.replaceAll("\\s","").length()>7; // explicit way of removing space character.

        //Password must have at least 1 symbol.
        boolean secondRule = pwd.replaceAll("\\s","").replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println("Is the password valid?" + (firstRule && secondRule));

        // 2nd way:
        boolean thirdRule = pwd.replaceAll("\\s","").replaceAll("[a-zA-Z0-9 ]", "").length()>0;
        System.out.println(thirdRule);

        // put a space after 9 in this ...> [a-zA-Z0-9 ], it covers both rules. But first way is better.
        // Test with different scenarios.

    }
}
