package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account{

    Scanner input = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<>();
// We create hashmap here to serve the purpose of a small database to store user's details
    boolean flag = true;

    public void login(){
        System.out.println("Welcome to TechPro ATM");

        int counter = 0;

        do{
            data.put(12345, 1234);  // these are data records as examples of our current project because this is not real database
            data.put(23456, 2345);
            data.put(34567, 3456);
            data.put(45678, 4567);

            try{
                System.out.println("Enter the account number");
                setAccountNumber(input.nextInt());

                System.out.println("Enter the pin number");
                setPinNumber(input.nextInt());

            }catch (Exception e){
                System.out.println("Invalid character(s).");
                System.out.println("Please select an integer or press Q to exit the system");

                String exit = input.nextLine();
                if(exit.equalsIgnoreCase("q")){
                    flag=false;
                    break;
                }

            }

            int count = 0;

            for(Map.Entry<Integer, Integer> w: data.entrySet()){
                if(w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber())){
                    getAccountTypes();
                }else{
                    count++;
                }
            }

            if (count == data.size()){     // data.size in this project is 4
                counter++;
                System.out.println("Account number or pin number in invalid.");
                System.out.println("Please enter a valid number or press Q to exit.");

                String exit = input.next();
                if(exit.equalsIgnoreCase("q")){
                    flag = false;
                }

            }
            if(counter == 3){
                System.out.println("Your account has been blocked!");
                flag = false;
            }


        }while(flag);

    }   // do while ends here

    public void optionsDisplay(){ // to avoid duplication
        System.out.println("Select from the following options:");
        System.out.println("1: View Balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");

    }


    // operations for checking account

    public void checkingOperations(){

        do{
            optionsDisplay();   // call this method every time we need to give message to the user

            int option = input.nextInt();
            if(option == 4){
                break;
            }
            switch(option){
                case 1:
                    System.out.println("Your balance is:" +  moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("Invalid option. Please select 1, 2, 3 or 4.");
            }

        }while(true); // it will become an infinite loop if we don't use the keyword "break"

        getAccountTypes();  // to do more operations while we stay in the account
    }

    // operations for saving account

    public void savingOperations(){
        do{
            optionsDisplay();
             int option = input.nextInt();

             if(option == 4){
                 break;
             }

             switch (option){
                 case 1:
                     System.out.println("Your balance is:" + moneyFormat.format(getSavingBalance()));
                     break;
                 case 2:
                     getSavingWithdraw();
                     break;
                 case 3:
                     getSavingDeposit();
                     break;
                 default:
                     System.out.println("Invalid option. Please select 1, 2, 3 or 4.");
             }
        }while(true);

        getAccountTypes();  // to do more operations while we stay in the account
    }

    public void getAccountTypes(){
        System.out.println("Select the account you'd like to access");
        System.out.println("1. Checking Account");
        System.out.println("2. Saving account");
        System.out.println("3. Exit");

        int option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("You are in your checking account. ");
                checkingOperations();
                break;
            case 2:
                System.out.println("You are in your saving account.");
                savingOperations();
                break;
            case 3:
                System.out.println("Thank you for choosing the ATM. See you later!");
                flag = false;
                break;
            default:
                System.out.println("Invalid option. Please select 1, 2 or 3");
        }





    }
}
