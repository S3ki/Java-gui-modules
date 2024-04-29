package Controller;

import Model.Dictionary;

public class DictionaryController {
    private final Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();
        populateDictionary(); // Add some default words
    }

    // Function to add words to the dictionary
    private void populateDictionary() {
        dictionary.addWord("Java", "A high-level programming language.");
        dictionary.addWord("Python", "An interpreted, high-level, general-purpose programming language.");
        dictionary.addWord("Dictionary", "A reference resource containing a list of words and their meanings.");
    }

    // Method to search for a word and retrieve its meaning
    public String searchWord(String word) {
        return dictionary.searchWord(word);
    }
}
