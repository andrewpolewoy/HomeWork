package HomeWork1;
import java.util.Scanner;
import java.util.Objects;

public class If {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String yourName = in.nextLine();
        in.close();
        final String friendName = "Вася";
        final String girlName = "Анастасия";

        boolean isFriend = Objects.equals(friendName, yourName);
        boolean isGirlfriend = Objects.equals(girlName, yourName);

        if (isFriend) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }

        if (isGirlfriend) {
            System.out.println("Я тебя так долго ждал");

        }
        if (!isFriend && !isGirlfriend) {
            System.out.println("Добрый день, а вы кто?");

        }
    }
}