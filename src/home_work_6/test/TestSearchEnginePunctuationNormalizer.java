package home_work_6.test;

import home_work_6.RegExSearch;
import home_work_6.Decorators.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSearchEnginePunctuationNormalizer {
    SearchEnginePunctuationNormalizer sEPonNormal = new SearchEnginePunctuationNormalizer(new RegExSearch());
    String text2 = "Мама мыла раму";
    String text3 = "Сокол соколята соколят хотят продать в сокольную школу. но сокол не хочет соколят отдавать, так как там злой" +
            "сокол учитель, но соколята мешают -соколихе- и сокол принял решение, отдать соколят в школу.";
    @Test
    public void testSearchDecorator4_3() {
        Assertions.assertEquals(0,sEPonNormal.search(text2,"мыл"));
        Assertions.assertEquals(2,sEPonNormal.search(text3, "сокол"));
        Assertions.assertEquals(3,sEPonNormal.search(text3, "соколят"));
        Assertions.assertEquals(0,sEPonNormal.search(text3, "решение,"));
        Assertions.assertEquals(0,sEPonNormal.search(text3, "-соколихе-"));
    }


}
