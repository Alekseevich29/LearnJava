package home_work_6.MainClass;

import com.sun.source.tree.IfTree;
import home_work_2.utils.SortsUtils;
import home_work_6.ChoiceWordForBooksUtils;

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

        List <File> txtFiles = ChoiceWordForBooksUtils.getTxtFiles(directory);
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
                    int countWord = ChoiceWordForBooksUtils.searchWordInFile(selectedFile,word);
                    System.out.println("Слово - "+word+" найдено " + countWord+" раз");
                    ChoiceWordForBooksUtils.writeResult(selectedFile.getName(),word,countWord);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

}
