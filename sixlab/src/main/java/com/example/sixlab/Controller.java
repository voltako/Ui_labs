package com.example.sixlab;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private RadioButton firstRadioButton;

    @FXML
    private RadioButton secondRadioButton;


    @FXML
    private RadioButton thirdRadioButton;


    @FXML
    private RadioButton fourthRadioButton;


    @FXML
    private RadioButton fifthRadioButton;


    @FXML
    private Button convertBtn;

    @FXML
    private TextArea answTextArea;



    @FXML
    void initialize() {

        convertBtn.setOnAction(event -> {
            if( firstRadioButton.isSelected() == true){
                answTextArea.setText(Long.toString(Integer.valueOf(firstRadioButton.getText(),2),8));
            } else if (secondRadioButton.isSelected() == true) {
                answTextArea.setText(Long.toString(Integer.valueOf(secondRadioButton.getText(),2),8));
            } else if (thirdRadioButton.isSelected() == true) {
                answTextArea.setText(Long.toString(Integer.valueOf(thirdRadioButton.getText(),2),8));
            } else if (fourthRadioButton.isSelected() == true) {
                answTextArea.setText(Long.toString(Integer.valueOf(fourthRadioButton.getText(),2),8));
            } else if (fifthRadioButton.isSelected() == true) {
                answTextArea.setText(Long.toString(Integer.valueOf(fifthRadioButton.getText(),2),8));
            }


        });




    }
}