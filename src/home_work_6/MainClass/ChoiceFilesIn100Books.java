package home_work_6.MainClass;

import com.sun.source.tree.IfTree;
import home_work_2.utils.SortsUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChoiceFilesIn100Books {
    public static final String RESULT_FILE = "result.txt";
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

            System.out.println("Укажите путь к папке");
            String directoryPath = scanner1.nextLine();
            File directory = new File(directoryPath);       // Книги лежат D:\java_lern\books.

            if (!directory.exists() || directory.isDirectory()){
                System.out.println("Такой папки не существует");
            }

        List <File> txtFiles = getTxtFiles(directory);
            if (txtFiles.isEmpty()){
                System.out.println("В данной папке нету TXT файлов");
                return;
            }

            try(Scanner scanner = new Scanner(System.in)){
                while(true){
                    System.out.println("Файлы в папке: ");
                    for (int i = 0; i < txtFiles.size(); i++) {
                        System.out.println((i+1) + ". "+ txtFiles.get(i).getName());

                    }
                    System.out.println("Введите номер файла, в котором вы хотите выполнить поиск (0 для выхода):");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    if (choice == 0){
                        System.out.println("Выход из программы");
                        break;
                    }else if (choice < 1 || choice > txtFiles.size()) {
                    System.out.println("Неудачный выбор, цифра больше 0!");
                    continue;
                    }
                    File selectedFile = txtFiles.get(choice-1);
                    System.out.println("Файл: "+ selectedFile.getName());

                    System.out.println("Введите слово которое хотите найти." +
                            "Для выхода из файла в список файлов введите пустую строку");
                    String word = scanner.nextLine().trim();

                    if (word.isEmpty()){
                        System.out.println("Возврат к выбору файла");
                        continue;
                    }
                    int countWord = searchWordInFile(selectedFile,word);
                    System.out.println("Слово - "+word+" найдено " + countWord+" раз");
                    writeResult(selectedFile.getName(),word,countWord);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public static  List<File> getTxtFiles (File directory){
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

    public static  int searchWordInFile (File file, String word) throws IOException{
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
