package home_work_6.MainClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SearchWords {

    public static void main(String[] args) {
        String nameFiles = "Война и мир_книга.txt";
        System.out.println(SearchWords.readFilesWords(nameFiles));

        HashMap<String,Integer> resultWords = new HashMap<>();

      try (BufferedReader myFile = new BufferedReader(new FileReader(nameFiles))){
            String allStr;
            while ((allStr = myFile.readLine())!=null){
                String [] str = allStr.split("\\s+");
                for (String word : str) {
                    word = word.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
                    if (!word.isEmpty()) {
                        resultWords.put(word.toLowerCase(), resultWords.getOrDefault(word.toLowerCase(), 0) + 1);
                    }
                }
            }

            List<Map.Entry<String,Integer>> sortMap = new ArrayList<>(resultWords.entrySet());
            sortMap.sort((first,second) -> second.getValue().compareTo(first.getValue()));
            for (int j = 0; j < Math.min(10,sortMap.size()); j++) {
                Map.Entry<String, Integer> entry = sortMap.get(j);
                System.out.println(entry.getKey() + " - " + entry.getValue() + " раз");
            }
        }
        catch(IOException exp){
            System.out.println(exp.getMessage());
        }
    }

    public static String readFilesWords (String nameFile){
        HashSet<String> allWords = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader myFile = new BufferedReader(new FileReader("Война и мир_книга.txt"))){
            String all;

           while ( (all = myFile.readLine())!=null){
               String[] wordsSet = all.split("\\s+");

               for (String word : wordsSet) {
                   word = word.replaceAll("[^a-zA-Zа-яА-Я]", "");
                   if (!word.isEmpty()) {
                       stringBuilder.append(word);
                   }
                   allWords.add(stringBuilder.toString());
               }

           }

        }
        catch(IOException exp){
            System.out.println(exp.getMessage());
        }
        int count=0;
        for (String word : allWords){
           count += 1;
        }
             return  "Количество слов = "+ count;
    }
}
