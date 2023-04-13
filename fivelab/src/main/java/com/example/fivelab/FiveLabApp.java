package com.example.fivelab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FiveLabApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FiveLabApp.class.getResource("fivelab.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 300);
        stage.setTitle("five lab");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}