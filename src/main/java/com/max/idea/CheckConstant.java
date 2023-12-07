package com.max.idea;

import java.util.Scanner;

public class CheckConstant {
    public static void main(String[] args) {
        double x = 1.1;
        double y = 6;
        double z = 14;
        int arrayLength;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер массива");
        arrayLength = input.nextInt();
        double[] array = new double[arrayLength];

        System.out.println("Введите элементы массива, их должно быть " + arrayLength);
        for (int i = 0; i < arrayLength; i++) {
            array[i] = input.nextDouble();
            if (array[i] == x || array[i] == y || array[i] == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}
