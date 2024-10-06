package org.example;
// Сумма массива: Напишите метод, который принимает массив целых чисел и возвращает их сумму.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }

        System.out.println(getSum(array) + 10);
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }
}