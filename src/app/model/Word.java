package app.model;

import java.util.ArrayList;
import java.util.List;

public class Word {
    private List<Symbol> word = new ArrayList<>();

    public Word(String inWord) {
        char[] word = inWord.toCharArray();
        for (char i : word) {
            this.word.add(new Symbol(i));
        }
    }

    public List<Symbol> getWord() {
        return word;
    }

    public int size() {
        return word.size();
    }

    @Override
    public String toString() {
        return "Word{" +
                word.toString() +
                '}';
    }
}