package com.example.simulatingoperationsofalargescalemangogardenestate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Task4
{
    @FXML
    private TextField hoursfxid;
    @FXML
    private TextField employeeNamefxid;

    @javafx.fxml.FXML
    public void initialize() {
    }
    private static final String FILE_PATH = "C:\\Users\\Public\\Documents\\Employee_Hours.txt";
    @javafx.fxml.FXML
    public void saveButtonOnMouseClick(ActionEvent actionEvent) {
        String name = employeeNamefxid.getText().trim();
        String hours = hoursfxid.getText().trim();

        if (!name.isEmpty() && !hours.isEmpty()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
                writer.write(name + " : " + hours);
                writer.newLine();
                System.out.println("Saved: " + name + " : " + hours);
                employeeNamefxid.clear();
                hoursfxid.clear();
            } catch (IOException e) {
                System.err.println("Error saving data: " + e.getMessage());
            }
        } else {
            System.out.println("Please fill in both name and hours fields.");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("DashboardInventoryManager.fxml"));
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