package home_work_6.test;

import home_work_6.EasySearch;
import home_work_6.RegExSearch;
import home_work_6.Decorators.SearchWordDecorator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSearchWordDecorator {
    SearchWordDecorator searchWordDecorator = new SearchWordDecorator(new EasySearch());
    SearchWordDecorator searchWordDecoratorRegex = new SearchWordDecorator( new RegExSearch());
    String text2 = "МАМА МаМа мама -мыла- раму и не домыла, а СыН РеШиЛ умыть-все и не умыла- мыло мыльное -!мыла!- +мыла+";
    String text3 = "Сокол соколята соколят хотят продать в сокольную школу. но сокол не хочет соколят отдавать, так как там злой" +
            "сокол учитель, но соколята мешают -соколихе- и сокол принял решение, отдать соколят в школу.";
    @Test
    public void testSearchDecorator4_3() {
        Assertions.assertEquals(3,searchWordDecorator.search(text2,"мама"));
        Assertions.assertEquals(11,searchWordDecorator.search(text3, "СОКОЛ"));
        Assertions.assertEquals(1,searchWordDecoratorRegex.search(text2,"умыла"));
        Assertions.assertEquals(3,searchWordDecoratorRegex.search(text3, "СОКОЛ"));

    }
}
