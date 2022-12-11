package day03ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        /* Remember
        1.step: Create object from Scanner class
                Scanner input= new Scanner(System.in);

        2.Step: Send message to the user.Ask user to enter his/her grade
                System.out.println("Enter your grade");

        3.Step: Create a container with the appropriate data type
                 int score= input.nextInt();

        4.Step: Type code condition with if statement
         */

        /*
          Example 1: Type code to print "Weekday" for the weekday names,
          "Weekend day" for the weekend day names
          Monday --> Friday ==> Weekday         Saturday, Sunday ==> Weekend day
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day name");

        String dayName = input.next();
        if (dayName.equals("Monday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Tuesday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Wednesday")) {
            System.out.println("Weekday");
        }

        if (dayName.equals("Thursday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Friday")) {
            System.out.println("Weekday");
        }


        //Note: To compare Strings use "equals()", do not use "=="
        /*
        1.Way: That code works, but it has many repetitions and Java has to do many tasks
         Though it found the value match in 3rd code, it still keeps on checking the next ones
        which is repetitive and not acceptable.
         */

        /*
        2nd way: If else statement:
         if (dayName.equals("Monday") || (dayName.equals("Tuesday")) || (dayName.equals("Wednesday")) || (dayName.equals("Thursday")) || (dayName.equals("Friday")){
         System.out.println("Weekday");
        }else{
            System.out.println("Weekend");
        }elseif {(dayName.equals("Saturday") || (dayName.equals("Sunday"))
         System.out.println("Weekend");
         }else{System.out.println("Invalid name");
         }
         Note: 2 scenarios to consider a) what if user types moNDAY b) is there any way to
         simplify this code; it seems too long and complicated.
         Solutions: a) use equalsIgnoreCase() from the dropdown list b) take the code from inside the if(), create
         a boolean container and put the if statements inside ()
         e.g. boolean isWeekday = dayName equalsIgnoreCase(another String "Monday") and create simple if
         statements, sout for boolean container.

        */
        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday");

        boolean isWeekEnd = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        if(isWeekDay){
            System.out.println("Weekday");
        }else if(isWeekEnd){
            System.out.println("Weekend day");
        }else{
            System.out.println("Invalid day");
        }


        /*
            Note: "OR" operator in Java is "||"
                  "||" can be used just with "boolean"s
                  To get false from "||" operator everything should be false.
                  Just a single "true" make the result "true"
                  true || true ==> true
                  true || false ==> true
                  false || true ==> true
                  false || false ==> false
         */

        /*
                Beauty of if-else-if-statement
                After finding true Java does not check the other conditions
         */




    }
}
