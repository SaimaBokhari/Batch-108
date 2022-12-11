package day08stringmanipulationsloops;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str = "Java is easy. Java is OOP.";
        String result1 = str.replaceFirst("Java", "Apex");
        // replaceFirst() replaces the first occurrence of the said word.
        System.out.println(result1);
        String result2 = str.replace("Java","Apex");
        System.out.println(result2);

        /*
         Example 1:
         String shirtPrice = "$12.99";
         String bookPrice = "$35.99";
         Type code to find the sum of the prices.
         */

        // How to do addition using String
        // First change String data type to double by using Wrapper class. (Autoboxing)

        String shirtPrice = "$12.99"; // we have to use String instead of double because of the $ sign.
        String bookPrice = "$35.99";

        String shirt = shirtPrice.replace("$","");
        System.out.println(shirt);

        String book = bookPrice.replace("$","");
        System.out.println(book);

        Double shirtInDouble = Double.valueOf(shirt);
        Double bookInDouble = Double.valueOf(book);

        System.out.println(shirtInDouble + bookInDouble);
        // Note:  valueOf() method converts String data type to numeric values.
        // We can't do addition in Strings.
        // To be able to use valueOf() method, String must be numeric format.
        // $12.99 is not numeric. 12.99 is numeric form.
        // valueOf() method is available for all numeric data types (primitives).

        /*
        Example 2:
        Swap the integers.
             e.g. a=12  b=23  ==>  a=23   b=12
         */
        //1st Way: using third variable

        int a = 12, b = 23;
        int temp = b;  // 23                // Java has garbage collector to collect the unused containers after some time.
        b = a;  // 12
        a = temp;  // 23
        System.out.println(a);  //23
        System.out.println(b);  // 12

        //2nd Way: without using third variable
        int x=14 , y=25;

        y = y-x; // 25-14=11 ==> y=11
        x = y+x; // 11+14=25 ==> x=25
        y = x-y; // 25-11=14 ==> y=14

        System.out.println(x);
        System.out.println(y);














    }
}
