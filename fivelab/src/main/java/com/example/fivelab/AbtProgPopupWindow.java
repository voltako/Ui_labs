package com.example.fivelab;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AbtProgPopupWindow {

    public static void newAbtProgPopUpWindow() {

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        TextArea abtprog = new TextArea();

        abtprog.setFont(Font.font(14));

        VBox vBox = new VBox(abtprog);

        abtprog.editableProperty().set(false);

        abtprog.setText("Разработал Карнач Никита 19ИС1бп");

        Scene scene = new Scene(vBox,300,200);
        window.setScene(scene);
        window.setTitle("о программе");
        window.show();

    }


}
