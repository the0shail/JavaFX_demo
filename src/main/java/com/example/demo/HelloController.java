package com.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import com.example.demo.services.Calculator;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonClear;

    @FXML
    private Button buttonDot;

    @FXML
    private Button buttonResult;

    @FXML
    private TextField inputResult;

    @FXML
    void initialize() {
        Calculator calc = new Calculator();

        calc.numberClick(button1, inputResult, "1");
        calc.numberClick(button2, inputResult, "2");
        calc.numberClick(button3, inputResult, "3");
        calc.numberClick(button4, inputResult, "4");
        calc.numberClick(button5, inputResult, "5");
        calc.numberClick(button6, inputResult, "6");
        calc.numberClick(button7, inputResult, "7");
        calc.numberClick(button8, inputResult, "8");
        calc.numberClick(button9, inputResult, "9");


        calc.plusNumber(buttonDot, buttonResult, inputResult);

        calc.clearClick(buttonClear, inputResult);

    }
}
