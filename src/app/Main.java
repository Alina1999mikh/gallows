package app;

import app.GameProcess.Round;
import app.GameProcess.SpawnWord;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Round round=new Round("mojno");
        int difficutly=SpawnWord.dataBase();

        round.process();
    }
}