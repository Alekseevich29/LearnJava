package home_work_6.PartTwo;

import home_work_6.ChoiceWordForBooksUtils;
import home_work_6.ISearchEngine;
import home_work_6.RegExSearch;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class ChoiceFilesIn100BooksWithThreds {
    public static final String RESULT_FILE = "result.txt";
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Scanner scanner1 = new Scanner(System.in);
        ISearchEngine searchEngine = new RegExSearch();

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
                        for (File file : txtFiles) {
                            SearchFJP task = new SearchFJP(file, word, searchEngine);
                            forkJoinPool.execute(task);
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
