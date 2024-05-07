package home_work_6;

public class WordSearchEngine implements ISearchEngine{
    @Override
    public long search(String text , String word) {
        long resultWar = 0;
        long resulAnd = 0;
        long resulWorld = 0;
        long resultLocatedWord = 0;
        String [] arrWord = text.split(" +");

            for (String worldSeard:arrWord) {
                if (worldSeard.equals("война")){
                    resultWar+=1;
                }
                if (worldSeard.equals("И")){
                    resulAnd+=1;
                }
                if (worldSeard.equals("мир")){
                    resulWorld+=1;
                }
            }
            resultLocatedWord = resultWar + resulAnd + resulWorld;
            return  resultLocatedWord;
    }
}
