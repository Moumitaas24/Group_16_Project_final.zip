package MD_Saif_Ahmed_Shishir;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EidUlAzhaScene {

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField employeeIdTextField;

    @FXML
    private ComboBox<String> deptComboBox;

    @FXML
    private ComboBox<String> DesigComboBox;

    @FXML
    private TextField bonusTextField;

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

    private ObservableList<Employee> EmplyList;

    public void initialize() {
        EmplyList = FXCollections.observableArrayList();

        deptComboBox.getItems().addAll("Accounts", "A", "B", "C");
        DesigComboBox.getItems().addAll("Senior Account Officer", "Junior Account Officer",
                "Senior A", "Senior B", "Senior Y", "Senior P", "Senior H", "Senior F");

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        EmployIdColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        DeeptColumn.setCellValueFactory(new PropertyValueFactory<>("dept"));
        DesigColumn.setCellValueFactory(new PropertyValueFactory<>("desig"));
        BonusColumn.setCellValueFactory(new PropertyValueFactory<>("salary"));

        TableView.setItems(EmplyList);
    }

    // Add button handler
    @FXML
    void addBonusButtonOnClick(ActionEvent event) {
        try {
            String name = nameTextField.getText();
            int id = Integer.parseInt(employeeIdTextField.getText());
            String dept = deptComboBox.getValue();
            String desig = DesigComboBox.getValue();
            int salary = Integer.parseInt(bonusTextField.getText());

            if (name.isEmpty() || dept == null || desig == null) {
                showAlert("Error", "Please fill in all fields.");
                return;
            }

            Employee emp = new Employee(name, id, dept, desig, salary);
            EmplyList.add(emp);

            clearFields();

        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Please enter valid numeric values for Id and Bonus.");
        }
    }

    //Send button handler
    @FXML
    void PreviewAndSendBonusButtonOnClick(ActionEvent event) {
        if (EmplyList.isEmpty()) {
            showAlert("Notice", "No Employee in the list to send bonus.");
        } else {
            showAlert("Bonus Sent", "Bonus has been successfully sent to all employees!");
            EmplyList.clear();
        }
    }

    //Back button handler
    @FXML
    void BackButtonOnClick(ActionEvent event) {
        // Scene switch korar code ekhane deoya jabe.
        System.out.println("Back button pressed.");
    }

    //Clear text fields
    private void clearFields() {
        nameTextField.clear();
        employeeIdTextField.clear();
        deptComboBox.setValue(null);
        DesigComboBox.setValue(null);
        bonusTextField.clear();
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
