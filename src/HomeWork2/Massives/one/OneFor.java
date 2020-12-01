package HomeWork2.Massives.one;

import java.util.Arrays;
import java.util.Scanner;

public class OneFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:  ");
        int a = scanner.nextInt();     // Размер массива
        int[] arr = new int [a];       // Объявляем массив размером а
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < arr.length; i++) {
            arr [i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
//Вывести все элементы в консоль. Элементы массива вводить через консоль.
// Массив хранит в себе числа. Выводить при помощи: for