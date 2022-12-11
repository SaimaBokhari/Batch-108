package day11constructorsmethodcallstatickeyword;

public class Runner {
   public static void main(String[] args) {

            // Scanner input = new Scanner(System.in); We use this to create scanner object.
           // Using this model, we'll create new object with constructor Car() for Car class.

            //Create an object from "CarConstructor" class
            CarConstructor audi = new CarConstructor();              // This syntax is similar to Scanner class syntax that we have been using so far.
            System.out.println(audi.make);   //Toyota
            System.out.println(audi.model);  //Prius

            CarConstructor bmw = new CarConstructor("BMW", "M5", 2022, 50000);
            System.out.println(bmw.make);  //BMW
            System.out.println(bmw.model); //M5

            CarConstructor mercedes = new CarConstructor("Mercedes", "C300", 2023, 60500);
            System.out.println(mercedes.make);  //Mercedes
            System.out.println(mercedes.model);  //C300

            CarConstructor itCar = new CarConstructor("Rolls Royce", "Cullinan", 2023);
            System.out.println(itCar.make);
            System.out.println(itCar.model);
            System.out.println(itCar.year);


            Static01 obj1 = new Static01();
            Static01 obj2 = new Static01();
            Static01 obj3 = new Static01();
            System.out.println(obj3.nonStaticCounter);  // 1
            System.out.println(obj3.staticCounter);    // 3









        }

    }
