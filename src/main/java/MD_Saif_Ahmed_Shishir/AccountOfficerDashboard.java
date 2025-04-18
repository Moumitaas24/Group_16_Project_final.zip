package MD_Saif_Ahmed_Shishir;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AccountOfficerDashboard
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BonusButton(ActionEvent actionEvent) throws IOException {
            Parent scene2;
            scene2 = FXMLLoader.load(getClass().getResource("EidUlAzhaScene.fxml"));
            Scene scene3 = new Scene(scene2);
            Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(scene3);
            window.show();
    }

    @FXML
    public void TaxReportButton(ActionEvent actionEvent) throws IOException {
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("TaxReportScene.fxml"));
        Scene scene3 = new Scene(scene2);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    public void LeaveApplicationButton(ActionEvent actionEvent) throws IOException {
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("/MD_Saif_Ahmed_Shishir/LeaveApplicationScene.fxml"));
        Scene scene3 = new Scene(scene2);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    public void SalaryButton(ActionEvent actionEvent) throws IOException {
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("EmployeeSalaryScene.fxml"));
        Scene scene3 = new Scene(scene2);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    public void IncomeStatementButton(ActionEvent actionEvent) throws IOException {
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("YearlyBalanceSheet.fxml"));
        Scene scene3 = new Scene(scene2);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    public void BudgetButton(ActionEvent actionEvent) throws IOException {
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("ProjectBudgetScene.fxml"));
        Scene scene3 = new Scene(scene2);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }
}
