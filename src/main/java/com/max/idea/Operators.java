package com.max.idea;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число 1 (x): ");
        double x = input.nextDouble();

        System.out.println("Введите число 2 (y): ");
        double y = input.nextDouble();

        System.out.println("Введите число 3 (z): ");
        double z = input.nextDouble();

        double average = (x + y + z)/3;
        System.out.println("Среднее арифметическое этих чисел: " + average);

        int result = (int) (average/2);
        String answer;
        if (result > 3) {
            answer = "Программа выполнена корректно";
            System.out.println(answer);
        }
    }
}
