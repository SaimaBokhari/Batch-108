package day02typecastingscanner;

public class TypeCasting01 {
    public static void main(String[] args) {

        //Example 1: Create 2 integer variables and 1 String variable.
        int i=13, k=21;
        String s = "Tom";
        System.out.println(i + k + s);
                     // ( 13 + 21 + Tom) Concatenation//
        System.out.println(s + i*k);
                    /* ( Tom + 13 * 21)
                       (Tom  + 273)
                       (Tom273) Concatenation
                     */
        /* Order of Operations in Maths:
         1) Calculate the exponential
         2) Do the operation inside the parenthesis
         3) Do multiplication and division
         4) Do additions and subtractions
         */
        int result = 3-2*(5+2*3)/11;
        System.out.println(result);

               /*  = 3-2*(5+6)/11 (step 2)
                   = 3-2*11/11  (step 3 multiplication first)
                   = 3-22/11   (step 3 then division)
                   =3-2   (step 4 subtraction is the last)
                   =1
                */
        /* Type Casting

        byte<short<int<long<float<double
        Auto widening
        Java can put small data types into large data types automatically.
        When you put small data type into large data type, you're widening the small data type.
         */
        //Example of AW:

        int m = 14;
        System.out.println(m);
        double d = m;
        System.out.println(d);
        /* the result is in decimal 14.0 coz we asked for double data type (which is decimal number)
        This is called Type Casting.

        Explicit Narrowing
            Java does not put large data types into small data types. You have to manually do it.
         */
        int n = 15;
        byte b = (byte)n;
        System.out.println(b);


    }

}
