package MD_Saif_Ahmed_Shishir;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class TaxReportScene {

    @FXML
    private TextField TaxTextField;

    @FXML
    private void BackButtonOnClick() {
        showAlert("Back", "Going back to the previous scene.");
    }

    @FXML
    private void TaxReportButtonOnClick() {

        String report = "Tax Report Generated Successfully!\n\n"
                + "Total Tax Paid: \n"
                + "Income Tax: \n"
                + "Corporate Tax: \n"
                + "Generated on: " + java.time.LocalDate.now();

        TaxTextField.setText(report);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
