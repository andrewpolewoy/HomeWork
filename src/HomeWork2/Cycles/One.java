package HomeWork2.Cycles;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int chislo = scanner.nextInt();
        int x = chislo +1;
        int b = 1;
        System.out.print(b);
        for (int i = 2; i < x; i++) {
            System.out.print(" " + "*" + " " + i);
            b = b * i;
        }
        System.out.println(" " + "=" + " " + b);
    }
}

// 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
// Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ