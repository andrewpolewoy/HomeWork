package HomeWork2.Massives.two;

import java.util.Scanner;

public class EverySecond {
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
        for (int i : arr) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        }
    }

//Вывести каждый второй элемент массива в консоль
