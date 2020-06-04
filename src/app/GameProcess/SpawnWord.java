package app.GameProcess;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpawnWord {

   public static int dataBase() throws IOException {
        System.out.println("Choose game difficulty, enter: 1 - easy, 2 - normal, 3 - hard");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int difficulty = Integer.parseInt(rd.readLine());
        while (true) {
            if ((difficulty > 3) || (difficulty < 1)) {
                System.out.println("Difficulty  is entered incorrectly, try again");
                difficulty = Integer.parseInt(rd.readLine());
            } else break;
        }
        File dataBaseFileEasy = new File(".\\src\\app\\BaseWords\\1.txt");
        File dataBaseFileNormal = new File(".\\src\\app\\BaseWords\\2.txt");
        File dataBaseFileHard = new File(".\\src\\app\\BaseWords\\3.txt");
        if (!dataBaseFileEasy.exists()) {
            dataBaseFileEasy.createNewFile(); //TODO processing
        }
        if (!dataBaseFileNormal.exists()) {
            dataBaseFileNormal.createNewFile();
        }
        if (!dataBaseFileHard.exists()) {
            dataBaseFileHard.createNewFile();
        }
        return difficulty;
    }
}