package com.max.idea;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        long sum = 0;

        System.out.println("Введите любое целое положительное число");
        n = input.nextInt();
        if (n < 0) {
            System.out.println("Пожалуйста, перезапустите программу и введите любое целое положительное число");
        } else {
            for (int i = n; i > 0; i--) {
                if (i % 2 == 0) {
                    continue;
                }
                sum += i;
            }
            System.out.println("Сумма всех нечётных чисел от 1 до введенного числа: " + sum);
        }
    }
}
