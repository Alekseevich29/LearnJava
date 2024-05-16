package home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine{
    @Override
    public long search(String text, String word) {
        long counter = 0;
        Pattern patern = Pattern.compile("\\b" + word +"\\b" ,Pattern.CASE_INSENSITIVE);
        Matcher matcher = patern.matcher(text);

        while (matcher.find()){
            counter ++;
        }
        return counter;
    }
}
