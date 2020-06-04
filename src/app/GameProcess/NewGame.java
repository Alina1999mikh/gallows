package app.GameProcess;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class NewGame implements KeyListener {
    private int difficutly = SpawnWord.dataBase();
    private String word = RandomLineNumber.getWordFromFile(difficutly);
    private Round round = new Round(word);

    public NewGame() throws IOException {
        // round.process();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        System.out.println("escape");
        if (keyEvent.getKeyCode() == KeyEvent.VK_CAPS_LOCK)
            round.process();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}