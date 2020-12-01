package HomeWork6;

import HomeWork6.dto.CallableSearch;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ThreadMain1 {

    public static void main(String[] args) {
         final List<String> wordsFind = new ArrayList<>();
         final List<String> pieces = new ArrayList<>();
         wordsFind.add("война");
         wordsFind.add("и");
         wordsFind.add("мир");
         String separator = File.separator;
         try (BufferedReader reader = new BufferedReader(new FileReader(new File("HomeWork" + separator + "resources" + separator + "Vojna i mir book.txt")))) {
//            String line = reader.readLine();

            String piece1 = piece(reader);
            String piece2 = piece(reader);
            String piece3 = piece(reader);
            String piece4 = piece(reader);
            String piece5 = piece(reader);
//            piece(reader);
            pieces.add(piece1);
            pieces.add(piece2);
            pieces.add(piece3);
            pieces.add(piece4);
            pieces.add(piece5);

            for (String word : wordsFind) {
                ExecutorService executor = Executors.newFixedThreadPool(5);
                List<Future<Long>> futures = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    Future<Long> submit = executor.submit(new CallableSearch(pieces.get(i), word));
                    futures.add(submit);
                }

                long result = 0L;
                while (futures.size() > 0) {
                    Iterator<Future<Long>> iterator = futures.iterator();
                    while (iterator.hasNext()) {
                        Future<Long> future = iterator.next();
                        if (future.isDone()) {
                            try {
                                result += future.get();
                                iterator.remove();
                            } catch (InterruptedException | ExecutionException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                System.out.println(word + " встречается " + result + " раз");
                executor.shutdown();
            }
        }catch(Exception e){
                e.printStackTrace();
            }
        }


    /**
     * Метод, который берет кусок текста из большого текста и преобразует в строку
     * @param reader текст целиком
     * @return строку текста
     */
    private static String piece(BufferedReader reader) throws IOException {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < 1543; i++) {
            buffer.append(reader.readLine()).append(" ");
        }
 //       System.out.println(buffer.toString());
        return buffer.toString();
    }

}
