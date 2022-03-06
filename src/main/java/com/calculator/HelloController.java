package com.calculator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;


public class HelloController {
    double a = 0;
    double b = 0;
    double result = 0;
    String operation;

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
        actionButtonsCliked();
        inputText.requestFocus();
    }
    public void actionButtonsCliked(){
        zero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputText.setText(inputText.getText() + "0");
            }
        });
        one.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputText.setText(inputText.getText() + "1");
            }
        });
        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputText.setText(inputText.getText() + "2");
            }
        });
        three.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputText.setText(inputText.getText() + "3");

            }
        });
        four.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputText.setText(inputText.getText() + "4");

            }
        });
        five.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputText.setText(inputText.getText() + "5");

            }
        });
        six.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputText.setText(inputText.getText() + "6");

            }
        });
        seven.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputText.setText(inputText.getText() + "7");

            }
        });
        eight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputText.setText(inputText.getText() + "8");

            }
        });
        nine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputText.setText(inputText.getText() + "9");

            }
        });


        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputText.clear();
                a = 0;
                b = 0;
                result = 0;
                operation = "";

            }
        });
        multi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(inputText.getText());
                inputText.setText("");
                operation = "*";
            }
        });
        div.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(inputText.getText());
                inputText.setText("");
                operation = "/";
            }
        });
        sum.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(inputText.getText());
                inputText.setText("");
                operation = "+";
            }
        });
        sub.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(inputText.getText());
                inputText.setText("");
                operation = "-";
            }
        });
        equal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                b = Double.parseDouble(inputText.getText());

                switch (operation){
                    case "*":
                        result = a * b;
                        inputText.setText(String.valueOf(result));
                        break;
                    case "/":
                        result = a / b;
                        inputText.setText(String.valueOf(result));
                        break;
                    case "+":
                        result = a + b;
                        inputText.setText(String.valueOf(result));
                        break;
                    case "-":
                        result = a - b;
                        inputText.setText(String.valueOf(result));
                        break;

                }
            }
        });
        dot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputText.setText(inputText.getText() + ".");
            }
        });
    }

    public void actionButtonsPressed(){
        zero.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                inputText.setText(inputText.getText() + "0");
            }
        });
        one.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                inputText.setText(inputText.getText() + "1");
            }
        });
        two.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                inputText.setText(inputText.getText() + "2");
            }
        });
        three.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                inputText.setText(inputText.getText() + "3");
            }
        });
        four.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                inputText.setText(inputText.getText() + "4");
            }
        });
        five.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                inputText.setText(inputText.getText() + "5");
            }
        });
        six.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                inputText.setText(inputText.getText() + "6");
            }
        });
        seven.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                inputText.setText(inputText.getText() + "7");
            }
        });
        eight.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                inputText.setText(inputText.getText() + "8");
            }
        });
        nine.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                inputText.setText(inputText.getText() + "9");
            }
        });

    }

}