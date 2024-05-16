package home_work_6.Decorators;

import home_work_6.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    protected final  ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine decoratedSearchEngine) {
        this.iSearchEngine = decoratedSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = text.replaceAll("[^a-zA-Zа-яА-Я\\s]", "");
        text = text.replaceAll("\\s+", " ").trim();
        return  iSearchEngine.search(text,word);
    }
}
