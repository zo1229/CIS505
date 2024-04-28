package Module_6.ATM_Cucumber;

import io.cucumber.core.cli.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class ATM_App {

    private int accountBalance;
    private int amountWithdrawn;
    private int atmDispensedAmount;
    private StringBuilder output = new StringBuilder();

    @Given("the account balance is ${int}")
    public void setAccountBalance(int balance) {
        this.accountBalance = balance;
    }

    @When("the customer withdraws ${int}")
    public void withdrawMoney(int amount) {
        this.amountWithdrawn = amount;
        if (amount <= this.accountBalance) {
            this.accountBalance -= amount;
            this.atmDispensedAmount = amount;
            output.append("Transaction successful. Dispensed: $").append(amount).append("\n");
        } else {
            output.append("Insufficient funds. Cannot withdraw $").append(amount).append("\n");
        }
    }

    @Then("the account balance should be ${int}")
    public void verifyAccountBalance(int expectedBalance) {
        assertEquals(expectedBalance, this.accountBalance);
    }

    @Then("the ATM should dispense ${int}")
    public void verifyATMDispensedAmount(int expectedAmount) {
        assertEquals(expectedAmount, this.atmDispensedAmount);
    }

    @Then("the customer sees the message {string}")
    public void verifyOutputMessage(String expectedMessage) {
        assertEquals(expectedMessage, output.toString().trim());
    }
}

public class Main {
    public static void main(String[] args) {
        // Set the package name where your step definitions are located
        String glue = "Module_6.ATM_Cucumber";
        // Specify the path to the directory containing the feature files
        String featurePath = "src/test/resources/features";
        // Construct the arguments for running Cucumber tests
        String[] cucumberArgs = new String[] { "--glue", glue, featurePath };

        // Run Cucumber tests using the Main class from cucumber-core
        Main.run(cucumberArgs, Thread.currentThread().getContextClassLoader());
    }
}
