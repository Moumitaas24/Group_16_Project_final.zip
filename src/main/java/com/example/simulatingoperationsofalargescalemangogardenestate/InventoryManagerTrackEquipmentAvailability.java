package com.example.simulatingoperationsofalargescalemangogardenestate;


import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
public class InventoryManagerTrackEquipmentAvailability
{
    @javafx.fxml.FXML
    private TableView<EquipmentEntry> tableViewfxid;
    @javafx.fxml.FXML
    private DatePicker datePickerfxid;
    private final ObservableList<EquipmentEntry> data = FXCollections.observableArrayList();
    @FXML
    private TableColumn<EquipmentEntry,String> statuscolumnfxid;
    @FXML
    private TableColumn<EquipmentEntry,String> eqnamecolumnfxid;
    @FXML
    private TextField equipmentNamefxid;
    @FXML
    private TableColumn<EquipmentEntry,String> datecolumnfxid;
    @FXML
    private TextField statusfxid;

    @javafx.fxml.FXML
    public void initialize() {
        eqnamecolumnfxid.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEquipmentName()));
        statuscolumnfxid.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatus()));
        datecolumnfxid.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDate()));
        tableViewfxid.setItems(data);

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

    @FXML
    public void datePickerOnMouesClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveOnMouseClick(ActionEvent actionEvent) {
        String name = equipmentNamefxid.getText();
        String status = statusfxid.getText();
        LocalDate date = datePickerfxid.getValue();

        if (name.isEmpty() || status.isEmpty() || date == null){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill up all fields before saving");
            alert.showAndWait();
            return;
        }
        EquipmentEntry entry = new EquipmentEntry(name,status,date.toString());
        data.add(entry);
        equipmentNamefxid.clear();
        statusfxid.clear();
        datePickerfxid.setValue(null);

    }
}