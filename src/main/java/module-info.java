module com.example.prova1fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prova1fx to javafx.fxml;
    exports com.example.prova1fx;
}