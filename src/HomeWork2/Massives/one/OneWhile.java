package HomeWork2.Massives.one;

import java.util.Arrays;
import java.util.Scanner;

public class OneWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:  ");
        int a = scanner.nextInt();     // Размер массива
        int[] arr = new int [a];       // Объявляем массив размером а
        int n = 0;                     // Инициализируем переменную для обращения к элементам массива
        System.out.println("Введите элементы массива: ");

        while (n < a){
            arr [n] = scanner.nextInt();
            n++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
//Вывести все элементы в консоль. Элементы массива вводить через консоль.
// Массив хранит в себе числа. Выводить при помощи: while
