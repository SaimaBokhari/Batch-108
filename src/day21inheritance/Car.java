package day21inheritance;

public class Car {
    public void engine(){

        System.out.println("All cars have engine");
    }

    public Car(){

        System.out.println("Car class constructor 1");
    }

    public Car(String engineType){
       // super(); // it's optional to type it, it's invisible. Even if we don't type it, it's still there.
        System.out.println(engineType);
    }

    public Car(int engineSize){
        this("Gas");
        System.out.println(engineSize);
    }

    public Car(String engineMake, int enginePrice){
        this(5000);
        System.out.println(engineMake + " " + enginePrice);
    }


    /* Task: When I create a Car object, I have to select:
    1)Engine Type
    2)Engine Size
    3)Engine Make and Price

    I need to use multiple constructors. I will select from the bottom upwards.
     */


}
