package app.GameProcess;

import app.model.Word;

import java.util.*;

public class Round {

    private int life = 6;
    private Set<Character> use = new HashSet<>();
    private Word word;

    public Round(String inWord, int left, int right) {
        right=inWord.length()-right;
        this.word = new Word(inWord, left, right);
    }

    public Round(String inWord) {
        this(inWord, 0, 0);
    }

    public void process() {
        System.out.println(word.toString());
        while (!word.getStructureWord().isEmpty() && life > 0) {
            System.out.println("j " + word.getStructureWord().toString());
            char inputSymbol = input();
            strokeProcessing(inputSymbol);
            System.out.println(word.toString());
            System.out.println(use.toString());
        }
    }

    private void strokeProcessing(char inputSymbol) {
        if (!putSymbol(inputSymbol)) {
            life--;
            System.out.println("Bad symbol! life= " + life);
        } else System.out.println("Good symbol!");
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

    private boolean putSymbol(char key) {
        List<Integer> map = word.getStructureWord().get(key);
        if (map != null) {
            for (Integer i : map) {
                word.setGuessSymbol(i, key);
            }
            word.deleteStructureWord(key);
            return true;
        }
        return false;
    }

    int life() {
        return life;
    }

   Word getWord() {
        return word;
    }

    void strokeProcessingTest(char inputSymbol) {
        strokeProcessing(inputSymbol);
    }
}