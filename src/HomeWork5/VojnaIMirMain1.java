package HomeWork5;

import HomeWork5.core.MapComparator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class VojnaIMirMain1 {
    public static void main(String[] args) {
        int count = 0;
        Set<String> collection = new HashSet<>();
        Map<String, Integer> wordsCount = new TreeMap<>();
        String separator = File.separator;

        try(BufferedReader reader = new BufferedReader(new FileReader(new File("HomeWork" + separator + "resources" + separator + "Vojna i mir book.txt")))){
            String line = reader.readLine();

            while (line != null){
                line = line.replaceAll("[^а-яА-ЯёЁ]"," ");
                for (String word : line.split("\\s+")) {
                    if(!word.isEmpty()){
                        collection.add(word);
                        if (!wordsCount.containsKey(word)){
                            wordsCount.put(word,0);
                        }
                        wordsCount.put(word,wordsCount.get(word) + 1);
                    }
                }
                line = reader.readLine();
            }
        }catch (IOException | NullPointerException e){
            System.out.println(e.getMessage());
        }

        Map<String, Integer> newMap = new TreeMap(new MapComparator(wordsCount));
        newMap.putAll(wordsCount);

        Set<String> keyMap = newMap.keySet();
        for (String key : keyMap) {
            if (count < 10){
                System.out.println(key + " - " + newMap.get(key) + "раз");
            }
            count++;
        }
    }
}
