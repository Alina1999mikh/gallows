package app.GameProcess;

import app.GameProcess.Round;
import app.GameProcess.SpawnWord;
import app.GameProcess.RandomLineNumber;
import java.io.IOException;

public class NewGame {

    int difficutly=SpawnWord.dataBase();
    String word=RandomLineNumber.getWordFromFile(difficutly);
    Round round=new Round(word);
    public NewGame() throws IOException {
        round.process();
    }
}
