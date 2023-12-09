package com.max.idea;

import java.util.Scanner;

public class ArrayModification {
    public static void main(String[] args) {
        int arrayLength;
        double sum = 0;
        double arithMean;
        double[] array;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер массива");
        arrayLength = input.nextInt();
        if (arrayLength == 0) {
            System.out.println("Размер массива 0, перезапустите программу и введите целое положительное число");
        } else if (arrayLength < 0) {
            System.out.println("Вы ввели отрицательное число, перезапустите программу и введите целое положительное число");
        } else {
            array = new double[arrayLength];
            System.out.println("Введите элементы массива, их должно быть " + arrayLength);
            for (int i = 0; i < arrayLength; i++) {
                array[i] = input.nextDouble();
            }

            for (int i = 0; i < arrayLength; i++) {
                sum += array[i];
            }
            arithMean = sum / arrayLength;

            System.out.println("Массив, где каждый элемент умножается на среднее арифметическое");
            for (int i = 0; i < arrayLength; i++) {
                System.out.println(array[i] * arithMean);
            }
        }
    }
}
