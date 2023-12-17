package com.max.idea;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double currentDollarRate;
        double roublesQuantity;
        double currencyRate;

        System.out.println("Данный конвертер позволяет переводить рубли в доллары по заданному курсу");
        System.out.println("Введите курс доллара: ");
        currentDollarRate = input.nextDouble();
        System.out.println("Введите количество рублей: ");
        roublesQuantity = input.nextDouble();

        if (currentDollarRate > 0 && roublesQuantity >= 0) {
            currencyRate = roublesQuantity / currentDollarRate;
            System.out.println("Курс доллара: " + currentDollarRate);
            System.out.println("Количество рублей: " + roublesQuantity);
            System.out.printf("%s %.2f", "Итого:", currencyRate);
        } else if (currentDollarRate == 0) {System.out.println("Введено значение курса доллара = 0. Перезапустите программу и введите значение, не равное нулю");
        } else if (currentDollarRate < 0 || roublesQuantity < 0) {
            System.out.println("Введено одно или более отрицательных значений. Перезапустите программу и введите положительные значения");
        }
    }
}
