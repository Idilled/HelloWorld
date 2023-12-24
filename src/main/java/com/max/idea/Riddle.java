package com.max.idea;

import java.util.Random;
import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] hint = {"Связано с архивом", "Некий вирус", "За...й в...с", "Счастливая подсказка: заархивированный в..."};
        String result = "Заархивированный вирус";
        String answer;
        System.out.println("Напишите ответ на загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слёзы проливает");
        System.out.println("У вас есть три попытки. При первой попытке доступна подсказка, чобы ее получить, введите \"Подсказка\"");
        boolean useHint = false;
        int i;
        for (i = 1; i <4; i++) {
            System.out.println("Попытка № " + i);
            answer = input.nextLine();
            if (i == 1 & answer.equalsIgnoreCase("Подсказка") & !useHint) {
                useHint = true;
                Random r = new Random();
                System.out.println(hint[r.nextInt(hint.length)]);
                i--;
            } else if (i == 1 & useHint & (answer.equalsIgnoreCase("Подсказка") | !answer.equals(result))) {
                System.out.println("Обидно, приходи в другой раз");
                break;
            } else if (i != 1 & answer.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
                i--;
            } else if (answer.equalsIgnoreCase(result)) {
                System.out.println("Правильно!");
                break;
            } else if (answer.equals("")) {
                System.out.println("Упс! Вы ничего не ввели. Великодушно предлагаем повторить попытку");
                i--;
            } else if ((i == 1 | i == 2) & (!answer.equals(result) | !answer.equals("Подсказка") | !answer.equals("")) & !useHint) {
                System.out.println("Подумай ещё!");
            } else if ((i == 3) & (!answer.equals(result))) {
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}
