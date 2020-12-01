package HomeWork5;

import HomeWork5.dto.EasySearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VojnaIMirMain2 {
    public static void main(String[] args) {

        String word1 = "война";
        String word2 = "и";
        String word3 = "мир";

        countWord(word1);
        countWord(word2);
        countWord(word3);

    }
    public static void countWord(String word){
        String separator = File.separator;
        long count = 0;
        long finalCount = 0;

        try{
            File f = new File("HomeWork" + separator + "resources" + separator + "Vojna i mir book.txt");
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line = reader.readLine();
            EasySearch countWord = new EasySearch();

            while (line != null){
                count = countWord.search(line.toLowerCase(),word.toLowerCase());
                finalCount += count;
                line = reader.readLine();
            }
            System.out.println(word + " " + finalCount + " раз");

        }catch (IOException | NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
}


