import GameProcess.Round;
import GameProcess.SpawnWord;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Round round=new Round("малина");
        SpawnWord word=new SpawnWord();
        SpawnWord.dataBase();
        round.process();

    }
}
