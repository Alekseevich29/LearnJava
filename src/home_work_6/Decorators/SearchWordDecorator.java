package home_work_6.Decorators;

import home_work_6.ISearchEngine;
import home_work_6.RegExSearch;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchWordDecorator implements ISearchEngine {
    protected final ISearchEngine searchWord ;

    public SearchWordDecorator (ISearchEngine searchWord){
       // boolean isIsearchEngine = searchWord instanceof RegExSearch;
                this.searchWord = searchWord;
    }

    @Override
    public long search(String text, String word) {
        String textAll = text.toLowerCase();
        String wordNeed = word.toLowerCase();

        return searchWord.search(textAll,wordNeed);
    }
}
