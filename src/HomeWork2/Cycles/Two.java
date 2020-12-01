package HomeWork2.Cycles;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String chislo = scanner.nextLine();
        int b = 1;
        int c;

        System.out.println();
        for (int i = 0; i < chislo.length(); i++) {
            c = chislo.charAt(i) - '0';
            System.out.print(c + " ");
            b = b * c;
            if (i != chislo.length() -1){
                System.out.print("*" + " ");
            }
        }
        System.out.println(" " + "=" + " " + b);
    }
}
//Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
// Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * …. * 5 = ответ



