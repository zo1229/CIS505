/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
package Module_8;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WilliamsEnhancedFutureValueApp extends Application {
    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();
    private TextArea txtResults = new TextArea();
    private Label lblFutureValueDate = new Label();
    private ComboBox<Integer> cbYears = new ComboBox<>();
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new javafx.geometry.Insets(11.5, 12.5, 13.5, 14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        // Add controls to GridPane
        gridPane.add(new Label("Monthly Payment:"), 0, 0);
        gridPane.add(txtMonthlyPayment, 1, 0);
        gridPane.add(new Label("Annual Interest Rate:"), 0, 1);
        gridPane.add(txtInterestRate, 1, 1);
        gridPane.add(new Label("Years:"), 0, 2);
        gridPane.add(cbYears, 1, 2);
        gridPane.add(new Label("Future Value:"), 0, 3);
        gridPane.add(txtResults, 1, 3);
        gridPane.add(lblFutureValueDate, 1, 4);
        GridPane.setHalignment(lblFutureValueDate, HPos.RIGHT);
        lblFutureValueDate.setStyle("-fx-font-style: italic;");

        // Add buttons to HBox
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setPadding(new javafx.geometry.Insets(15, 0, 15, 30));
        buttonBox.getChildren().addAll(btnCalculate, btnClear);

        // Set primary stage's title
        primaryStage.setTitle("Enhanced Future Value App.");

        // Add GridPane and HBox to root
        VBox root = new VBox();
        root.getChildren().addAll(gridPane, buttonBox);

        // Set scene and show stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Set event handlers
        btnClear.setOnAction(e -> clearFormFields());
        btnCalculate.setOnAction(e -> calculateResults());
    }

    private void clearFormFields() {
        txtMonthlyPayment.setText("");
        txtInterestRate.setText("");
        txtResults.setText("");
        lblFutureValueDate.setText("");
        cbYears.setValue(0);
    }

    private void calculateResults() {
        double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
        double rate = Double.parseDouble(txtInterestRate.getText());
        int years = cbYears.getValue();

        double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment, rate, years);
        txtResults.setText("The future value is " + futureValue);
        lblFutureValueDate.setText("Calculation as of " + getCurrentDate());
    }

    private String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return sdf.format(new Date());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
