package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Word {
    private Map<Character, ArrayList<Integer>> structureWord = new HashMap<>();
    private static final char CLOSE_SYMBOL = '?';
    private char[] guessSymbol;
    private char[] openWord;

    public Word(String inWord, int left, int right) {
        this.guessSymbol = new char[inWord.length()];
        openWord = inWord.toCharArray();
        openExtreme(left, right);
        createStructureWord(inWord, left, right);
        Arrays.fill(guessSymbol, left, right, CLOSE_SYMBOL);
    }

    public Word(String inWord) {
        this(inWord,0,inWord.length());
    }

    private void createStructureWord(String inWord, int left, int right) {
        char[] massiveWord = inWord.toCharArray();
        for (int i = left; i < right; i++) {
            if (massiveWord[i] != CLOSE_SYMBOL) {
                ArrayList<Integer> index = new ArrayList<>();
                char s = massiveWord[i];
                for (int j = i; j < right; j++) {
                    if (s == massiveWord[j]) {
                        index.add(j);
                        massiveWord[j] = '?';
                    }
                }
                this.structureWord.put(s, index);
            }
        }
    }

    private void openExtreme(int left, int right) {
        for (int i = 0; i < left; i++) {
            setGuessSymbol(i, openWord[i]);
        }
        for (int i = right; i < size(); i++) {
            setGuessSymbol(i, openWord[i]);
        }
    }

    public Map<Character, ArrayList<Integer>> getStructureWord() {
        return structureWord;
    }

    public void deleteStructureWord(Character key) {
        structureWord.remove(key);
    }

    public void setStructureWord(Map<Character, ArrayList<Integer>> structureWord) {
        this.structureWord = structureWord;
    }

    public char closeSymbol() {
        return CLOSE_SYMBOL;
    }

    public char[] getGuessSymbol() {
        return guessSymbol;
    }

    public void setGuessSymbol(int index, char symbol) {
        this.guessSymbol[index] = symbol;
    }

    public int size() {
        return openWord.length;
    }

    @Override
    public String toString() {
        return "Word{" +
                Arrays.toString(guessSymbol) +
                '}';
    }
}