package home_work_6.test;

import home_work_6.MainClass.ChoiceFilesIn100Books;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Тестирую только 2 метода. Так как есть точка входа решил только методы протестировать.

public class TestChoiceFilesIn100Books {
    String nameFiles = "Kreyg_Viktor_Psevdo.txt";
    String directory = "D:\\java_lern\\books";
    File newfile = new File(nameFiles);


    @Test
    public void testsearchWordInFile() throws IOException {
        assertEquals(9,ChoiceFilesIn100Books.searchWordInFile(newfile,"мир"));
    }

    @Test
    public void testwriteResult() throws IOException {

        ChoiceFilesIn100Books.writeResult(nameFiles, "СОКОЛ", 5);

        StringBuilder file = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(ChoiceFilesIn100Books.RESULT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                file.append(line).append("\n");
            }
        }
        String expected = "Kreyg_Viktor_Psevdo.txt : СОКОЛ : 11\n";
        assertEquals(expected, file.toString());
    }

}
