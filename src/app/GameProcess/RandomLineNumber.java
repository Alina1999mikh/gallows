package app.GameProcess;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RandomLineNumber {
    private static int linesCount = 0;

    static String getWordFromFile(int difficulty) {
        String getWord;
        List<String> listOfWords = new ArrayList<>();
        try (FileReader file = new FileReader(".\\src\\app\\BaseWords\\" + difficulty + ".txt")
        ) {
            Scanner getLineWord = new Scanner(file);
            while (getLineWord.hasNextLine()) {
                String lineWord = getLineWord.nextLine();
                listOfWords.add(lineWord);
                linesCount++;
            }
            int lineWord = (int) (Math.random() * linesCount);
            getWord = listOfWords.get(lineWord);
        } catch (IOException ex) {
            throw new IllegalArgumentException("File can't be open!");
        }
        return getWord;
    }
}