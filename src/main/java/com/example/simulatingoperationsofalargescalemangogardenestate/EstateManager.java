package com.example.simulatingoperationsofalargescalemangogardenestate;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EstateManager
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void storageOnMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fertilizersOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("EstateManagerFertilisers.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Fertilisers");
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void leaveRequestOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("EstateManager-LeaveRequest.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("LeaveRequest");
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void assignTaskOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("EstateManagerAssignTaskToWorkers.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("AssignTaskToWorkers");
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}