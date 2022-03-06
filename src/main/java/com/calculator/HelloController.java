package com.calculator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;


public class HelloController {
    double a = 0;
    double b = 0;
    double result = 0;
    String operation;

    @FXML
    private TextField inputTF;

    @FXML
    private AnchorPane anchorPane;

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
        actionButtonsPressed();
    }

   public void actionButtonsCliked(){
        zeroBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputTF.setText(inputTF.getText() + "0");
            }
        });
        oneBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputTF.setText(inputTF.getText() + "1");
            }
        });
        twoBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputTF.setText(inputTF.getText() + "2");
            }
        });
        threeBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputTF.setText(inputTF.getText() + "3");

            }
        });
        fourBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputTF.setText(inputTF.getText() + "4");

            }
        });
        fiveBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputTF.setText(inputTF.getText() + "5");

            }
        });
        sixBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputTF.setText(inputTF.getText() + "6");

            }
        });
        sevenBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputTF.setText(inputTF.getText() + "7");

            }
        });
        eightBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputTF.setText(inputTF.getText() + "8");

            }
        });
        nineBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputTF.setText(inputTF.getText() + "9");

            }
        });


        clearBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputTF.clear();
                a = 0;
                b = 0;
                result = 0;
                operation = "";

            }
        });
        multiBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(inputTF.getText());
                inputTF.setText("");
                operation = "*";
            }
        });
        divBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(inputTF.getText());
                inputTF.setText("");
                operation = "/";
            }
        });
        sumBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(inputTF.getText());
                inputTF.setText("");
                operation = "+";
            }
        });
        subBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a = Double.parseDouble(inputTF.getText());
                inputTF.setText("");
                operation = "-";
            }
        });
        equalBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                b = Double.parseDouble(inputTF.getText());
                switch (operation){
                    case "*":
                        result = a * b;
                        inputTF.setText(String.valueOf(result));
                        break;
                    case "/":
                        result = a / b;
                        inputTF.setText(String.valueOf(result));
                        break;
                    case "+":
                        result = a + b;
                        inputTF.setText(String.valueOf(result));
                        break;
                    case "-":
                        result = a - b;
                        inputTF.setText(String.valueOf(result));
                        break;

                }
            }
        });
        dotBT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                inputTF.setText(inputTF.getText() + ".");
            }
        });
    }
    private void actionButtonsPressed() {
        inputTF.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if(keyEvent.getCode().equals(KeyCode.ENTER)){
                    System.out.println("teste" + keyEvent.getCode());
                    b = Double.parseDouble(inputTF.getText());
                    switch (operation){
                        case "*":
                            result = a * b;
                            inputTF.setText(String.valueOf(result));
                            break;
                        case "/":
                            result = a / b;
                            inputTF.setText(String.valueOf(result));
                            break;
                        case "+":
                            result = a + b;
                            inputTF.setText(String.valueOf(result));
                            break;
                        case "-":
                            result = a - b;
                            inputTF.setText(String.valueOf(result));
                            break;

                    }
                }
            }
        });
    }
   /* public void actionButtonsPressed(){
        equalBT.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if(inputTF.setOnKeyPressed();){
                    b = Double.parseDouble(inputTF.getText());
                    switch (operation){
                        case "*":
                            result = a * b;
                            inputTF.setText(String.valueOf(result));
                            break;
                        case "/":
                            result = a / b;
                            inputTF.setText(String.valueOf(result));
                            break;
                        case "+":
                            result = a + b;
                            inputTF.setText(String.valueOf(result));
                            break;
                        case "-":
                            result = a - b;
                            inputTF.setText(String.valueOf(result));
                            break;

                    }
                }

            }
        });*/
    }


