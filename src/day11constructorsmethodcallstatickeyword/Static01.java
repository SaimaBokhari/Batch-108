package day11constructorsmethodcallstatickeyword;

public class Static01 {

    /*
    1. "static" class members (variables and methods) are common for all objects created from the class (LIKE MOON example).
    2. When you do any update on any "static" class members (variables, methods), all objects will see the updates on it.
    3. If you want every object informed about every update on a class member, make it static.
    4. Static variables can be named as class variables as well  because they're attached to the class
       like moon is attached to the earth.
    5. Note: if a variable is not static, we don't attach it to the class. We attach it to the object.
       We can name them Object variables or Instance Variables. (like eyes, every human has his own eyes attached to
       to him (the object) and any update on his eyes doesn't affect other humans ).

     */


    // How to create "static" variable?

    // int counter = 0;   ..... > regular variable

    // To make a variable "static", put "static" keyword between access modifier (public)
    // and data type (int). like below

    public static int staticCounter = 0;

    public int nonStaticCounter = 0;

    // This is a constructor.

    public Static01(){
        staticCounter++;
        nonStaticCounter++;
    }




}
