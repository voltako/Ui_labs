package com.example.fourthlab;

import javafx.fxml.FXML;
import javafx.scene.control.Menu;

public class Controller {


    @FXML
    private Menu file;

    @FXML
    private Menu edit;

    @FXML
    private Menu vid;

    @FXML
    private Menu input;

    @FXML
    private Menu format;

    @FXML
    private Menu service;

    @FXML
    private Menu data;

    @FXML
    void initialize() {
        file.setOnAction(event -> {
            PopupWindow.newPopupWindow();


        });
        edit.setOnAction(event -> {
            PopupWindow.newPopupWindow();


        });
        vid.setOnAction(event -> {
            PopupWindow.newPopupWindow();


        });
        input.setOnAction(event -> {
            PopupWindow.newPopupWindow();


        });
        format.setOnAction(event -> {
            PopupWindow.newPopupWindow();


        });
        service.setOnAction(event -> {
            PopupWindow.newPopupWindow();


        });
        data.setOnAction(event -> {
            PopupWindow.newPopupWindow();


        });

    }


}