package MD_Saif_Ahmed_Shishir;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class EmployeeSalaryScene {

    @FXML
    private TextField EmployeeNameTextField, EmployeeIdTextField, SalaryTextField;

    @FXML
    private ComboBox<String> DeptTextField, DesigTextField;

    @FXML
    private TableView<Employee> TableView;

    @FXML
    private TableColumn<Employee, String> nameColumn;

    @FXML
    private TableColumn<Employee, Integer> EmployIdColumn;

    @FXML
    private TableColumn<Employee, String> DeeptColumn;

    @FXML
    private TableColumn<Employee, String> DesigColumn;

    @FXML
    private TableColumn<Employee, Integer> BonusColumn;

    private ObservableList<Employee> employeeList;

    @FXML
    public void initialize() {
        employeeList = FXCollections.observableArrayList();

        DeptTextField.getItems().addAll("Accounts", "Finance", "HR", "IT");
        DesigTextField.getItems().addAll("Manager", "Officer", "Executive", "Assistant");
        nameColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("name"));
        EmployIdColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("id"));
        DeeptColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("dept"));
        DesigColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("desig"));
        BonusColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("salary"));

        TableView.setItems(employeeList);
    }

    @FXML
    private void AddEmployeeSalaryButtonOnClick() {
        try {
            String name = EmployeeNameTextField.getText();
            int id = Integer.parseInt(EmployeeIdTextField.getText());
            String dept = DeptTextField.getValue();
            String desig = DesigTextField.getValue();
            int salary = Integer.parseInt(SalaryTextField.getText());

            Employee employee = new Employee(name, id, dept, desig, salary);
            employeeList.add(employee);

            // Clear form
            EmployeeNameTextField.clear();
            EmployeeIdTextField.clear();
            SalaryTextField.clear();
            DeptTextField.getSelectionModel().clearSelection();
            DesigTextField.getSelectionModel().clearSelection();

        } catch (Exception e) {
            showAlert("Invalid Input", "Please enter valid data.");
        }
    }

    @FXML
    private void SendEmployeeSalaryButtonOnClick() {
        showAlert("Salary Sent", "Salary information sent to all employees.");
    }

    @FXML
    private void BackButtonOnClick() {
        showAlert("Back", "Going back to previous scene.");
    }

    @FXML
    private void PreviewButtonOnClick() {
        showAlert("Preview", "Previewing employee salary list.");
    }

    @FXML
    private void DeleteButtonOnClick() {
        Employee selectedEmployee = TableView.getSelectionModel().getSelectedItem();
        if (selectedEmployee != null) {
            employeeList.remove(selectedEmployee);
        } else {
            showAlert("No Selection", "Please select an employee to delete.");
        }
    }

    @FXML
    private void EditButtonOnClick() {
        showAlert("Edit", "Edit functionality not implemented.");
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
