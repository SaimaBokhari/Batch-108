package day32lambdacourse;

public class UtilsClass {
    /*
    - Java works with atomic structure
    -
    We can call this class as "Reusable class" or "Useful Method Storage class"

     */
    public static void printWithSpace(Object str){  // we use Object as data type so all data types can use this method
        System.out.print(str + " ");
    }


    public static boolean checkEvenElements(int x){
        return x%2==0;
    }

    public static boolean checkOddElements (int x){
        return x%2 !=0;
    }

//    public static int getSquare(int x){
//        return x*x;
//    }
    public static int getSquare(int a){
        return (int) Math.pow(a,2);
    }

    public static int getCube(int x){
        return x*x*x;
    }

    public static double getHalf(int x){
        return x/2.0;
    }

    public static char getLastChar(String str){
        return str.charAt((str.length()-1));
    }

    public static int getSumOfDigits(int x){
        int sum =0;
        while(x>0){
             sum = sum + x%10;
             x = x/10;
        }
        return sum;
    }









}
