/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatest;

/**
 *
 * @author unscathed18
 */
public class Calculadora {
    public double add(double number1, double number2){
        return number1+number2;
    }
    public double substract(double number1, double number2){
        return number1-number2;
    }
    public double multiply(double number1, double number2){
        return number1*number2;
    }
    public double divide(double number1, double number2){
        if(number2 == 0){
            return 0;
        }
        return number1/number2;
    }
}
