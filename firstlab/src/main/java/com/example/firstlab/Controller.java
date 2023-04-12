package com.example.firstlab;

import javafx.fxml.FXML;



import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static com.example.firstlab.Calc.calc;

public class Controller {

    @FXML
    private TextField paramx;

    @FXML
    private TextField paramA;

    @FXML
    private Button calculation;

    @FXML
    private TextArea func;

    @FXML
    private TextArea answer;

    @FXML
    void initialize() {


        func.setText("3 * x + x * 4 * (1 + (x - a/x)/(x + a/x) ) - 1");


        calculation.setOnAction(event -> {
            String paramXText = paramx.getText();


            String paramAText = paramA.getText();


            double x = Double.parseDouble(paramXText);
            double a = Double.parseDouble(paramAText);



            Calc calc = new Calc();

            double ans = calc(x,a);



            Double.toString(ans);

            answer.setText(Double.toString(ans));




        });
    }
}