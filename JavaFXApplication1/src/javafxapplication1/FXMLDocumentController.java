/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author ELCOT
 */
public class FXMLDocumentController implements Initializable {

    private int firstNumber;
private String operator;
private boolean newNumber = false;
    @FXML
    private TextField calculate;
    @FXML
    private Button num7;
    @FXML
    private Button num4;
    @FXML
    private Button num3;
    @FXML
    private Button num0;
    @FXML
    private Button num8;
    @FXML
    private Button num5;
    @FXML
    private Button num2;
    @FXML
    private Button clear;
    @FXML
    private Button total;
    @FXML
    private Button addtion;
    @FXML
    private Button subtraction;
    @FXML
    private Button multipulication;
    @FXML
    private Button divide;
    @FXML
    private Button num9;
    @FXML
    private Button num6;
    @FXML
    private Button num1;
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void click7(ActionEvent event) {
         if(newNumber){
        calculate.clear();
        newNumber = false;
    }
    calculate.appendText("7");
    }

    @FXML
    private void click4(ActionEvent event) {
         if(newNumber){
        calculate.clear();
        newNumber = false;
    }
    calculate.appendText("4");
    }

    @FXML
    private void click3(ActionEvent event) {
         if(newNumber){
        calculate.clear();
        newNumber = false;
    }
    calculate.appendText("3");
    }

    @FXML
    private void click0(ActionEvent event) {
         if(newNumber){
        calculate.clear();
        newNumber = false;
    }
    calculate.appendText("0");
    }

    @FXML
    private void click8(ActionEvent event) {
         if(newNumber){
        calculate.clear();
        newNumber = false;
    }
    calculate.appendText("8");
    }

    @FXML
    private void click5(ActionEvent event) {
         if(newNumber){
        calculate.clear();
        newNumber = false;
    }
    calculate.appendText("5");
    }

    @FXML
    private void click2(ActionEvent event) {
         if(newNumber){
        calculate.clear();
        newNumber = false;
    }
    calculate.appendText("2");
    }

    @FXML
    private void clear(ActionEvent event) {
        calculate.clear();
    firstNumber = 0;
    operator = "";
    }

    @FXML
    private void sumTotal(ActionEvent event) {
         double secondNumber =
            Integer.parseInt(calculate.getText());

    double result = 0;

    switch(operator){

        case "+":
            result = firstNumber + secondNumber;
            break;

        case "-":
            result = firstNumber - secondNumber;
            break;

        case "*":
            result = firstNumber * secondNumber;
            break;

        case "/":

            if(secondNumber == 0){
                calculate.setText("Error");
                return;
            }

            result = firstNumber / secondNumber;
            break;
    }

    calculate.setText(String.valueOf(result));
    }

    @FXML
    private void clickplus(ActionEvent event) {
        firstNumber = Integer.parseInt(calculate.getText());
    operator = "+";
    newNumber = true;
    }

    @FXML
    private void climinus(ActionEvent event) {
        firstNumber = Integer.parseInt(calculate.getText());
    operator = "-";
    newNumber = true;
    }

    @FXML
    private void clickstar(ActionEvent event) {
        firstNumber = Integer.parseInt(calculate.getText());
    operator = "*";
    newNumber = true;
    }

    @FXML
    private void clickslash(ActionEvent event) {
        firstNumber = Integer.parseInt(calculate.getText());
    operator = "/";
    newNumber = true;
    }

    @FXML
    private void click9(ActionEvent event) {
         if(newNumber){
        calculate.clear();
        newNumber = false;
    }
    calculate.appendText("9");
    }

    @FXML
    private void click6(ActionEvent event) {
         if(newNumber){
        calculate.clear();
        newNumber = false;
    }
    calculate.appendText("6");
    }

    @FXML
    private void click1(ActionEvent event) {
         if(newNumber){
        calculate.clear();
        newNumber = false;
    }
    calculate.appendText("1");
    }
    
}
