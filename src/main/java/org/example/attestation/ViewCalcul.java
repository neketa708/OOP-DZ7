package org.example.attestation;

import java.util.Scanner;

public class ViewCalcul {
    Logger logger = new Logger();
    Calculator calculator = new Calculator();
    public void run(){
        double real1 = prompt("введите действительную часть первого числа = ");
        double imagionary1 = prompt("введите мнимую часть первого числа = ");
        ComplexNumber num1 = new ComplexNumber(real1, imagionary1);

        double real2 = prompt("введите действительную часть второго числа = ");
        double imagionary2 = prompt("введите мнимую часть второго числа = ");
        ComplexNumber num2 = new ComplexNumber(real2, imagionary2);

        int choice = promptInt("выберите операцию: 1. сложение; 2. умножение; 3. деление");

        ComplexNumber result = null;
        switch (choice){
            case 1:
                result = calculator.sum(num1, num2);
                logger.log("Sum rational numbers1 "+num1+" and numbers2 "+num2+" = "+result);
                break;
            case 2:
                result = calculator.multiply(num1, num2);
                logger.log("multiply rational numbers1 "+num1+" and numbers2 "+num2+" = "+result);
                break;
            case 3:
                result = calculator.divide(num1, num2);
                logger.log("divide rational numbers1 "+num1+" and numbers2 "+num2+" = "+result);
                break;
            default:
                System.out.println("некоректный выбор операции");
                break;
        }
        if (result != null){
            System.out.println("результат "+result);
        }

    }

    private double prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextDouble();
    }
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextInt();
    }
}
