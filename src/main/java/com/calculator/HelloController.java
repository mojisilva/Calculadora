package com.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private Label outputText;

    @FXML
    private TextField inputText;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button zero;

    @FXML
    private Button sum;

    @FXML
    private Button sub;

    @FXML
    private Button div;

    @FXML
    private Button multi;

    @FXML
    private Button dot;

    @FXML
    private Button equal;

    @FXML
    private Button clear;

    @FXML
    protected void onHelloButtonClick() {
        outputText.setText(inputText.getText());
    }
}