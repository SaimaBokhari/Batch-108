package day24interfaces;

/*                            Method usage in interfaces

   1. An interface cannot have "concrete methods" (can have abstract one)

   2. All methods in an interface are "public" and "abstract" as default.
       even if you don't declare "public" and "abstract", methods will be public and abstract in interfaces.
       "public abstract void digital();"  and   "void digital();"  are same.

       Java removed body from methods in interfaces to avoid confusion. In interface, child can have
       many parents, if parents have bodies, everyone will be implementing their msg and child will be confused.
       To avoid that, methods in interfaces don't have bodies. (opposite to methods in classes)

   3.  If "parent interfaces" have methods with the same name, overriding just one of them will be enough.

   4. "parent interfaces" cannot have methods with the same name and the different return types.
       If you do that, Java will give you compile time error


                         Variables in interfaces

   1. Variables in an interface are "public", "static" and "final". ("final" so you have to initialise)
      "public static final int price = 2300;"   is same as "int price = 2300;" syntax in interface

   2. Variables in interfaces are "static" by default, therefore no need to create object to
      access.

   3. Whenever you need to call any variable, use interface name to call.


Note:     "Class" parent of another "Class" ==> extends
           "Interface" parent of another "Interface" ==> extends

           "Interface" parent of "Class" ==> implements
           "Class" parent of "Interface" ==> impossible. ==> An "Interface" can have "just" Interface as parent

 */

import java.util.Random;

public interface Ac extends BigAc{
    public void digital();

    void price();

    // int make();

    // public static final int price = 2300;  0R

    int price = 2300;

    String name = "Perfect AC";

    //If you insist on creating "concrete method" in an interface you have 2 options
    //i)Use "default" keyword      ii)Use "static" keyword


    //i)Use "default" keyword
    public default int calculate(){     // concrete method... you have to create object to call this method
        return 1200;
    }

    //ii)Use "static" keyword
    public static boolean climate() {    // concrete method ... you don't need to create new object because this is static
        return true;                     // it will be attached to Ac interface like moon
    }



}
