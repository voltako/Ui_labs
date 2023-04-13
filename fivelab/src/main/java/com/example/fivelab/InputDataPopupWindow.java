package com.example.fivelab;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;


public class InputDataPopupWindow {
    public static <string> ArrayList<Double> newInputDataPopUpWindow(String title){


        ArrayList<Double> value = new ArrayList<>();

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        TextField inputparamX = new TextField();
        TextField inputparamA = new TextField();
        Button saveData = new Button("Сохранить значения");

        inputparamX.setPromptText("Введите x...");

        inputparamA.setPromptText("Введите а...");


        VBox vBox = new VBox(5,inputparamX,inputparamA,saveData);
        vBox.setAlignment(Pos.BASELINE_CENTER);

        int len = inputparamA.getLength()+inputparamX.getLength();

        saveData.setOnAction(event -> {
            value.add(Double.parseDouble(inputparamX.getText()));
            value.add(Double.parseDouble(inputparamA.getText()));
            window.close();
        });

        Scene scene = new Scene(vBox,200,100);
        window.setScene(scene);
        window.setTitle(title);
        window.showAndWait();



        return value;

    }






}
