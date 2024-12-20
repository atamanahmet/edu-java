import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();

    }

    public void add(String word, String translation) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.get(word).add(translation);
        } else {
            this.dictionary.put(word, new ArrayList<>());
            this.dictionary.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else {
            this.dictionary.put(word, new ArrayList<>());
            return this.dictionary.get(word);
        }

    }

    public void remove(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
    }
}
