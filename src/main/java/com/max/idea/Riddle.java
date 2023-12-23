package com.max.idea;

import java.util.Random;
import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] hint = {"Связано с архивом", "Некий вирус", "За...й в...с"};
        String answer;
        System.out.println("Напишите ответ на загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слёзы проливает");
        System.out.println("У вас есть три попытки. При первой попытке доступна подсказка, чобы ее получить, введите \"Подсказка\"");
        boolean useHint = false;
        for (int i = 1; i <4; i++) {
            System.out.println("Попытка № " + i);
            answer = input.nextLine();
            if (i == 1 & answer.equalsIgnoreCase("Подсказка")) {
                Random r = new Random();
                System.out.println(hint[r.nextInt(3)]);
                useHint = true;
            } else if (i != 1 & answer.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
            } else if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            } else if ((i == 1 | i == 2) & (!answer.equals("Заархивированный вирус") | !answer.equals("Подсказка")) & !useHint) {
                System.out.println("Подумай ещё!");
            } else if (i == 2 & useHint) {
                System.out.println("Обидно, приходи в другой раз");
                break;
            } else if ((i == 3) & (!answer.equals("Заархивированный вирус"))) {
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}
