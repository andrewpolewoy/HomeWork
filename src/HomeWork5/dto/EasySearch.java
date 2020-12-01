package HomeWork5.dto;

public class EasySearch implements ISearchEngine {
    /**
     * Метод, который ищет строки word в строке text
     * @param text строка в которой ищем
     * @param word строка для поиска
     * @return количество, котрое word встречается в text
     */
    public  long search(String text, String word) {
        int lastPos = -1;
        long count = 0;
        while (true) {
            lastPos = text.indexOf(word, lastPos + 1);
            if (lastPos < 0) break;
            ++count;
        }
        return count;
    }
}
