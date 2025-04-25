package MD_Saif_Ahmed_Shishir;

package com.example.project_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EidUlAzhaScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("EidUlAzhaScene");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void TaxReportButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TaxReport.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("TaxReport");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void LeaveApplicationButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LeaveApplicationScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("LeaveApplicationScene");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void SalaryButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EmployeeSalaryScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("EmployeeSalaryScene");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void IncomeStatementButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("YearlyBalanceSheet.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("YearlyBalanceSheet");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void BudgetButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ProjectBudgetScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("ProjectBudgetScene");

        stage.setScene(scene);
        stage.show();
    }
}
