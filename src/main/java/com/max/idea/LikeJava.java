package com.max.idea;

import java.util.Scanner;
public class LikeJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result;

        System.out.println("Введите код: "); //Код: I like Java!!!
        result = input.nextLine();
        boolean check1 = result.contains("Java");
        boolean check2 = result.startsWith("I like");
        boolean check3 = result.endsWith("!!!");

        if (check1 == true && check2 == true && check3 == true) {
            System.out.println(result.toUpperCase());
            int findJava = result.indexOf("Java");
            System.out.println(result.substring(findJava,findJava+4).replace("a","o"));
        } else {
            System.out.println("Вы ввели неправильный код. Перезапустите программу и попробуйте снова");
        }
    }
}
