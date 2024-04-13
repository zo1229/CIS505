/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
package Module_5.WilliamsExpenseTracker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private String date;
    private String description;
    private double amount;

    public Transaction() {
        this.date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        this.description = "";
        this.amount = 0;
    }

    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    // Accessor and mutator methods
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Date: " + date + "\nDescription: " + description + "\nAmount: $" + amount;
    }
}
