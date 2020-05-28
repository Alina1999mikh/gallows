package GameProcess;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpawnWord {
   public static void dataBase() throws IOException {
        System.out.println("Выберите сложность игры, введите: 1 - легкая, 2 - средняя, 3 - сложная");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int difficulty = Integer.parseInt(rd.readLine());
        while (true) {
            if ((difficulty > 3) || (difficulty < 1)) {
                System.out.println("Сложность введена неправильно, попробуйте еще раз");
                difficulty = Integer.parseInt(rd.readLine());
            } else break;
        }
        File dataBaseFileEasy = new File(".\\src\\app\\GameProcess\\BaseWords\\1.txt");
        File dataBaseFileNormal = new File(".\\src\\app\\GameProcess\\BaseWords\\2.txt");
        File dataBaseFileHard = new File(".\\src\\app\\GameProcess\\BaseWords\\3.txt");
        if (!dataBaseFileEasy.exists()) {
            dataBaseFileEasy.createNewFile();
        }
        if (!dataBaseFileNormal.exists()) {
            dataBaseFileNormal.createNewFile();
        }
        if (!dataBaseFileHard.exists()) {
            dataBaseFileHard.createNewFile();
        }

        }
    }


