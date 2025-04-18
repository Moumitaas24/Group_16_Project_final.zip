package MD_Saif_Ahmed_Shishir;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

public class LeaveApplicationScene {

    @FXML
    private TextField employeeNameTextField, shortdescripTextField;

    @FXML
    private ComboBox<String> desgiComboBox;

    @FXML
    private DatePicker startdaypick, enddaypick;

    @FXML
    public void initialize() {
        desgiComboBox.getItems().addAll("Manager", "Officer", "Executive", "Assistant");
    }

    @FXML
    private void backButtonOnClick() {
        showAlert("Back", "Going back to previous scene.");
    }

    @FXML
    private void sendButtonOnClickBinary() {
        String name = employeeNameTextField.getText();
        String designation = desgiComboBox.getValue();
        String startDate = (startdaypick.getValue() != null) ? startdaypick.getValue().toString() : "";
        String endDate = (enddaypick.getValue() != null) ? enddaypick.getValue().toString() : "";
        String description = shortdescripTextField.getText();

        if (name.isEmpty() || designation == null || startDate.isEmpty() || endDate.isEmpty() || description.isEmpty()) {
            showAlert("Invalid Input", "Please fill all fields.");
            return;
        }

        String msg = "Leave Application Sent!\n\n"
                + "Name: " + name + "\n"
                + "Designation: " + designation + "\n"
                + "Start: " + startDate + "\n"
                + "End: " + endDate + "\n"
                + "Description: " + description;

        showAlert("Success", msg);


        employeeNameTextField.clear();
        desgiComboBox.getSelectionModel().clearSelection();
        startdaypick.setValue(null);
        enddaypick.setValue(null);
        shortdescripTextField.clear();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
