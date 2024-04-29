package Controller;

import Model.Dictionary;

public class DictionaryController {
    private final Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();
        populateDictionary();
    }

    private void populateDictionary() {
        dictionary.addWord("Metropolia", "University of Applied Sciences");
        dictionary.addWord("Helsinki", "Capital of Finland");
        dictionary.addWord("Dictionary", "A reference resource containing words meanings.");
    }

    public String searchWord(String word) {
        return dictionary.searchWord(word);
    }
}
