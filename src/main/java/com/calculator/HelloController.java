package com.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class HelloController {
    double a = 0;
    double b = 0;
    double result = 0;
    String operation;

    @FXML
    private TextField inputTF;

    @FXML
    private Button oneBT;

    @FXML
    private Button twoBT;

    @FXML
    private Button threeBT;

    @FXML
    private Button fourBT;

    @FXML
    private Button fiveBT;

    @FXML
    private Button sixBT;

    @FXML
    private Button sevenBT;

    @FXML
    private Button eightBT;

    @FXML
    private Button nineBT;

    @FXML
    private Button zeroBT;

    @FXML
    private Button sumBT;

    @FXML
    private Button subBT;

    @FXML
    private Button divBT;

    @FXML
    private Button multiBT;

    @FXML
    private Button dotBT;

    @FXML
    private Button equalBT;

    @FXML
    private Button clearBT;

    @FXML
    protected void onHelloButtonClick() {
        actionButtonsCliked();

    }

   public void actionButtonsCliked(){
        zeroBT.setOnAction(actionEvent -> inputTF.setText(inputTF.getText() + "0"));
        oneBT.setOnAction(actionEvent -> inputTF.setText(inputTF.getText() + "1"));
        twoBT.setOnAction(actionEvent -> inputTF.setText(inputTF.getText() + "2"));
        threeBT.setOnAction(actionEvent -> inputTF.setText(inputTF.getText() + "3"));
        fourBT.setOnAction(actionEvent -> inputTF.setText(inputTF.getText() + "4"));
        fiveBT.setOnAction(actionEvent -> inputTF.setText(inputTF.getText() + "5"));
        sixBT.setOnAction(actionEvent -> inputTF.setText(inputTF.getText() + "6"));
        sevenBT.setOnAction(actionEvent -> inputTF.setText(inputTF.getText() + "7"));
        eightBT.setOnAction(actionEvent -> inputTF.setText(inputTF.getText() + "8"));
        nineBT.setOnAction(actionEvent -> inputTF.setText(inputTF.getText() + "9"));
        clearBT.setOnAction(actionEvent -> {
            inputTF.clear();
            a = 0;
            b = 0;
            result = 0;
            operation = "";
        });
        multiBT.setOnAction(actionEvent -> {
            a = Double.parseDouble(inputTF.getText());
            inputTF.setText("");
            operation = "*";

        });
        divBT.setOnAction(actionEvent -> {
            a = Double.parseDouble(inputTF.getText());
            inputTF.setText("");
            operation = "/";
        });
        sumBT.setOnAction(actionEvent -> {
            a = Double.parseDouble(inputTF.getText());
            inputTF.setText("");
            operation = "+";
        });
        subBT.setOnAction(actionEvent -> {
            a = Double.parseDouble(inputTF.getText());
            inputTF.setText("");
            operation = "-";
        });
        equalBT.setOnAction(actionEvent -> {
            b = Double.parseDouble(inputTF.getText());
            switch (operation) {
                case "*" -> {
                    result = a * b;
                    inputTF.setText(String.valueOf(result));
                }
                case "/" -> {
                    result = a / b;
                    inputTF.setText(String.valueOf(result));
                }
                case "+" -> {
                    result = a + b;
                    inputTF.setText(String.valueOf(result));
                }
                case "-" -> {
                    result = a - b;
                    inputTF.setText(String.valueOf(result));
                }
            }
        });
        dotBT.setOnAction(actionEvent -> inputTF.setText(inputTF.getText() + "."));
    }
}