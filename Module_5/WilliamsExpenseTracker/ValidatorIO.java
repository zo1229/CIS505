/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
package Module_5.WilliamsExpenseTracker;

import java.util.Scanner;

public class ValidatorIO {
    public static int getInt(Scanner sc, String prompt) {
        int input = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value.");
                sc.next(); // clear invalid input
            }
        }
        return input;
    }

    public static double getDouble(Scanner sc, String prompt) {
        double input = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid double value.");
                sc.next(); // clear invalid input
            }
        }
        return input;
    }

    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.next();
    }
}
