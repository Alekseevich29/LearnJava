package home_work_6;

public class EasySearch implements ISearchEngine{
    private final static char [] simbolOut = new char[]{' ','!',',','.','-','\n','?',';'};
    @Override
    public long search(String text, String word) {
        int wordLength = word.length();
        int textLength = text.length();
        long result = 0;
        int position = 0;

        while ((position = text.indexOf(word, position)) != -1) {
            int indexNextPositionChar = position + wordLength;
            boolean needCheckBefore = position > 0;
            boolean needCheckAfret  = indexNextPositionChar < textLength;
            boolean simbolBefore = true;
            boolean simbolAfter = true;

            if (needCheckAfret){
                simbolBefore =splitChar(text.charAt(position-1));
            }
            if (needCheckBefore){
                simbolAfter = splitChar(text.charAt(indexNextPositionChar));
            }

            if (simbolBefore && simbolAfter ){
            result++;
            }
            position++;
        }

        return result;
    }

    public boolean splitChar (char ch){
        for (char simbol : simbolOut) {
            if (simbol == ch){
                return true;
            }
        }
        return false;
    }
}
