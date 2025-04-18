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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InventoryManagerTrackStockLevels
{
    @javafx.fxml.FXML
    private TextField stockInventoryfxid;

    private static final String FILE_PATH = "C:\\Users\\Public\\Documents\\stock_inventory.txt";

    @javafx.fxml.FXML
    public void initialize() {
    }



    @javafx.fxml.FXML
    public void restockInventoryOnMouseClick(ActionEvent actionEvent) {
        String userInput = stockInventoryfxid.getText();
        if (userInput != null && !userInput.trim().isEmpty()){
            File file = new File(FILE_PATH);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))){
                writer.write(userInput);
                writer.newLine();
                System.out.println("Stock Data Saved:"+userInput);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    @FXML
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