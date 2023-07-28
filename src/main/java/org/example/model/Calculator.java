package org.example.model;

public class Calculator {
    public static ComplexNumber sum(ComplexNumber num1, ComplexNumber num2){
        double real = num1.getReal()+num2.getReal();
        double imagionary = num1.getImaginary()+num2.getImaginary();
        return new ComplexNumber(real, imagionary);
    }
    public static ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2){
        double real = num1.getReal()*num2.getReal()-num1.getImaginary()*num2.getImaginary();
        double imagionary = num1.getReal()*num2.getImaginary()+num1.getImaginary()*num2.getReal();
        return new ComplexNumber(real, imagionary);
    }
    public static ComplexNumber divide(ComplexNumber num1, ComplexNumber num2){
        double denominator = Math.pow(num2.getReal(), 2)+Math.pow(num2.getImaginary(),2);
        double real = (num1.getReal()*num2.getReal()+num1.getImaginary()*num2.getImaginary())/denominator;
        double imagionary = (num1.getImaginary()*num2.getReal()-num1.getReal()*num2.getImaginary())/denominator;
        return new ComplexNumber(real, imagionary);
    }
}
