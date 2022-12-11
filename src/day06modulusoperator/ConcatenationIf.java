package day06modulusoperator;

public class ConcatenationIf {
    /*
    Concatenation means joining String values with each other or other data types.
    To do concatenation, we have two options:
    1st: Use '+' sign
    2nd: Use 'concat()' method

     */

    public static void main(String[] args) {

        // 1st way: (for all data types)

        String s = "Tom";
        String t = "Hanks";

        int i = 12;
        int a = 5;
        char c = 'A';
        System.out.println(s + " " + t);
        System.out.println(s+i+a);
        System.out.println(s+(i+a));
        System.out.println(i+a+s);
        System.out.println(s+" "+ c +" " +t);
        System.out.println(s + a*i);
        System.out.println(i+c+s); // ASCII value of A is 65
        System.out.println(c + s + a);
        System.out.println(i + " "+ a + " "+s);

        // 2nd way: (only works with String values)

        System.out.println(s.concat("").concat(t)); // s and t both are String values.
        // System.out.println(s.concat(i)); This will show error.

        // concat method only works with String values.
        // if you put 'i' or 'a' inside concat(), it will show error.




    }
}
