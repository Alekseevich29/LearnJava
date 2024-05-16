package home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSearchEngineWithRegex implements ISearchEngine{
    @Override
    public long search(String text, String word) {
        long counter = 0;
        Pattern pattern = Pattern.compile("\\b" + word + "\\b",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            counter++;
        }
        return  counter;
    }
}
