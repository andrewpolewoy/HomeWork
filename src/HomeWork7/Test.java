package HomeWork7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.print("Введите путь сохраняемого файла: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        try(BufferedWriter out = new BufferedWriter(new FileWriter(new File(path + "kurs.txt" )))) {
            NBRBLoader loader = new NBRBLoader();
            out.write("EUR " + loader.load(SiteLoader.Currency.EUR) + "\n");
            out.write("RUB " + loader.load(SiteLoader.Currency.RUB) + "\n");
            out.write("USD " + loader.load(SiteLoader.Currency.USD) + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printRates(SiteLoader loader){
        System.out.println();
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
        System.out.println(loader.load(SiteLoader.Currency.USD));
    }


}
