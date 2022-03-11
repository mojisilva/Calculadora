package com.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class CalculatorController {
    double a = 0;
    double b = 0;
    double result = 0;
    String operation;

    @FXML
    private TextField inputTF;

    @FXML
    private Button btsum;

    @FXML
    protected void clearButtonClick() {
        inputTF.clear();
        a = 0;
        b = 0;
        result = 0;
        operation = "";
    }

    @FXML
    public void zeroButtonClick() {
        inputTF.setText(inputTF.getText() + "0");
    }

    @FXML
    public void oneButtonClick() {
        inputTF.setText(inputTF.getText() + "1");
    }

    @FXML
    public void twoButtonClick() {
        inputTF.setText(inputTF.getText() + "2");
    }

    @FXML
    public void threeButtonClick() {
        inputTF.setText(inputTF.getText() + "3");
    }

    @FXML
    public void fourButtonClick() {
        inputTF.setText(inputTF.getText() + "4");
    }

    @FXML
    public void fiveButtonClick() {
        inputTF.setText(inputTF.getText() + "5");
    }

    @FXML
    public void sixButtonClick() {
        inputTF.setText(inputTF.getText() + "6");
    }

    @FXML
    public void sevenButtonClick() {
        inputTF.setText(inputTF.getText() + "7");
    }

    @FXML
    public void eightButtonClick() {
        inputTF.setText(inputTF.getText() + "8");
    }

    @FXML
    public void nineButtonClick() {
        inputTF.setText(inputTF.getText() + "9");
    }

    @FXML
    public void dotButtonClick() {
        inputTF.setText(inputTF.getText() + ".");
    }

    @FXML
    public void multiButton() {
        a = Double.parseDouble(inputTF.getText());
        inputTF.setText("");
        operation = "*";
    }

    @FXML
    public void divButton() {
        a = Double.parseDouble(inputTF.getText());
        inputTF.setText("");
        operation = "/";
    }

    @FXML
    public void sumButton() {
        a = Double.parseDouble(inputTF.getText());
        inputTF.setText("");
        operation = "+";
    }

    @FXML
    public void subButton() {
        a = Double.parseDouble(inputTF.getText());
        inputTF.setText("");
        operation = "-";
    }


    @FXML
    public void equalButton() {
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
    }
}