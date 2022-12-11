package day23encapsulationabstraction;

/*
1. Sometimes no child uses the implementation from the parent class( super class),
   therefore the body part of the method in parent class is unused / unusuable.
   If something is unused, we don't want to type it.
   If you don't type body of a method, you will have "method without body" (like angels)
   it is called "Abstract Method"

2. Concrete Methods (regular methods with body) focus on two things:  a) what to do b) how to do
   But "Abstract Methods" focus on just "what to do".

3. If you make a method "abstract", it will be mandatory to override for all child classes.
    abstract method is like to-do list.

4. "Abstract Methods" can be created just in "Abstract Classes".
     To make a class abstract, put "abstract" keyword between access modifier and class.

5. When you remove "method body", you have to use "abstract" keyword between access modifier and "return type"
   of the method.

6. It is impossible to create object from an abstract class. But it doesn't mean they don't have "constructor".
    They have "constructors" but they are not used to create objects. (there's one part missing "how to do" part)

7. Abstract classes can have concrete methods as well.

8. But it isn't made mandatory for the child class to override concrete methods.It's optional.

9. "Abstract Methods" cannot be put into non-abstract class (concrete class)

10. If one child class does the overriding, it's enough. Not all child classes
    have to do it.

11. To create “fully encapsulation”;
1)Make all variables “private”
2)Create getter and setter for every variable


 */


public abstract class Animal {

    public abstract void eat();

    public abstract void drink();

    public void move(){   // concrete method
        System.out.println("Animals move..");
    }


}
