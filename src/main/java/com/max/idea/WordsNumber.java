package com.max.idea;

import java.util.Scanner;

public class WordsNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        int count = 0;

        System.out.println("Введите строку из слов, разделенных пробелами: ");
        str = input.nextLine();
        str = str.trim();
        String[] strArray = str.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            boolean result = strArray[i].matches("[A-Za-z]+");
                if (result == true) {
                    System.out.println(strArray[i]);
                    count++;
                }
            }
        System.out.println("Отобрано " + count + " слов(a), которые содержат только латиницу");
        }
}
