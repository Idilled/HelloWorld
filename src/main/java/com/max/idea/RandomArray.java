package com.max.idea;

public class RandomArray {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 15;
        final int RANGE_MIN = -20;
        final int RANGE_MAX = 20;
        double[] array = new double[ARRAY_LENGTH];
        System.out.println("Для инфо, получившийся массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*(RANGE_MAX-RANGE_MIN) + RANGE_MIN;
            System.out.print(" [" + array[i] + "] ");
        }

        double min = array[0];
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Наибольшее по модулю значение элемента в массиве: " + Math.max(Math.abs(max),Math.abs(min)));

    }
}
