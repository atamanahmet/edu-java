package Dictionary;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        List<String> lines = new ArrayList<>();
        try {
            Files.lines(Paths.get(this.file))
                    .forEach(line -> lines.add(line));
            for (int i = 0; i < lines.size(); i++) {
                String[] bufferArray = lines.get(i).split(":");
                this.add(bufferArray[0], bufferArray[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    public boolean save() {
        try {
            FileWriter fileWriter = new FileWriter(file);
            List<String> keys = new ArrayList<>();
            String[] keyArray = dictionary.keySet().toArray(new String[dictionary.size()]);
            String[] valueArray = dictionary.values().toArray(new String[dictionary.size()]);
            String bufferStringLine = "";
            for (int i = 0; i < keyArray.length; i++) {
                if (!bufferStringLine.contains(keyArray[i]) || !bufferStringLine.contains(valueArray[i])) {
                    bufferStringLine += keyArray[i] + ":" + valueArray[i] + "\n";
                }
            }
            // System.out.println(bufferStringLine);
            fileWriter.write(bufferStringLine);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public void add(String word, String translation) {
        if (dictionary == null || dictionary.isEmpty() || !dictionary.containsKey(word)) {
            dictionary.put(word, translation);
            if (!dictionary.containsKey(translation)) {
                dictionary.put(translation, word);
            }
        }
    }

    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(dictionary.get(word));
            dictionary.remove(word);

        }
    }

    public String translate(String word) {
        return dictionary.get(word);
    }
}
