package day24interfaces;

/*
- return is used in method to return a value if the method is not void
we must use return keyword.
- Final means "this is the final version and nobody can change this value"
and it's typed before the data type.
 */
public abstract class Abstraction01 {
    /*
    "final" keyword is very important in Java.

    1. "final" keyword can be used for variables. It means they cannot be updated.
        public final int age = 12;
        if you make a variable "final", you cannot change its value. value is fixed.
        for instance (public final double pi = 3.43)... pi value is fixed.
        it helps create constants

        "final variable" must be initialised. You must assign a value.
         public int age;   ... it's not a must to assign a value to normal variables.
         public final double pi; ... it will complain coz you didn't initialise the pi variable.

    2.  "final" keyword can be used for methods.
        "final method" body cannot be updated. (can't be overridden)

    3.  "final" keyword can be used for classes.
        "final classes" cannot have child classes.




    Note: "abstract classes" have something to do for child classes, (like a to-do list for your child)
           if there is no child class, having "to do list" is not sensible.
           "final classes" cannot have child classes, therefore Java does not allow to make an abstract class final.
           so abstract and final classes are kinda opposite to each other.
           abstract class needs to have a child class.
           final class doesn't have a child class.

    Note: "final method" body will be under protection by Java, because it should not be updated.
           If abstract methods don't have body, Java will look for the body to protect when it can't find it, it will complain.

     */

    public int age;
    public static final double pi = 3.14;

//    public static void main(String[] args) {
//        // pi++;   // Cannot increase the value of final variable 'pi'
//    }

public abstract int add(); // this serves as a to-do list for the child class. if we make it private, Java will complain.
                           // when we use abstract, we cannot use private as a modifier.



}
