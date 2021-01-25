
import overdraft.*;
import database.*;
import java.util.Scanner;

public class ATMManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean c = true;
        while (c) {
            int cardNumber = 0, pinNumber = 0;
            try {
                System.out.print("Card Number: ");
                cardNumber = sc.nextInt();
                System.out.print("Pin Number: ");
                pinNumber = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Input error (" + e.getMessage() + ")\nRestart the system");
                c = false;
                break;
            }
            DataBase db = new DataBase(cardNumber, pinNumber);

            OverdraftAccount ob1 = new OverdraftAccount(db.getCardNumber(), db.getAccName(), db.getBalance(), 2000);

            int choice = 0;
            boolean e = true;

            if (db.getBool()) {
                while (e) {

                    System.out.println("\n=========================");
                    System.out.println("1 for Deposit");
                    System.out.println("2 for Withdraw");
                    System.out.println("3 for Check Balance");
                    System.out.println("4 for Account Info");
                    System.out.println("5 for Logging out");
                    System.out.println("=========================");

                    try {
                        System.out.print("Enter Choice: ");
                        choice = sc.nextInt();
                    
                    
                    if (choice == 1) {
                        System.out.print("Enter Amount: ");
                        float amount = sc.nextFloat();
                        ob1.deposit(amount);
                    } else if (choice == 2) {
                        System.out.print("Enter Amount: ");
                        float amount = sc.nextFloat();
                        ob1.checkLimit(amount);
                    } else if (choice == 3) {
                        System.out.print("\tRemain Balance: " + ob1.getBalance());
                    } else if (choice == 4) {
                        System.out.println("");
                        System.out.println("\tAccount Name: " + db.getAccName());
                        System.out.println("\tAccount Number: " + db.getCardNumber());
                        System.out.println("\tRemain Balance: " + ob1.getBalance());
                        System.out.println("\tWithdrawn Limit: " + ob1.getOverdraftLimit());
                    } else if (choice == 5) {
                        System.out.println("\tThanks for your transaction");
                        e = false;
                        break;
                    }
                    } catch (Exception a) {
                        System.out.println("Input error (" + a.getMessage() + ")\nRestart the system");
                        e=false;
                        c=false;
                        break;
                    }

                }
            } else {
                System.out.println("\tIncorrect password");
            }
        }
    }

}
