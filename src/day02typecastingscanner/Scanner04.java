package day02typecastingscanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Homework questions//
        /* Q.1)
        Type a program which calculates the area and the perimeter of a square
        whose side length is entered by user.
                Hint 1: Area of a square is length x length
                Hint 2: Perimeter of a square is 4x length
         */

        System.out.println("Enter length");
        Double l = input.nextDouble();

        System.out.println("Area of the perimeter is"+ (l*l) + (4*l));

        /* Q.2) Type a program which calculates the cube of a number which
        is entered by user.
        Hint 1: Cube of a number is a x a x a
         */

        System.out.println("Enter a number");
        short c = input.nextShort();
        System.out.println("The cube is" + 3*c);

        /*
        Q.3) Type a program which calculates the area and the perimeter of a rectangle
           whose length and width are entered by user.
           Hint 1: Area of a rectangle is width x length
           Hint 2: Perimeter of a rectangle is 2x (width + length)
         */

        System.out.println("Enter length, width");
        int length = input.nextInt();
        int width = input.nextInt();
        System.out.println("Area of the rectangle is" +" "+ width*length);
        System.out.println("Perimeter of the rectangle is" +" " + 22*(width+length));

        /*
        Q.4) Type a program which calculates the volume of a rectangular prism
             whose length, width, and height are entered by user.
             Hint 1: Volume of a rectangular prism is width x length x height
         */
        System.out.println("Enter len, wid, height");
        Double len = input.nextDouble();
        Double wid = input.nextDouble();
        Double height = input.nextDouble();
        System.out.println("Volume of the rectangular prism is" + " " + (len*wid*height));







    }
}
