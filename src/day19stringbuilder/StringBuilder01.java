package day19stringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {

        /* What is "StringBuilder class"?
        "StringBuilder class" is for creating "Mutable Strings".

        We use "String Class" to create a String anyway. Why and when we will
        need "StringBuilder class"?

        String class is "immutable" whereas "StringBuilder class" is "mutable".

         */

        //"immutable" means existing value doesn't change. It creates new container for the new value and
        // changes its address pointer to the new container.

        /*
//String Class is "immutable" because of that it does not change existing value.
//If you want to assign a new value to a variable, Java will create a new container inside the "String Pool"
//then will put new value in it, then changes the address pointer to the new container.
 */

        String name = "Tom";

// Java creates a name container in Heap memory and puts its reference/address in the stack memory.
        name = "Mark";

/* When we want to assign another name to the same container, Java creates another container inside
 the String pool, puts "Mark" in that pool (doesn't delete the previous value).
  Then assigns the same address to the new container. This is called "immutable".

The first value doesn't have any address anymore.
Java has a garbage collector system. If the container doesn't have any address pointer,
Java throws it in the garbage and cleans the memory.

Before removing things from memory, Java finalises them first (like we put all rubbish in one
container and then throw all of them together, we don't throw each item separately).

Java doesn't remove anything from memory without finalising it. This is an automatic function, we can't affect it.

 */


        /*
        Benefits of immutability:
        1) uses less memory
        2) increases security
         */

        // Scenario:
        String s = "John";
        String r = "John";
        r = "Sam";

       /* If the value of two different containers is same, Java is smart, it doesn't create separate containers;
       it puts the two values in the same container, but creates separates address pointers in the stack memory.
       So we can still access both.
       Because of immutability, if we use change() and replace John with Carl, Java creates a separate container
       with new value "Carl" and assigns the address pointer of one of the previous "John" to new value.

       Now if we have to update something lets say deposit money to John through deposit(), this will create another
       address pointer to John and money will be deposited to John and not Carl(that was previously in the same container)
       Previous container will not be deleted because it still has got a address pointer from deposit().
        */

        // If you want a separate container in any case (with the same value as John), you have to insist on it.
        String u = new String ("John");

        // You need to insist for it by using new part (new String ("John").

        /*
        If you want to change the value directly, without creating new container in
        memory, you can use "StringBuilder Class". (opposite of immutable)
         */

        // StringBuilder sb1 = new StringBuilder("Clara");
        // sb1 = "Jim";
        // left is StringBuilder; right is string ... so it will show error cos of different data types.

//        sb1 = new StringBuilder("Jim");
//        System.out.println(sb1);

        // StringBuilder class will change the value directly without creating a separate container.


        /*
        How to create a StringBuilder Object?

        First way:
         StringBuilder sb1 = new StringBuilder("Clara");

         Second way:
          StringBuilder sb2  = new StringBuilder();    empty , without any value
        and then add values
         */

        StringBuilder sb1 = new StringBuilder("Mary");
        System.out.println(sb1);
        sb1.append("Karl");
        System.out.println(sb1);


        StringBuilder sb2  = new StringBuilder();
        System.out.println(sb2);   // empty

        sb2.append("Clara ");
        System.out.println(sb2);

        sb2.append("Ocean ");
        System.out.println(sb2);

        sb2.append("Miami ").append("FL ").append("USA ");
        System.out.println(sb2);

        // add space after every word if you want to separate them.
        // StringBuilder is class as well as data type.

        // How to learn the capacity in a StringBuilder?

        StringBuilder sb3 = new StringBuilder();
        // when you type empty StringBuilder, Java gives you 16 empty boxes.

        sb3.append("Jackson");
        sb3.append("Mexico");
        sb3.append("The USA");
        sb3.append("....................");

        int numOfChars = sb3.length();
        System.out.println(numOfChars);

        int cap = sb3.capacity();
        System.out.println(cap);

        // Every time if you exceed the capacity, Java increases 2 times of existing capacity plus 2.
        // 16 * 16 + 2 = 34 boxes









    }
}
