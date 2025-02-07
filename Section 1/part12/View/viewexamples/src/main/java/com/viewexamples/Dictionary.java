package com.viewexamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Dictionary {
    private ArrayList<String> words;
    private HashMap<String, String> translations;

    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();

        add("sana", "word");
    }

    public String get(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            this.words.add(word);
        }
        this.translations.put(word, translation);
    }

    public String getRandomWord() {
        Random randomNum = new Random();
        return this.words.get(randomNum.nextInt(this.words.size()));
    }
}
