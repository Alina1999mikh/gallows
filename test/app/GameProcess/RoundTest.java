package app.GameProcess;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RoundTest {
    private static final String WORD_1 = "hello";
    private Round round1 = new Round(WORD_1,1,1);
    private Round round2 = new Round(WORD_1,1,1);
    private Set<Character> available = new HashSet<>(Arrays.asList('l', 'e'));
    private Set<Character> notAvailable = new HashSet<>(Arrays.asList('p', 'n', 'r'));
    private Set<Character> differentAvailable = new HashSet<>(Arrays.asList('n', 'e', 'r')); //here need to be only one element as in a word

    @Test
    public void strokeProcessing() {
        int life = round1.life();
        for (char i : available) {
            round2.strokeProcessingTest(i);
        }
        assertLive(life);
        for (char i : notAvailable) {
            round1.strokeProcessingTest(i);
        }
        assertLive(life - notAvailable.size());
    }

    @Test
    public void word() {
        for (Character i : available) {
            round1.strokeProcessingTest(i);
        }
        Assert.assertArrayEquals(round1.getWord().getGuessSymbol(), round1.getWord().getOpenWord());
        for (Character i : differentAvailable) {
            round2.strokeProcessingTest(i);
        }
        char[] closeWord = new char[]{'h', 'e', round2.getWord().closeSymbol(), round2.getWord().closeSymbol(), 'o'};
        Assert.assertArrayEquals(round2.getWord().getGuessSymbol(), closeWord);
    }

    private void assertLive(int life) {
        Assert.assertEquals(life, round1.life());
    }
}