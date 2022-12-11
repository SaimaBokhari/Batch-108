package day17listsandpassbyvalues;

public class PassByValue01 {
    public static void main(String[] args) {
        int price = 20;
        System.out.println(price);

        change (price);                             // when we call any other method into the main method, it should be static as well.Otherwise "change" method will complain
        System.out.println(price);                  // Inside the static method, everything should be static.

        System.out.println(change(price));

        price = change(price);
        System.out.println(price);      // you can insist on changing the original value.

        /* 1) Pass by Value:

         When we use a variable inside a method, Java creates a copy of that variable and uses it for any further action.
        Java does that to protect the original value of the variable. Otherwise, variable will change every time it's used.
        If in every method usage, the value changes, it creates problem.

        Example:
        Price of a shirt is 100 .
        10% discount for seniors; 10% discount for students; 20% for veterans
        If price variable changes after every discount, the students and veterans will get more discount than said.
        After 10% discount for the seniors, price variable will be 90, after student discount, price variable will be 80 etc.
        So Java has to protect the original value, so everytime we can go to original value to calculate the discount.

        For that purpose Java creates a copy of the variable and uses that to calculate new value (e.g. discounts in this example)
        and the original value stays intact.
        So in this example, when we use change(), it changes the copy price and calculates the discount.


        2) Pass by reference:
        Some programming languages don't use "Pass by value", they use "Pass by Reference".
        In "Pass by Reference", the original value changes with every method usage.

        3) If you insist on changing the original value in Java, you can do it as well. Assign the updated value to the original
       variable, then the original variable will be updated.
         price = change(price);

         Java uses "Pass by Value". In Java, original value is under protection.


         */

    }

    public static int change (int a){      // this method should be outside the main method.
        return a*2;
    }

}
