package Dictionary.dictionary;

import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {
    private Map<String, String> dictionary;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }
    }

    public String translate(String word) {
        return dictionary.get(word);
    }
}
