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
public class EstateManagerFertilisers {
    @javafx.fxml.FXML
    private TextField fertilizerfxid;
    @javafx.fxml.FXML
    private TextField quantityfxid;

    private static final String FILE_PATH = "C:\\Users\\Public\\Documents\\Fertilisers.txt";

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveButtonOnMouseClick(ActionEvent actionEvent) {
        String fertilizer = fertilizerfxid.getText();
        String quantity = quantityfxid.getText();
        String output = "Fertilizer: " + fertilizer + System.lineSeparator() +
                "Quantity: " + quantity;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(output);
            writer.newLine();
            writer.write("--------");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnMouseClick(ActionEvent actionEvent) {
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
}