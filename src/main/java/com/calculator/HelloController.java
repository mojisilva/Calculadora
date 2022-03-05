package com.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private Label outputText;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    protected void onHelloButtonClick() {
        outputText.setText("Welcome to JavaFX Application!");
    }
}