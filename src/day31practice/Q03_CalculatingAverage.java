package day31practice;

public class Q03_CalculatingAverage {
    // Create a method that calculates 4 students 6,4,3 and 5 exams average respectively.

    public static void main(String[] args) {
        calculateAverage("Tom Hanks", 55,69,45,90,100); // Tom Hanks's average of exams: 71.80
        calculateAverage("John Aga", 45,34,56,70);      // John Aga's average of exams: 51.25
        calculateAverage("Cuneyt Arkin", 99,100,87);    // Cuneyt Arkin's average of exams: 95.33

    }
 public static void calculateAverage(String stdName, double... marks){

     double sum = 0;

     for(double w: marks){
      sum += w;   // this will increase the value of the sum with "w"
     }
       System.out.println(stdName+ "'s average of exams: " + String.format("%.2f", sum/marks.length));
     // %.2f sign is used when we want to print only 2 digits after the decimal

   }

}
