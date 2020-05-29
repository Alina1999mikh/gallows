package GameProcess;

import model.Word;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Round {

    private int live = 6;
    private Set<Character> usedWord = new HashSet<>();
    private Word word;

    public Round(String inputWord) {
        this.word = new Word(inputWord, 1, inputWord.length() - 1);
    }

    public void process() {
        System.out.println(word.toString());
        while (!word.getStructureWord().isEmpty() && live > 0) {
            System.out.println("j " + word.getStructureWord().toString());
            char inputSymbol = input();
            strokeProcessing(inputSymbol);
            System.out.println(word.toString());
            System.out.println(usedWord.toString());
        }
    }

    private void strokeProcessing(char inputSymbol) {
        if (!putSymbol(inputSymbol)) {
            live--;
            System.out.println("Bad symbol! live= " + live);
        } else System.out.println("Good symbol!");
    }

    private char input() {
        while (true) {
            System.out.println("input char");
            Scanner scanner = new Scanner(System.in);
            char inputSymbol = scanner.next().charAt(0);
            if (usedWord.add(inputSymbol)) return inputSymbol;
            else System.out.println("Символ уже был");
        }
    }

    private boolean putSymbol(char key) {
        ArrayList<Integer> map = word.getStructureWord().get(key);
        if (map != null) {
            for (Integer i : map) {
                word.setGuessSymbol(i, key);
            }
            word.deleteStructureWord(key);
            return true;
        }
        return false;
    }
}