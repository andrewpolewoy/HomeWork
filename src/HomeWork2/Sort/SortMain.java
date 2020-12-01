package HomeWork2.Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static HomeWork2.Sort.Sort.bubbleSorter;
import static HomeWork2.Sort.Sort.shakerSort;

public class SortMain {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};   // массив 1
        int[] a1 = {1, 1, 1, 1};       // массив 2
        int[] a2 = {9, 1, 5, 99, 9, 9};  // массив 3
        int[] a3 = {};// массив 4



        System.out.println("Пузырьковая сортировка");
        System.out.println("Массив до сортировки: " + Arrays.toString(a));
        bubbleSorter(a,true);
        System.out.println("Массив после сортировки: " + Arrays.toString(a));
        System.out.println();
        System.out.println("Массив до сортировки: " + Arrays.toString(a1));
        bubbleSorter(a1,true);
        System.out.println("Массив после сортировки: " + Arrays.toString(a1));
        System.out.println();
        System.out.println("Массив до сортировки: " + Arrays.toString(a2));
        bubbleSorter(a2,true);
        System.out.println("Массив после сортировки: " + Arrays.toString(a2));
        System.out.println();
        System.out.println("Массив до сортировки: " + Arrays.toString(a3));
        bubbleSorter(a3,true);
        System.out.println("Массив после сортировки: " + Arrays.toString(a3));
        System.out.println("------------------------------------");
        int[] a4 = new int[] {1, 2, 3, 4, 5, 6};   // массив 1
        int[] a5 = {1, 1, 1, 1};       // массив 2
        int[] a6 = {9, 1, 5, 99, 9, 9};  // массив 3
        int[] a7 = {};              // массив 4
        System.out.println("Шейкерная сортировка");
        System.out.println("Массив до сортировки: " + Arrays.toString(a4));
        shakerSort(a4);
        System.out.println("Массив после сортировки: " + Arrays.toString(a4));
        System.out.println();
        System.out.println("Массив до сортировки: " + Arrays.toString(a5));
        shakerSort(a5);
        System.out.println("Массив после сортировки: " + Arrays.toString(a5));
        System.out.println();
        System.out.println("Массив до сортировки: " + Arrays.toString(a6));
        shakerSort(a6);
        System.out.println("Массив после сортировки: " + Arrays.toString(a6));
        System.out.println();
        System.out.println("Массив до сортировки: " + Arrays.toString(a7));
        shakerSort(a7);
        System.out.println("Массив после сортировки: " + Arrays.toString(a7));
        System.out.println();


        System.out.println("Генератор массива:");
        int[] arrr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arrr.length; i++) {
            arrr[i] = rnd.nextInt();
        }
        System.out.println(Arrays.toString(arrr));
        System.out.println();

        System.out.println("Массив через консоль:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:  ");
        int e = scanner.nextInt();     // Размер массива
        int[] arr = new int [e];       // Объявляем массив размером а
        int n = 0;                     // Инициализируем переменную для обращения к элементам массива
        System.out.println("Введите элементы массива: ");
        do {
            arr [n] = scanner.nextInt();
            n++;
        }while (n < e);
        System.out.println(Arrays.toString(arr));


    }

}
