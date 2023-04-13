module com.example.sevenlab {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.sevenlab to javafx.fxml;
    exports com.example.sevenlab;
}