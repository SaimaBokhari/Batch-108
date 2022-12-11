package day20accessmodifiersinheritance;

public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202217007";  // 17 subject code, 007 registration number

    double stdGpa = 3.83;  // if you don't type any access modifier, it will be default.
    // if you want to make access modifier default, don't type anything.

    protected String stdAddress = "Miami, FL, USA";


    // How to access data from inside the class?
    // add "static" keyword.
    public static String name = "Tom Hanks";
    private static String id = "TH202217007";  // 17 subject code, 007 registration number

    static double gpa = 3.83;  // if you don't type any access modifier, it will be default.
    // if you want to make access modifier default, don't type anything.

    protected static String address = "Miami, FL, USA";



    /* Notes:
    1. class can NOT be "private" or "protected".
    2. default access modifier is called "package private", it is impossible
        to use it outside the package in which it is created.
    3. protected can be used inside the same package and from the child classes in other
       packages.
    4. public is accessible from across the packages in entire project. There is no restriction.
    5. private one can be used just inside the class in which it was created.
    6. to access static things do not use object, use class.

     */


    /*
    Famous interview questions?

    1. What's the difference between default and protected access modifiers?
     a) "Protected" access modifier is wider than the "default" access modifier.
     b) "default" ones cannot be used from outside the package, therefore called "package private".
        "protected" ones can be used from the classes in other packages if the classes are child classes.

    2. Could you please tell the name of access modifiers from the narrowest to the widest?
       private< default< protected < public

    3. Could you please explain all access modifiers?
        .....

     */





}
