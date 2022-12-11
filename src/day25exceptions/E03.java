package day25exceptions;

public class E03 {
    public static void main(String[] args) {

        getNumOfChars("Tom Hanks"); // nothing prints
        int r1 = getNumOfChars("Tom Hanks");
        System.out.println(r1);  // 9

        int r2 = getNumOfChars("");
        System.out.println(r2);  // 0

        int r3 = getNumOfChars(null);   // NullPointerException: if you use length() method with "null", you'll get exception.
    }

    // Create a method to find the number of character in a String

    public static int getNumOfChars(String str){

        int numOfChar = 0;
        try{
            numOfChar= str.length();
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        return numOfChar;
    }

}
