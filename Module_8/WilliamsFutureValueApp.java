/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
package Module_7.FutureValueApp;

public class WilliamsFutureValueApp extends Application {

    private TextField txtInvestmentAmount = new TextField();
    private TextField txtYears = new TextField();
    private TextArea taResult = new TextArea();
    private Label lblInvestmentAmount = new Label("Investment Amount:");
    private Label lblYears = new Label("Years:");
    private Label lblFutureValue = new Label("Future Value:");
    private Label lblInterestRate = new Label("Annual Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 0.05 for 5%");
    private ComboBox<Integer> cmbInterestRate = new ComboBox<>();
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
        gridPane.add(lblInvestmentAmount, 0, 0);
        gridPane.add(txtInvestmentAmount, 1, 0);
        gridPane.add(lblYears, 0, 1);
        gridPane.add(txtYears, 1, 1);
        gridPane.add(lblInterestRate, 0, 2);
        gridPane.add(cmbInterestRate, 1, 2);
        gridPane.add(lblInterestRateFormat, 1, 3);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);
        lblInterestRateFormat.setStyle("-fx-text-fill: red;");
        gridPane.add(lblFutureValue, 0, 4);
        gridPane.add(taResult, 1, 4);

        // Add buttons to HBox
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setPadding(new javafx.geometry.Insets(15, 0, 15, 30));
        buttonBox.getChildren().addAll(btnCalculate, btnClear);

        // Set primary stage's title
        primaryStage.setTitle("Williams Future Value App.");

        // Add GridPane and HBox to root
        javafx.scene.layout.VBox root = new javafx.scene.layout.VBox();
        root.getChildren().addAll(gridPane, buttonBox);

        // Set scene and show stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
