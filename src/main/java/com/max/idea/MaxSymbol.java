package com.max.idea;
import java.util.*;

public class MaxSymbol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Введите количество строк: ");
        n = input.nextInt();
        input.nextLine(); //строка для исправления бага с отрезанием последней строки после nextInt
        String[] array = new String[n];
        System.out.println("Введите строки");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextLine();
        }

        int[] difChar = new int[n];

        for (int i = 0; i < n; i++) {
            Set uniqueChars = new HashSet();
            for (int x = 0; x < array[i].length(); x++) {
                uniqueChars.add(array[i].charAt(x));
            }
            difChar[i] = uniqueChars.size();
        }

        int max = difChar[0];
        int maxNumber = 0;
        for (int i = 1; i < array.length; i++) {
            if (difChar[i] > max) {
                max = difChar[i];
                maxNumber = i;
            }
        }
        System.out.println(array[maxNumber]);
    }
}
