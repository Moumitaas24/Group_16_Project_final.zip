package com.example.simulatingoperationsofalargescalemangogardenestate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class EstateManagerAssignTaskToWorkers {

    private static final String FILE_PATH = "C:\\Users\\Public\\Documents\\Tasks.txt";

    @FXML
    private TextField task2fxid;
    @FXML
    private TextField task1fxid;

    @FXML
    public void initialize() {
    }

    @FXML
    public void saveButtonOnMouseClick(ActionEvent actionEvent) {
        String task1 = task1fxid.getText();
        String task2 = task2fxid.getText();

        String output = "Task 1: " + task1 + System.lineSeparator() +
                "Task 2: " + task2;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(output);
            writer.newLine();
            writer.write("------------");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("EstateManager.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Estate Manager");
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}