import java.util.Arrays;
import java.util.Scanner;

class Round {
    private char[] symbol;
    private char[] word;
    private int live = 6;
    private char closeSymbol = '-';

    Round(String word) {
        symbol = new char[word.length()];
        this.word = word.toCharArray();
        Arrays.fill(symbol, closeSymbol);
    }

    void process() {
        while (checkAvailable(closeSymbol) && live > 0) {
            System.out.println("input char");
            Scanner scanner = new Scanner(System.in);
            char inputSymbol = scanner.next().charAt(0);
            System.out.println("Your symbol" + inputSymbol);
            if (!putSymbol(inputSymbol)) {
                live--;
                System.out.println("Bad symbol! live= " + live);
            } else System.out.println("Good symbol!");
            System.out.println(Arrays.toString(symbol));
        }
    }

    private boolean putSymbol(char key) {
        boolean flag = false;
        for (int i = 0; i < symbol.length; i++) {
            if (word[i] == key) {
                flag = true;
                symbol[i] = key;
            }
        }
        return flag;
    }

    private boolean checkAvailable(char key) {
        for (char c : symbol) {
            if (c == key) {
                return true;
            }
        }
        return false;
    }
}