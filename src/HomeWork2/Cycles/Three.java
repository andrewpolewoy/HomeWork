package HomeWork2.Cycles;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое мы будем возводить: ");
        double chislo = scanner.nextDouble();
        System.out.println("Введите число, в которое мы будем возводить: ");
        int stepen = scanner.nextInt();
        double a = chislo;

        for (int i = 1; i <= stepen; i++) {
            a = a * chislo;
        }
        System.out.println(a);
    }
}

//Возведение в степень. Через консоль пользователь вводит два числа.
// Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число.
// Степень - только положительная и целая. Возводимое число - может быть отрицательным и дробным. Math использовать нельзя.