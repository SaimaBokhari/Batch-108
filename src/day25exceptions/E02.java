package day25exceptions;

public class E02 {
    public static void main(String[] args) {
        String a[] = {"A","B","C","Z"};
        String result1 = getElement(a,5);
        System.out.println(result1);
    }

    // Create a method to get any element from a String Array

    public static String getElement(String a[], int idx){

        String s ="";
        try{
            s = a[idx];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("A problem occurred in array indexes"); // we can give our own message  OR
            System.out.println(e.getMessage());  // message from Java which gives technical msg about the Exception.

            e.printStackTrace();    // error message from Java.. gives technical msg about the Exception in detail
        }
        return s;
    }


}
