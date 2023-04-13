package com.example.fivelab;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

import static com.example.fivelab.Calculator.calculator;


public class Controller {


    @FXML
    private MenuItem inputData;

    @FXML
    private MenuItem calculate;

    @FXML
    private MenuItem abtProgramm;

    @FXML
    private TextArea func;

    @FXML
    private TextArea answer;


    @FXML
    void initialize() {

        func.setText("3 * x + x * 4 * (1 + (x - a/x)/(x + a/x) ) - 1");

        System.out.println("произошла инициализация");

        AtomicReference<ArrayList<Double>> arrayList = new AtomicReference<>(new ArrayList<>());

        inputData.setOnAction(event ->{
            System.out.println("Нажатие кнопки Ввод данных");
            arrayList.set(InputDataPopupWindow.newInputDataPopUpWindow("Second Window"));








        });



        calculate.setOnAction(event -> {

            System.out.println("Нажатие кнопки Рассчитать");
            Calculator calculator = new Calculator();
            double x,a;
            x = arrayList.get().get(0);
            a = arrayList.get().get(1);



            double ans = calculator(1,2);
            answer.setText(Double.toString(ans));

        });

        abtProgramm.setOnAction(event -> {
            AbtProgPopupWindow.newAbtProgPopUpWindow();
        });


    }






}