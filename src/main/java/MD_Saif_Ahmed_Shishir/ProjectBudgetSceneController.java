package MD_Saif_Ahmed_Shishir;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ProjectBudgetSceneController {

    @FXML
    private TextField PerformerCostTextField;

    @FXML
    private TextField ConstructionLaborCostTextField;

    @FXML
    private TextField EquipmentRentalCostTextField;

    @FXML
    private TextField SoundSystemCostTextField;

    @FXML
    private TextField LocationRentTextField;

    @FXML
    private TextField OtherexpensesTextField;

    @FXML
    private TextField ViewBudgetTextField;

    // Back button action
    @FXML
    void BackButtonOnClick(ActionEvent event) throws IOException {
        System.out.println("Back button clicked.");
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("AccountOfficer.fxml"));
        Scene scene3 = new Scene(scene2);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    void SendButtonOnClick(ActionEvent event) {
        System.out.println("Send button clicked.");
        String performerCost = PerformerCostTextField.getText();
        String constructionCost = ConstructionLaborCostTextField.getText();
        String equipmentCost = EquipmentRentalCostTextField.getText();
        String soundSystemCost = SoundSystemCostTextField.getText();
        String locationRent = LocationRentTextField.getText();
        String otherExpenses = OtherexpensesTextField.getText();


        System.out.println("Performer Cost: " + performerCost);
        System.out.println("Construction Cost: " + constructionCost);
        System.out.println("Equipment Rental: " + equipmentCost);
        System.out.println("Sound System: " + soundSystemCost);
        System.out.println("Location Rent: " + locationRent);
        System.out.println("Other Expenses: " + otherExpenses);
    }

    @FXML
    void PreviewbudgetButtonOnClick(ActionEvent event) {
        double performerCost = parseDouble(PerformerCostTextField.getText());
        double constructionCost = parseDouble(ConstructionLaborCostTextField.getText());
        double equipmentCost = parseDouble(EquipmentRentalCostTextField.getText());
        double soundSystemCost = parseDouble(SoundSystemCostTextField.getText());
        double locationRent = parseDouble(LocationRentTextField.getText());
        double otherExpenses = parseDouble(OtherexpensesTextField.getText());

        double totalBudget = performerCost + constructionCost + equipmentCost + soundSystemCost + locationRent + otherExpenses;

        String budgetDetails = "Performer Cost: " + performerCost + "\n" +
                "Construction Labor Cost: " + constructionCost + "\n" +
                "Equipment Rental: " + equipmentCost + "\n" +
                "Sound System Cost: " + soundSystemCost + "\n" +
                "Location Rent: " + locationRent + "\n" +
                "Other Expenses: " + otherExpenses + "\n\n" +
                "Total Budget: " + totalBudget;

        ViewBudgetTextField.setText(budgetDetails);
    }

    private double parseDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
