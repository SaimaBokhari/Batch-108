package day12variabletypesstaticblock;

public class RunnerClass {
    public static void main(String[] args) {

        // To access a non-static variable, you have to create an object like below.
        VariableTypes01 obj = new VariableTypes01();
        System.out.println(obj.name); // Tom Hanks

        // Actually you can access static class members by using objects, it is not
        // recommended.
        System.out.println(obj.age); //13

        // To access a static variable, no need to create object, just class name is enough.
        // like below.
         System.out.println(VariableTypes01.age); //13


        System.out.println(obj.add(3,5));    //8

        System.out.println(obj.multiply(5,7)); // 35







    }
}
