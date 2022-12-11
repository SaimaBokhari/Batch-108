package day01variables;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Homework Questions//

        /*
        5)Type a program which calculates the area and the perimeter of a circle
            whose radius is entered by user. (Use float)
            Hint 1: Take pi number as 3.14159
            Hint 2: Area of a circle is 3.14159 x radius x radius
            Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
            Hint 4: To get float, use nextFloat()
         */
        System.out.println("Enter radius of the circle");
        Float radious = input.nextFloat();
        System.out.println("Area of the circle is" + " "+ 3.14159*(radious*radious));
        System.out.println("Perimeter of the circle is" + " "+ 2*3.14159*radious);

        /*
        6) Type a program which calculates the perimeter of a triangle whose
            Side lengths are entered by user. (Use byte)
            Hint 1: Perimeter of a triangle is a + b + c
            Hint 4: To get byte, use nextByte()
         */

        System.out.println("Enter length of each side of the triangle");
        byte a = input.nextByte();
        byte b = input.nextByte();
        byte c = input.nextByte();
        System.out.println("Perimeter of the triangle is"+ " " + (a+b+c));

        /*
        7) Type a program which converts the mile to kilometer. Mile value will be
            entered by user. (Use double)
             Hint 1: km = mile x 1.6
             Hint 2: To get double, use nextDouble()
         */
        System.out.println("Enter miles");
        Double miles = input.nextDouble();
        System.out.println((miles)*1.6 +" "+ "km");

        /*
        8) Type a program which converts the hours to seconds. Hours value will be
            entered by user. (Use long)
             Hint 1: second = hour x 60 x 60
             Hint 2: To get long, use nextLong()
         */
        System.out.println("Hours");
        Long h = input.nextLong();
        System.out.println((h)*60*60 + " " + "seconds");

        /*
        9)Type a program which asks user to enter his/her first name and last name,
           then print it on the console.
           Hint: To get String, use nextLine()
         */
        System.out.println("Enter Your First Name");
        String firstName = input.next();
        System.out.println(firstName);
        System.out.println("Enter Your Last Name");
        String lastName = input.next();
        System.out.println(lastName);

        /*
        10) Type a program which asks user to enter his/her full name, and address
            then print them on the console like the full name should be in the first line,
            and the address will be in the second line.
            Hint: To get String, use nextLine()
         */
















    }
}
