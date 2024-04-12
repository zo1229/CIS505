/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
package Module_3.Customer;

import java.util.Scanner;

public class TestCustomerAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a customer number between 1007 and 1009:");
        int customerId = scanner.nextInt();
        Customer customer = CustomerDB.getCustomer(customerId);

        System.out.println(customer);

        Account account = new Account();

        int choice;
        do {
            account.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmt = scanner.nextDouble();
                    account.deposit(depositAmt);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmt = scanner.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;
                case 3:
                    System.out.println("Exiting menu.");
                    break;
                default:
                    System.out.println("Error: Invalid Option.");
                    break;
            }
        } while (choice != 3);

        System.out.printf("Account Balance: $%,6.2f", account.getBalance());

        scanner.close();
    }
}
