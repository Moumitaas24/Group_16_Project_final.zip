package com.example.simulatingoperationsofalargescalemangogardenestate;

import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardInventoryManager
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void trackStaffHoursOnMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void trackOrderOnMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void trackStockOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Task1.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Track Stock");
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void assignDeliveryTrucksOnMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deliveryReportsOnMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void trackOutgoingShipmentsOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Task3.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Track Outgoing Shipments");
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void dailyStockUpdateOnMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void trackEquipmentOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Task2.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Track Stock");
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}