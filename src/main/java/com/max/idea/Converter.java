package com.max.idea;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Этот конвертер физических величин позволяет переводить ряд единиц измерения массы и расстояния");
        System.out.println("*********");
        Scanner input = new Scanner(System.in);
        double[] Array = new double[4];
        String[] massArraytext = {"граммы", "килограммы", "унции", "пуды"};
        String[] distanceArraytext = {"метры", "километры", "мили", "ярды"};
        int massType = 0;
        double massNumber = 0;
        int distanceType = 0;
        double distanceNumber = 0;

        System.out.println("Выберите что переводить: \n1 - масса \n2 - расстояние");
        int physicalQuantity = input.nextInt();

        if (physicalQuantity == 1) {
            System.out.println("Выберите единицу измерения: \n1 - грамм \n2 - килограмм \n3 - унция \n4 - пуд");
            massType = input.nextInt();
            if (massType == 1 | massType == 2 | massType == 3 | massType == 4) {
                System.out.println("Введите количество выбранных единиц: ");
                massNumber = input.nextDouble();
            } else {
                System.out.println("Пожалуйста, перезапустите программу и введите 1,2,3 или 4");
            }
        }

        else if (physicalQuantity == 2) {
            System.out.println("Выберите единицу измерения: \n1 - метр \n2 - километр \n3 - миля \n4 - ярд");
            distanceType = input.nextInt();
            if (distanceType == 1 | distanceType == 2 | distanceType == 3 | distanceType == 4) {
                System.out.println("Введите количество выбранных единиц: ");
                distanceNumber = input.nextDouble();
            } else {
                System.out.println("Пожалуйста, перезапустите программу и введите 1,2,3 или 4");
            }
        }

        else {
            System.out.println("Пожалуйста, перезапустите программу и введите 1 или 2");
        }
        if (physicalQuantity == 1 && (massType == 1 | massType == 2 | massType == 3 | massType == 4)) {
            switch(massType) {
                case 1:
                    Array[0] = massNumber;
                    Array[1] = massNumber / 1000;
                    Array[2] = massNumber / 28.35;
                    Array[3] = massNumber / 16380;
                    break;
                case 2:
                    Array[0] = massNumber * 1000;
                    Array[1] = massNumber;
                    Array[2] = massNumber * 35.274;
                    Array[3] = massNumber / 16.381;
                    break;
                case 3:
                    Array[0] = massNumber * 28.35;
                    Array[1] = massNumber / 35.274;
                    Array[2] = massNumber;
                    Array[3] = massNumber / 577.8;
                    break;
                case 4:
                    Array[0] = massNumber * 16380;
                    Array[1] = massNumber * 16.381;
                    Array[2] = massNumber * 577.8;
                    Array[3] = massNumber;
                    break;
            }
            for (int i = 0; i < 4; i++) {
                System.out.println(massArraytext[i] + ": " + Array[i]);
            }
        } else if (physicalQuantity == 2 && (distanceType == 1 | distanceType == 2 | distanceType == 3 | distanceType == 4)) {
            switch (distanceType) {
                case 1:
                    Array[0] = distanceNumber;
                    Array[1] = distanceNumber / 1000;
                    Array[2] = distanceNumber / 1609;
                    Array[3] = distanceNumber * 1.094;
                    break;
                case 2:
                    Array[0] = distanceNumber * 1000;
                    Array[1] = distanceNumber;
                    Array[2] = distanceNumber / 1.609;
                    Array[3] = distanceNumber * 1094;
                    break;
                case 3:
                    Array[0] = distanceNumber * 1609;
                    Array[1] = distanceNumber * 1.609;
                    Array[2] = distanceNumber;
                    Array[3] = distanceNumber * 1760;
                    break;
                case 4:
                    Array[0] = distanceNumber / 1.094;
                    Array[1] = distanceNumber / 1094;
                    Array[2] = distanceNumber / 1760;
                    Array[3] = distanceNumber;
                    break;
            }
            for (int i = 0; i < 4; i++) {
                System.out.println(distanceArraytext[i] + ": " + Array[i]);
            }
        }

    }
}
