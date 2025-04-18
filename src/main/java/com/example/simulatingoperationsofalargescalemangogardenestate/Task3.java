package com.example.simulatingoperationsofalargescalemangogardenestate;


import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Task3
{
    @javafx.fxml.FXML
    private TextField destinationfxid;
    @javafx.fxml.FXML
    private TableColumn<ShipmentEntry,String> idcolumnfxid;
    @javafx.fxml.FXML
    private TableColumn<ShipmentEntry,String> shipmentdatecolumnfxid;
    @javafx.fxml.FXML
    private TextField idfxid;
    @javafx.fxml.FXML
    private  TableView<ShipmentEntry> tableViewfxid;
    @javafx.fxml.FXML
    private DatePicker datepickerfxid;
    @javafx.fxml.FXML
    private TableColumn<ShipmentEntry,String> destinationcolumnfxid;
    private final ObservableList<ShipmentEntry> data = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    public void initialize() {
        idcolumnfxid.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        destinationcolumnfxid.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDestination()));
        shipmentdatecolumnfxid.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDate()));
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

    @javafx.fxml.FXML
    public void saveButtonOnMouseClick(ActionEvent actionEvent) {
        String id = idfxid.getText();
        String destination = destinationfxid.getText();
        LocalDate date = datepickerfxid.getValue();

        if (id.isEmpty() || destination.isEmpty() || date == null){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill up all fields before saving");
            alert.showAndWait();
            return;
        }
        ShipmentEntry entry = new ShipmentEntry(id,destination,date.toString());
        data.add(entry);
        idfxid.clear();
        destinationfxid.clear();
        datepickerfxid.setValue(null);

    }


    @javafx.fxml.FXML
    public void datepickerButtonOnMouseClick(ActionEvent actionEvent) {
    }
}