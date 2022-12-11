package day27exceptionscollections;

public class CustomExceptions01 {

    /*
    Normally, Java has many Exception classes which covers many issues.
    But sometimes we need  Custom Exceptions for two reasons:
       1. To make Java Exceptions specific.
          "FileNotFoundException" has 2 reasons in it
                    a) path can't be found
                    b) file might not exist

           In order to find out the exact/specific reason, we have to create custom exception

       2. To create some Exceptions for our application
           "IllegalGradeException" can be created for a school management system application

       3. Custom Exceptions directs the developers not to break the application rules

Note: Remember to write "Exception" when you create custom exception class.
     */

    public static void main(String[] args) {

        try {
            printGrade(45);
        } catch (IllegalGradeException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(checkNameFormat("Tom"));
    }
    public static void printGrade(double grade) throws IllegalGradeException {
        if(grade<0 || grade>100){
            throw new IllegalGradeException("Grades cannot be less than zero or more than hundred.");
        }else{
            System.out.println(grade);
        }
    }

    public static boolean checkNameFormat(String name){
        if(name.charAt(0)>= 'A' && name.charAt(0)<= 'Z'){
            return true;
        }else{
            throw new IllegalNameException("Names must start with Upper cases.");  // you didn't get red underline because it is not compile time exception

        }
    }





}
