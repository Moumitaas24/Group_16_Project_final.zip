module com.example.simulatingoperationsofalargescalemangogardenestate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulatingoperationsofalargescalemangogardenestate to javafx.fxml;
    exports com.example.simulatingoperationsofalargescalemangogardenestate;
}