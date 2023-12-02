package com.max.idea;

public class Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println("Первоначальный вид массива:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + nums[i] + " ");
        }
        System.out.println();

        int last = nums[nums.length-1];
        nums[nums.length-1] = nums[0];
        nums[0] = last;
        System.out.println("Вид массива после перемены мест первого и последнего элементов:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + nums[i] + " ");
        }

        System.out.println();
        int sum = nums[0] + nums[nums.length/2]; //Использовано деление на 2, т.к. массив в условии с нечетной length, при делении остаток отбросится и получим индекс нужного элемента
        System.out.println("Результат суммы первого и среднего элемента: " + sum);

    }
}
