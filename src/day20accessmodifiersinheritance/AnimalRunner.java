package day20accessmodifiersinheritance;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat c = new Cat();
        c.eat();
        c.drink();
        c.meow();

        // Create a "Dog" object and see which methods can be used.
        Dog d = new Dog();
        d.eat();
        d.drink();
        d.bark();

        // Create a "Bird" object and see which methods can be used.
        Bird b = new Bird();
        b.eat();
        b.drink();
        b.tweet();


    }

    /*
    Notes:

    1. We use "inheritance"
       a) to prevent "repetition"
       b) to make "maintenance" easy
       c) to make our classes "atomic"

     2. To make a class child of another class, we use "extends" keyword

     3. Child classes can use class members from the parent classes
        However, parent classes cannot use anything from the child classes.
        (one way direction)
     4. Every class in Java has at least one parent class, which is "Object Class".
        "Object Class" is like Adam .. it doesn't have parent class.

     5. Inheritance types in Java
        a) Multilevel Inheritance
        b) Hierarchical Inheritance
        c) Multiple Inheritance (Java doesn't support it)
        d) Opposite of "Multiple Inheritance" is "Single Inheritance"
          Java supports "Single Inheritance"

     */














}
