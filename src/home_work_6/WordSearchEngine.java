package home_work_6;

public class WordSearchEngine implements ISearchEngine{
    @Override
    public long search(String text , String word) {
        long resultWar = 0;
        String [] arrWord = text.split(" +");

            for (String worldSeard:arrWord) {
                String cleanedWord = worldSeard.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
                if (cleanedWord.equals(word.toLowerCase())){
                    resultWar+=1;
                }
            }
            return resultWar;
    }
}
