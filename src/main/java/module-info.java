module com.example.simulatingoperationsofalargescalemangogardenestate {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.simulatingoperationsofalargescalemangogardenestate to javafx.fxml;
    exports com.example.simulatingoperationsofalargescalemangogardenestate;
}