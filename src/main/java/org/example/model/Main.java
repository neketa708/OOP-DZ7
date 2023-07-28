package org.example.model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = new Logger();

        System.out.println("введите действительную часть первого числа");
        double real1 = scanner.nextDouble();
        System.out.println("введите мнимую часть первого числа");
        double imagionary1 = scanner.nextDouble();
        ComplexNumber num1 = new ComplexNumber(real1, imagionary1);

        System.out.println("введите действительную часть второго числа");
        double real2 = scanner.nextDouble();
        System.out.println("введите мнимую часть второго числа");
        double imagionary2 = scanner.nextDouble();
        ComplexNumber num2 = new ComplexNumber(real2, imagionary2);

        System.out.println("выберите операцию");
        System.out.println("1. сложение");
        System.out.println("2. умножение");
        System.out.println("3. деление");
        int choice = scanner.nextInt();

        ComplexNumber result = null;
        switch (choice){
            case 1:
                result = Calculator.sum(num1, num2);
                logger.log("Sun rational numbers "+num1+" and "+num2+" = "+result);
                break;
            case 2:
                result = Calculator.multiply(num1, num2);
                break;
            case 3:
                result = Calculator.divide(num1, num2);
                break;
            default:
                System.out.println("некоректный выбор операции");
                break;
        }
        if (result != null){
            System.out.println("результат "+result);
        }
    }
}
