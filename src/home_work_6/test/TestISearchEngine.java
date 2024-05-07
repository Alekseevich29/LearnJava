package home_work_6.test;

import home_work_6.EasySearch;
import home_work_6.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestISearchEngine {
    EasySearch easySearch = new EasySearch();
    String text1 = "Простой текст для поиска любого слова которое мы хотим и которое есть в данном тексте и текст всегда всегда будет текст";
    String text2 = "Мама мыла раму";
    String word = "тексте";
    long resultTest = easySearch.search(text1,word);
    @Test
    public void testEasySearch() {
        Assertions.assertEquals(1,resultTest);
        Assertions.assertEquals(1,easySearch.search(text2, "мыл")); //простой поиск без регулярных выражений
        Assertions.assertEquals(0, easySearch.search(text1, "Слова"));
        Assertions.assertEquals(4, easySearch.search(text1, "текст"));
        Assertions.assertEquals(0, easySearch.search(text1, "ТЕКСТ"));
    }

}
