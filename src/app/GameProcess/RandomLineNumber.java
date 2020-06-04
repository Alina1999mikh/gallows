package app.GameProcess;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomLineNumber {
    private static int linesCount = 0;

    public static String getWordFromFile(int difficulty) throws IOException {
        String getWord = null;
        List<String> listOfWords=new ArrayList<String>();
        try (FileReader getWordFromFile = new FileReader(".\\src\\app\\BaseWords\\" + difficulty + ".txt");
        ) {
            Scanner getLineWord = new Scanner(getWordFromFile);
            while (getLineWord.hasNextLine()) {
                String lineWord=getLineWord.nextLine();
                listOfWords.add(lineWord);
                linesCount++;
            }
            int lineWord = (int) (Math.random() * linesCount) + 0;
            getWord=listOfWords.get(lineWord);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        return getWord;
    }
}
