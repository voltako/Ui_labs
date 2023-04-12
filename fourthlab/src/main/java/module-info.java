module com.example.fourthlab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fourthlab to javafx.fxml;
    exports com.example.fourthlab;
}