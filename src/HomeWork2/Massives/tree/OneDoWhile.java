package HomeWork2.Massives.tree;
import java.util.Arrays;
import java.util.Scanner;

public class OneDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:  ");
        int a = scanner.nextInt();     // Размер массива
        int[] arr = new int [a];       // Объявляем массив размером а
        int n = 0;                     // Инициализируем переменную для обращения к элементам массива
        System.out.println("Введите элементы массива: ");
        do {
            arr [n] = scanner.nextInt();
            n++;
        }while (n < a);

        int i = arr.length -  1;
        do {
            System.out.print(arr[i] + " ");
            i--;
        }while (i >= 0);
    }
}
//Вывести все элементы в консоль. Элементы массива вводить через консоль.
// Массив хранит в себе числа. Выводить при помощи: do....while