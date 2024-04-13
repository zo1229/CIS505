/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
package Module_5.WilliamsExpenseTracker;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {
    private static final String FILE_NAME = "expenses.txt";

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                output = new PrintWriter(file);
            } else {
                output = new PrintWriter(FILE_NAME);
            }
            for (Transaction transaction : transactions) {
                output.print(transaction.getDate() + ",");
                output.print(transaction.getDescription() + ",");
                output.println(transaction.getAmount());
            }
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> transactions = new ArrayList<>();
        File file = new File(FILE_NAME);
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String[] parts = input.nextLine().split(",");
            String date = parts[0];
            String description = parts[1];
            double amount = Double.parseDouble(parts[2]);
            Transaction transaction = new Transaction(date, description, amount);
            transactions.add(transaction);
        }
        input.close();
        return transactions;
    }
}
