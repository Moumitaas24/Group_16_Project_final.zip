package com.example.simulatingoperationsofalargescalemangogardenestate;

import javafx.beans.property.SimpleStringProperty;

public class ShipmentEntry {
    private final SimpleStringProperty id;
    private final SimpleStringProperty destination;
    private final SimpleStringProperty date;

    public ShipmentEntry(String id, String destination, String date) {
        this.id = new SimpleStringProperty(id);
        this.destination = new SimpleStringProperty(destination);
        this.date = new SimpleStringProperty(date);
    }

    public String getId() {
        return id.get();
    }

    public String getDestination() {
        return destination.get();
    }

    public String getDate() {
        return date.get();
    }
}