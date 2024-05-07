package home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSearchEngineWithRegex implements ISearchEngine{
    @Override
    public long search(String text, String word) {

        Pattern pattern = Pattern.compile("\\b" + word + "\\b",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        long counter = 0;
        while (matcher.find()){
            counter++;
        }

        return  counter;
    }
}
