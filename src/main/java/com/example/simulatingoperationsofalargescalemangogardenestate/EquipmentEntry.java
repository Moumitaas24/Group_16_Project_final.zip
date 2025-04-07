package com.example.simulatingoperationsofalargescalemangogardenestate;

import javafx.beans.property.SimpleStringProperty;

public class EquipmentEntry {
    private final SimpleStringProperty equipmentName;
    private final SimpleStringProperty status;
    private final SimpleStringProperty date;

    public EquipmentEntry(String equipmentName, String status, String date) {
        this.equipmentName = new SimpleStringProperty(equipmentName);
        this.status = new SimpleStringProperty(status);
        this.date = new SimpleStringProperty(date);
    }

    public String getEquipmentName() {
        return equipmentName.get();
    }

    public String getStatus() {
        return status.get();
    }

    public String getDate() {
        return date.get();
    }
}