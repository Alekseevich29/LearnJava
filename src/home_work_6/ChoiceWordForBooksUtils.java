package home_work_6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static home_work_6.MainClass.ChoiceFilesIn100Books.RESULT_FILE;

public class ChoiceWordForBooksUtils {

    public static List<File> getTxtFiles (File directory){
        List <File> txtFiles = new ArrayList<>();
        File [] files = directory.listFiles();
        if (files != null){
            for (File file : files){
                if (file.isFile() && file.getName().endsWith(".txt")){
                    txtFiles.add(file);
                }
            }
        }
        return txtFiles;
    }

    public static  int searchWordInFile (File file, String word) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine())!=null){
                String [] allwords = line.split("\\s+");
                for(String wrd: allwords){
                    if (wrd.equalsIgnoreCase(word)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void writeResult (String fileName, String word, int count) throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RESULT_FILE, true))){
            writer.write(fileName + " : "+word+" : "+count + "\n ");
        }
    }
}
