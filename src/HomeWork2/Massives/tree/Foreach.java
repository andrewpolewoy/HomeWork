package HomeWork2.Massives.tree;

import java.util.Arrays;
import java.util.Scanner;

public class Foreach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:  ");
        int a = scanner.nextInt();     // Размер массива
        int[] arr = new int [a];       // Объявляем массив размером а
        System.out.println("Введите элементы массива: ");
        int n = 0;

        for (int i : arr) {
            arr [n] = scanner.nextInt();
            n++;
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] =  tmp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
//Вывести все элементы в консоль. Элементы массива вводить через консоль.
// Массив хранит в себе числа. Выводить при помощи: foreach