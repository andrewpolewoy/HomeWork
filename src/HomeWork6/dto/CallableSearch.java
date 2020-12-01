package HomeWork6.dto;

import HomeWork5.dto.EasySearch;
import HomeWork5.dto.ISearchEngine;

import java.util.concurrent.Callable;

public class CallableSearch implements Callable<Long> {
    private final String text;
    private final String word;


    public CallableSearch(String textCall, String wordCall){
        this.text = textCall;
        this.word = wordCall;
    }

//    ISearchEngine search1 = new ISearchEngine() {
//        @Override
//        public long search(String textSearch, String wordSearch) {
//            EasySearch countWord = new EasySearch();
//            long count = countWord.search(textSearch.toLowerCase(), wordSearch.toLowerCase());
//            return count;
//        }
//    };

    ISearchEngine search1 = (textSearch, wordSearch) -> {
        EasySearch countWord = new EasySearch();
        long count = countWord.search(textSearch.toLowerCase(), wordSearch.toLowerCase());
        return count;
    };

    @Override
    public Long call() throws Exception {
        return search1.search(this.text, this.word);
    }

}


