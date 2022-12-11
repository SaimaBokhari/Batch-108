package day04nestedif;

public class IfStatement01 {
    public static void main(String[] args) {

        /*Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = input.nextByte();
        if(age<0){
            System.out.println("Invalid age");
        }else if(age<5){ //(age<=4 is the same as age<5 but this one works faster)
            System.out.println("Baby");
        }else if(age<13){
            System.out.println("Child");
        }else if(age<21){
            System.out.println("Teenager");
        }else if(age<31){
            System.out.println("Adult");
        }else{
            System.out.println("Not expected age");
        }

        /* Critical values and Boundary Values Analysis (BVA) should be
        tested before passing the code as ok.
        Order of the conditions is very important in If Statements.
        You can go either from left or right depending on the requirements.

         */


    }
}
