package Model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private final Map<String, String> wordMeanings;

    public Dictionary() {
        wordMeanings = new HashMap<>();
    }


    public void addWord(String word, String meaning) {
        wordMeanings.put(word.toLowerCase(), meaning);
    }

    public String searchWord(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Word cannot be empty.");
        }
        return wordMeanings.getOrDefault(word.toLowerCase(), "Word not found.");
    }
}
