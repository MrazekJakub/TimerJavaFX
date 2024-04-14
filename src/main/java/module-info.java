module com.example.casovacm {
    requires javafx.controls;
    requires javafx.fxml;
   requires javafx.media;
    opens com.example.casovacm to javafx.fxml;
    exports com.example.casovacm;
}