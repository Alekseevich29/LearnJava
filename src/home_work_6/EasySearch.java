package home_work_6;

public class EasySearch implements ISearchEngine{
    @Override
    public long search(String text, String word) {
        int indexSearch = text.indexOf(word);
        int result = 0;
        while (indexSearch != -1) {
            result++;
            indexSearch = text.indexOf(word, indexSearch + 1);
        }

        return result;
    }
}
