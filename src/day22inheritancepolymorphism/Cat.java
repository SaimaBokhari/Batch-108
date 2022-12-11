package day22inheritancepolymorphism;

public class Cat extends Mammal{
    public String name = "Cat";

    public Cat(){
        System.out.println(name);

        System.out.println(super.name); // super takes you to the parent
    }

    @Override  //  Overriding method ... this is annotation, and it will check the overriding rules.
    public void eat() {
        System.out.println("Cats eat..");
    }

    @Override
    public Animal create() {
        return super.create();
    }

    @Override
    public Integer add() {
        return 23;
    }

    @Override
    public int multiply() {
        return 34;
    }



}
