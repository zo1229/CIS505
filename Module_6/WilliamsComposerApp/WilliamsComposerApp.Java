import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class WilliamsComposerApp {
    private ComposerDao composerDao;
    private Scanner scanner;

    public WilliamsComposerApp(ComposerDao composerDao) {
        this.composerDao = composerDao;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to the Composer App");
        System.out.println("1. View Composers");
        System.out.println("2. Find Composer");
        System.out.println("3. Add Composer");
        System.out.println("4. Exit");
        System.out.print("Please choose an option: ");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                // Display list of composers
                break;
            case 2:
                // Find and display composer by ID
                break;
            case 3:
                // Add a new composer
                break;
            case 4:
                System.out.println("Exiting Composer App. Goodbye!");
                break;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }
}
