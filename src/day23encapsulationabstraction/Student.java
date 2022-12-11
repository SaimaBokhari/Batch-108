package day23encapsulationabstraction;

public class Student {
    public String name = "Tom Hanks";
    private String stdId = "TH123";
    private double stdGpa = 3.8;
    private String disease = "Heart patient";

    private boolean successful = false;


    public String getStdId() {
        return stdId;
    }


    public double getStdGpa() {
        return stdGpa;
    }

    public String getDisease(){
        return disease;
    }

// if the data type is boolean, get method name starts with "is".
    // it doesn't use the word "get".
    public boolean isSuccessful() {
        return successful;
    }


    // to update, we use setter
    // return type of setter will always be "void" because set() method will do just an action.
    // it will change the data.
    // inside the (), we use the parameter to tell Java which value we want to change.
    // we use "this" to ensure that variable from this class is used.

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setStdGpa(double stdGpa){
        this.stdGpa = stdGpa;
    }

    // Even the data type is boolean, we use "set" in the beginning of the name of set()
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public static void main(String[] args) {

        /*
                                Encapsulation
        OOP has 4 elements ==> Polymorphism, encapsulation, Inheritance, Abstraction

        Encapsulation is "Data hiding".
        To hide data, we make access modifier "private". (Analogy of capsule and medicine)
        After hiding data, you may need to "read" or "update" the data. For this, we
        will create some methods.
        To "read" encapsulated (hidden) data, you should create get() methods. We call it "getters".
        To "update" encapsulated (hidden) data, you should create set() methods. We call it "setters".

        // Note: By using set() method we prevent confusion and save memory by creating just 1 object.

        get() and set() methods are called "Java Beans".

        if a class is "immutable", it is impossible to change the value of the existing variable.
        if you want to make a class "immutable", do not create any "setter" method.

        setters break immutability.

         */

        // How to create getter() manually
        // 1. access modifier ... must be public
        // 2. return type ... it must match with the data type of the variable
        // 3. method name + ()... get + variable name  (naming convention using camel case rule)
        // 4. method body ... inside {} type return statement.

        // to update, we use setter ()
        // return type of setter will always be "void" because set() method will do just an action.
        // it will change the data.
        // inside the (), we use the parameter to tell Java which value we want to change.
        // we use "this" to ensure that variable from this class is used.
        // another name for default access modifier is package private.




    }
}
