package com.example.simulatingoperationsofalargescalemangogardenestate;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.time.LocalDate;

public class EstateManagerLeaveRequest {

    @javafx.fxml.FXML
    private DatePicker endDatefxid;

    @javafx.fxml.FXML
    private DatePicker startDatefxid;

    @javafx.fxml.FXML
    public void initialize() {
        startDatefxid.setDayCellFactory(picker -> new javafx.scene.control.DateCell() {
            @Override
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                if (endDatefxid.getValue() != null) {
                    setDisable(empty || date.isAfter(endDatefxid.getValue()));
                }
            }
        });

        endDatefxid.setDayCellFactory(picker -> new javafx.scene.control.DateCell() {
            @Override
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                if (startDatefxid.getValue() != null) {
                    setDisable(empty || date.isBefore(startDatefxid.getValue()));
                }
            }
        });
    }

    @javafx.fxml.FXML
    public void backOnMouseClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EstateManager.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("EstateManager");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void saveOnMouseClick(ActionEvent actionEvent) {
        LocalDate startDate = startDatefxid.getValue();
        LocalDate endDate = endDatefxid.getValue();

        if (startDate == null || endDate == null) {
            showAlert("Missing Dates", "Please select both start date and end date.");
            return;
        }

        if (startDate.isAfter(endDate)) {
            showAlert("Invalid Date Range", "Start date cannot be after end date.");
            return;
        }

        System.out.println("Leave Request Submitted: " + startDate + " to " + endDate);
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
