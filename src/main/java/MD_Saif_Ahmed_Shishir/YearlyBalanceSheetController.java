package MD_Saif_Ahmed_Shishir;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class YearlyBalanceSheetController {

    @FXML
    private TextField TotalSalaryTextField;

    @FXML
    private TextField totalSalaryTextField;

    @FXML
    private TextField TransCostTextField;

    @FXML
    private ComboBox<String> monthComboBox;

    @FXML
    private TableView<YearBalanceSheet> tableView;

    @FXML
    private TableColumn<YearBalanceSheet, String> monthsColumn;

    @FXML
    private TableColumn<YearBalanceSheet, String> employeeSalaryColumn;

    @FXML
    private TableColumn<YearBalanceSheet, String> ElecricitybillColumn;

    @FXML
    private TableColumn<YearBalanceSheet, String> transportcostColumn;

    private ObservableList<YearBalanceSheet> reportList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {

        monthComboBox.setItems(FXCollections.observableArrayList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        ));

        monthsColumn.setCellValueFactory(cellData -> cellData.getValue().monthProperty());
        employeeSalaryColumn.setCellValueFactory(cellData -> cellData.getValue().employeeSalaryProperty());
        ElecricitybillColumn.setCellValueFactory(cellData -> cellData.getValue().electricityBillProperty());
        transportcostColumn.setCellValueFactory(cellData -> cellData.getValue().transportCostProperty());

        tableView.setItems(reportList);
    }

    @FXML
    private void handlePreviewReport() {
        String month = monthComboBox.getValue();
        String salary = TotalSalaryTextField.getText();
        String electricBill = totalSalaryTextField.getText();
        String transportCost = TransCostTextField.getText();

        if (month == null || salary.isEmpty() || electricBill.isEmpty() || transportCost.isEmpty()) {
            showAlert(" fill all fields.");
            return;
        }

        YearBalanceSheet report = new YearBalanceSheet(month, salary, electricBill, transportCost);
        reportList.add(report);
        clearFields();
    }

    @FXML
    private void handleDeleteReport() {
        YearBalanceSheet selectedReport = tableView.getSelectionModel().getSelectedItem();
        if (selectedReport != null) {
            reportList.remove(selectedReport);
        } else {
            showAlert("select a report to delete.");
        }
    }

    // Back button click
    @FXML
    private void handleBack() {
        showAlert(" back to previous scene.");
    }

    private void clearFields() {
        monthComboBox.getSelectionModel().clearSelection();
        TotalSalaryTextField.clear();
        totalSalaryTextField.clear();
        TransCostTextField.clear();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
