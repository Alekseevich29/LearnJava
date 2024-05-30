package home_work_6.PartTwo;

import home_work_6.ChoiceWordForBooksUtils;
import home_work_6.ISearchEngine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.RecursiveAction;

public class SearchFJP extends RecursiveAction {
    private final File file;
    private final String word;
    private final ISearchEngine searchEngine;

    public SearchFJP(File file, String word, ISearchEngine searchEngine) {
        this.file = file;
        this.word = word;
        this.searchEngine = searchEngine;
    }

    @Override
    protected void compute() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }
            long count = searchEngine.search(content.toString(), word);
            ChoiceWordForBooksUtils.writeResult(file.getName(), word, count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
