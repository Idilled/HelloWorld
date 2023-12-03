package com.max.idea;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("С помощью этого калькулятора можно выполнять простейшие арифметические действия с двумя целыми или дробными десятичными числами");
        System.out.println("********************");
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число");
        double x = input.nextDouble();

        System.out.println("Введите второе число");
        double y = input.nextDouble();

        System.out.println("Введите действие, которое хотите совершить над числами:\n+ для сложения\n- для вычитания\n* для умножения\n/ для деления");
        String operator = input.next();

        boolean errorOperator = false;
        double result = 0;
        if (y == 0 & operator.equals("/")) {
            System.out.println("На ноль делить нельзя, перезапустите программу и введите второе число, отличное от нуля");
        } else {
            switch (operator) {
                case "+":
                    result = x + y;
                    break;
                case "-":
                    result = x - y;
                    break;
                case "*":
                    result = x * y;
                    break;
                case "/":
                    result = x / y;
                    break;
                default:
                    errorOperator = true;
            }
        }
        if (errorOperator == false) {
            System.out.println("Результат вычисления: " + result);
        } else {
            System.out.println("Пожалуйста, перезапустите программу и выберите одно из указанных действий: +, -, *, /");
        }
    }
}
