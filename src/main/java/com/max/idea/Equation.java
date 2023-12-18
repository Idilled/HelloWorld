package com.max.idea;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String equationString;
        int a;
        int b;
        int x;

        System.out.println("Эта программа позволяет решать простые линейные уравнения вида: a+b=c ИЛИ (a-b=c), где два значения - числа, одно значение - неизвестное (x)");
        System.out.println("Введите уравнение. Пример: x+2=5");
        equationString = input.next();

        if ((equationString.charAt(1) == '+') && equationString.charAt(3) == '=') {
            if (Character.isDigit(equationString.charAt(0)) & Character.isDigit(equationString.charAt(2)) & (equationString.charAt(4) == 'x' | (equationString.charAt(4) == 'х'))) {
                a = Character.getNumericValue(equationString.charAt(0));
                b = Character.getNumericValue(equationString.charAt(2));
                x = a + b;
                System.out.println("x = " + x);
            } else if (Character.isDigit(equationString.charAt(0)) & Character.isDigit(equationString.charAt(4)) & (equationString.charAt(2) == 'x' | (equationString.charAt(2) == 'х'))) {
                a = Character.getNumericValue(equationString.charAt(0));
                b = Character.getNumericValue(equationString.charAt(4));
                x = b - a;
                System.out.println("x = " + x);
            } else if (Character.isDigit(equationString.charAt(2)) & Character.isDigit(equationString.charAt(4)) & (equationString.charAt(0) == 'x' | (equationString.charAt(0) == 'х'))) {
                a = Character.getNumericValue(equationString.charAt(2));
                b = Character.getNumericValue(equationString.charAt(4));
                x = b - a;
                System.out.println("x = " + x);
            } else {
                System.out.println("Введенное уравнение не соответствует схеме. Перезапустите программу и введите уравнение, соответствующее схеме");
            }
        } else if ((equationString.charAt(1) == '-') && equationString.charAt(3) == '=') {
            if (Character.isDigit(equationString.charAt(0)) & Character.isDigit(equationString.charAt(2)) & (equationString.charAt(4) == 'x' | (equationString.charAt(4) == 'х'))) {
                a = Character.getNumericValue(equationString.charAt(0));
                b = Character.getNumericValue(equationString.charAt(2));
                x = a - b;
                System.out.println("x = " + x);
            } else if (Character.isDigit(equationString.charAt(0)) & Character.isDigit(equationString.charAt(4)) & (equationString.charAt(2) == 'x' | (equationString.charAt(2) == 'х'))) {
                a = Character.getNumericValue(equationString.charAt(0));
                b = Character.getNumericValue(equationString.charAt(4));
                x = a - b;
                System.out.println("x = " + x);
            } else if (Character.isDigit(equationString.charAt(2)) & Character.isDigit(equationString.charAt(4)) & (equationString.charAt(0) == 'x' | (equationString.charAt(0) == 'х'))) {
                a = Character.getNumericValue(equationString.charAt(2));
                b = Character.getNumericValue(equationString.charAt(4));
                x = a + b;
                System.out.println("x = " + x);
            } else {
                System.out.println("Введенное уравнение не соответствует схеме. Перезапустите программу и введите уравнение, соответствующее схеме");
            }
        } else {
            System.out.println("Введенное уравнение не соответствует схеме. Перезапустите программу и введите уравнение, соответствующее схеме");
        }
    }
}
