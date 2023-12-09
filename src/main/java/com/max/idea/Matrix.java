package com.max.idea;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix;
        int matrixRows;
        int matrixColumns;

        System.out.println("Введите число строк в матрице");
        matrixRows = input.nextInt();
        System.out.println("Введите число столбцов в матрице");
        matrixColumns = input.nextInt();
        if (matrixRows == 0 | matrixRows < 0 | matrixColumns == 0 | matrixColumns < 0) {
            System.out.println("Перезапустите программу и введите положительные целые числа для числа строк и числа столбцов в матрице");
        } else {
            matrix = new double[matrixRows][matrixColumns];
            for (int i = 0; i < matrixRows; i++) {
                int n = 0;
                System.out.println("Введите значения для ряда матрицы " + i);
                while (n < matrixColumns) {
                    matrix[i][n] = input.nextDouble();
                    n++;
                }
            }

            // Проверочный вывод матрицы целиком
            System.out.println("Введённая матрица имеет вид: ");
            for (int i = 0; i < matrixRows; i++) {
                for (int n = 0; n < matrixColumns; n++) {
                    System.out.print(" " + matrix[i][n] + " ");
                }
                System.out.println();
            }

            System.out.println("Первая строка матрицы, где каждый элемент умножен на 3");
            for (int i = 0; i < matrixColumns; i++) {
                System.out.print(" " + matrix[0][i] * 3 + " ");
            }
        }
    }
}
