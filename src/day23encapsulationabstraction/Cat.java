package day23encapsulationabstraction;

public class Cat extends Mammal {
    public void meow(){
        System.out.println("Cats meow.");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat fish.");
    }
// child class will show error unless and until you create an overriding method
//    in the child class.

    @Override
    public void drink() {
        System.out.println("Cats love to drink milk.");
    }

    public void hunt(){

    }

}
