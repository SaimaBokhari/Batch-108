package day26exceptions;

public class E01 {
    public static void main(String[] args) {
        printAge(25);   // When you call a method, you use actual values (like 25 in this example) inside
                        // the method parenthesis, they are called "arguments"

       //  printAge(-25);  // this is illogical argument, so we need to handle it.

        try {
            printAge(-25);
        }catch(IllegalArgumentException e){
            System.out.println("Age is not valid");
        }


        try {
            printWorkerAge(14);
        }catch(IllegalArgumentException e){
            System.out.println("Age is not valid to be a worker");
        }

    }

    //Create a method to print the given age.

    public static void printAge(int age){   // when you create a method, you use "variables" inside the (), they're called "parameters".

        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");  // by using "new", we are creating new object from
                                                                          // "IllegalArgumentException" class.
                                                                         // This will ask Java to stop the execution. opposite to day25
        }
        System.out.println(age);
        // by using "throw new ....", you can throw exception whenever you want,  wherever you want.
    }

    // Create a method to print worker's age (under 16 is not acceptable)

    public static void printWorkerAge(int age){
        if(age<16){
            throw new IllegalArgumentException("Worker's age can't be under 16.");
        }
        System.out.println(age);
    }


}
