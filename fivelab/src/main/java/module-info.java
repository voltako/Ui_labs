module com.example.fivelab {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.fivelab to javafx.fxml;
    exports com.example.fivelab;
}