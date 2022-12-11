package day04Switch01;

import java.util.Scanner;

public class SwitchReview4 {
    public static void main(String[] args) {

        /*
        4)  Print "Boy" if the gender is "Male" (Ignore cases)
Print "Girl" if the gender is "Female" (Ignore cases)
Print "Others" if the gender is different from "Male" and "Female"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender = input.next().toLowerCase();

        switch(gender.toLowerCase()){
            case "f":
                System.out.println("Girl");
                break;
            case "m":
                System.out.println("Boy");
                break;
            default:
                System.out.println("Others");
        }

    }
}
