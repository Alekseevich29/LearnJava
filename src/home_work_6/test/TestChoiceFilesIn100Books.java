package home_work_6.test;

import home_work_6.MainClass.ChoiceFilesIn100Books;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// из за точки входа не уверен что стоит все это тестировать. проверял работу через дебаг.

public class TestChoiceFilesIn100Books {
    String nameFiles = "Kreyg_Viktor_Psevdo.txt";
    String directory = "D:\\java_lern\\books";
    File newfile = new File(nameFiles);

    @Test
    public void testwriteResult() throws IOException {

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
