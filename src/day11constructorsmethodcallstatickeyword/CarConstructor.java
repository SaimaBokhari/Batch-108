package day11constructorsmethodcallstatickeyword;

public class CarConstructor {
    /*
    Constructor is like the cook. We need a cook to mix all the ingredients and
    bake a cake.
    Classes are used as templates to create an object.

    When you create a class, you will use it most probably
    to create an object. Java knows it. So Java puts a constructor automatically in the class.
    It's called Default Constructor.
    Default Constructors are invisible.

    If you create your own constructor, Java deletes the Default Constructor.

    */

    // How to create a constructor?

    // 4 steps:     access modifier    + name of the constructor (it must match with the class name  + ()   +   {}
    // Notes: Constructor name must match with the class name.


    /*
     Differences between constructors and methods:

     1.Constructors don't have 'return type' but methods have.
     2. Constructor name must match with the class name (not flexible) but method name can be any name (flexible).
     3. Constructors are used to create objects but methods are used to create some actions.
     */


    /*
    - A project needs many classes (C1, C2, C3 ....) and a runner class. Runner class
      will reach out to the class (lets say C3) mentioned in its code and print accordingly.
    - Scanner class is imported from Java library, but we can create our own class like today
      we created Car class. (example: if you have a copy of book at home, you don't need
       to borrow (import) it from the library.
    - Sometimes we need to import our own created classes as well. If the classes created are
      in the same package, no need to import. But if you have to use it across the packages,
      you need to import it.
     */


    String make = "Toyota";
    String model = "Prius";
    int year = 2020;
    int price = 20000;

    // 1st constructor:

    public CarConstructor(){     // this is a Constructor, and it is not using any parameters... means () are empty.
        System.out.println("Car constructor 1");
    }

    // public int add() {}     // this is a method.

    // There can be many constructors in a class. (like many cooks in a kitchen.)
    // Creating second constructor gives you flexibility, so you can create various objects.


    // 2nd constructor: with parameters ... () has 4 parameters inside.

    public CarConstructor(String make, String model, int year, int price){
        this.make = make;             // this means this class
        this.model = model;       // white make (on the right side) is input by the user, "=" will assign the
        this.year = year;         // given value to the existing variable of this class (this.make).
        this.price= price;
    }

    // 3rd constructor: with parameters  .... () has 3 parameters inside.
        public CarConstructor(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
    }


}