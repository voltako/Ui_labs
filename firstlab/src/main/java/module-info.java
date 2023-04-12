module com.example.firstlab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstlab to javafx.fxml;
    exports com.example.firstlab;
}