package com.example.demo.services;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.concurrent.atomic.AtomicInteger;

public class Calculator {
    public void numberClick(Button button, TextField input, String number){
        button.setOnAction(event -> {
            String text = input.getText();
            input.setText(text + number);
        });
    }

    public void clearClick(Button button, TextField input){
        button.setOnAction(event -> {
            input.setText("");
        });
    }

    public void plusNumber(Button button, Button buttonResult, TextField input){
        String[] result = new String[2];
        button.setOnAction(event -> {
            String number = input.getText();
            result[0] = number;
            clearClick(button, input);
        });

        buttonResult.setOnAction(event -> {
            int i = 0;
            String number = input.getText();
            result[1] = number;

            for (String num: result) {
                int integer = Integer.parseInt(num);

                i = i + integer;
            }

            input.setText(String.valueOf(i));
        });

    }

}
