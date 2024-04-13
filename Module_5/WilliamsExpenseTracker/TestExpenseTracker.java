/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
package Module_5.WilliamsExpenseTracker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;
        while (continueProgram) {
            displayMenu();
            int choice = ValidatorIO.getInt(scanner, "Enter your choice: ");

            switch (choice) {
                case 1:
                    displayAllTransactions();
                    break;
                case 2:
                    addTransaction(scanner);
                    break;
                case 3:
                    displayTotalExpenses();
                    break;
                case 4:
                    continueProgram = false;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("1. Display all transactions");
        System.out.println("2. Add a new transaction");
        System.out.println("3. Display total expenses");
        System.out.println("4. Exit");
    }

    private static void displayAllTransactions() {
        try {
            ArrayList<Transaction> transactions = TransactionIO.findAll();
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        } catch (IOException e) {
            System.out.println("Error reading transactions: " + e.getMessage());
        }
    }

    private static void addTransaction(Scanner scanner) {
        ArrayList<Transaction> transactions = new ArrayList<>();
        boolean addAnother = true;
        while (addAnother) {
            String date = ValidatorIO.getString(scanner, "Enter transaction date (MM-dd-yyyy): ");
            String description = ValidatorIO.getString(scanner, "Enter transaction description: ");
            double amount = ValidatorIO.getDouble(scanner, "Enter transaction amount: ");
            transactions.add(new Transaction(date, description, amount));

            char choice = ValidatorIO.getString(scanner, "Add another transaction? (y/n): ").charAt(0);
            if (choice != 'y') {
                addAnother = false;
            }
        }

        try {
            TransactionIO.bulkInsert(transactions);
            System.out.println("Transactions added successfully.");
        } catch (IOException e) {
            System.out.println("Error adding transactions: " + e.getMessage());
        }
    }

    private static void displayTotalExpenses() {
        try {
            ArrayList<Transaction> transactions = TransactionIO.findAll();
            double total = 0;
            for (Transaction transaction : transactions) {
                total += transaction.getAmount();
            }
            System.out.printf("Total expenses: $%.2f%n", total);
        } catch (IOException e) {
            System.out.println("Error reading transactions: " + e.getMessage());
        }
    }
}
