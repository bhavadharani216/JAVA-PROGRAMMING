import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.println("Enter PIN:");
        int pin = sc.nextInt();

        if (pin == 2345) {

            System.out.println("Login Successful");
            System.out.println("Enter option (A/B/C):");

            char option = sc.next().charAt(0);

            // Withdraw
            if (option == 'A' || option == 'a') {

                System.out.println("Enter withdraw amount:");
                int amount = sc.nextInt();

                if (balance >= 5000 && amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdraw successful");
                    System.out.println("Balance: " + balance);
                } else {
                    System.out.println("Cannot withdraw");
                }
            }

            // Deposit
            else if (option == 'B' || option == 'b') {

                System.out.println("Enter deposit amount:");
                int amount = sc.nextInt();

                balance = balance + amount;
                System.out.println("Deposit successful");
                System.out.println("Balance: " + balance);
            }

            // Check balance
            else if (option == 'C' || option == 'c') {

                System.out.println("Balance: " + balance);
            }

            else {
                System.out.println("Invalid option");
            }

        } else {
            System.out.println("Wrong PIN");
        }
    }
}
