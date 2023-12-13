package com.max.idea;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result;
        String number1;
        int number2;

        System.out.println("Введите первое число");
        result = input.nextDouble();
        number1 = Double.toString(result);
        //System.out.println(number1); //проверка

        System.out.println("Введите второе число");
        result = input.nextDouble();
        number2 = (int)(result);
        //System.out.println(number2); //проверка

        System.out.println("Максимальное из двух чисел: " + Math.max(parseDouble(number1), number2));
        System.out.println("Минимальное из двух чисел: " + Math.min(parseDouble(number1), number2)); // Т.к. одно число типа double, то и второе будет double

    }
}
