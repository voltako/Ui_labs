module com.example.sixlab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sixlab to javafx.fxml;
    exports com.example.sixlab;
}