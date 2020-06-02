package app.GameProcess;

import app.model.Symbol;
import app.model.Word;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Round {

    private int life = 6;
    private Set<Character> use = new HashSet<>();
    private Word word;

    public Round(String inWord) {
        word = new Word(inWord);
    }

    public void process() {
        openExtreme();
        while (!isSolvedWord() && life > 0) {
            System.out.println("life " + life);
            System.out.println(word.toString());
            char in = input();
            if (!openEntrySymbol(in)) life--;
        }
        System.out.println(word.toString());
    }

    private char input() {
        while (true) {
            System.out.println("input char");
            Scanner scanner = new Scanner(System.in);
            char inputSymbol = scanner.next().charAt(0);
            if (use.add(inputSymbol)) return inputSymbol;
            else System.out.println("Символ уже был");
        }
    }

    private void openSymbol(Symbol symbol) {
        symbol.setView(true);
    }

    private boolean openEntrySymbol(char in) {
        boolean flag = false;
        for (Symbol symbol : word.getWord()) {
            if (symbol.getCharacter() == in) {
                openSymbol(symbol);
                flag = true;
            }
        }
        return flag;
    }

    private void openExtreme() {
        openEntrySymbol(word.getWord().get(0).getCharacter());
        openEntrySymbol(word.getWord().get(word.size() - 1).getCharacter());
        use.add(word.getWord().get(0).getCharacter());
        use.add(word.getWord().get(word.size() - 1).getCharacter());
    }

    private boolean isSolvedWord() {
        for (Symbol symbol : word.getWord()) {
            if (!symbol.isView()) return false;
        }
        return true;
    }

    int life() {
        return life;
    }

    Word getWord() {
        return word;
    }
}