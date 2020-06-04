package app.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class WordTest {
//    private static final String WORD_1 = "hello";
//    private Word word1 = new Word(WORD_1);
//    private Word word2 = new Word(WORD_1, 2, WORD_1.length() - 2);
//
//    @Test
//    public void createStructureWordTest() {
//        Map<Symbol, List<Integer>> thisStructureWord = new HashMap<>();
//        thisStructureWord.put('h', Collections.singletonList(0));
//        thisStructureWord.put('e', Collections.singletonList(1));
//        thisStructureWord.put('l', Arrays.asList(2, 3));
//        thisStructureWord.put('o', Collections.singletonList(4));
//        word1.createStructureWordTest(WORD_1, 0, WORD_1.length() - 1);
//        Assert.assertTrue(equalsSet(word1.getStructureWord(), thisStructureWord));
//        word1.createStructureWordTest(WORD_1, 1, WORD_1.length() - 1);
//        Assert.assertFalse(equalsSet(word1.getStructureWord(), thisStructureWord));
//    }
//
//    @Test
//    public void openExtremeTest() {
//        word2.openExtremeTest(2, WORD_1.length() - 2);
//        char[] thisMassive = new char[]{'h', 'e', word2.closeSymbol(), 'l', 'o'};
//        Assert.assertArrayEquals(word2.getGuessSymbol(), thisMassive);
//
//        word1.openExtremeTest(1, WORD_1.length() - 2);
//        thisMassive = new char[]{'h', word1.closeSymbol(), word1.closeSymbol(), 'l', 'o'};
//        Assert.assertArrayEquals(word1.getGuessSymbol(), thisMassive);
//    }
//
//    @Test
//    public void deleteStructureWord() {
//        word1.deleteStructureWord('h');
//        Assert.assertNull(word1.getStructureWord().get('h'));
//    }
//
//    private boolean equalsSet(Map<Symbol, List<Integer>> map1, Map<Symbol, List<Integer>> map2) {
//        if (map1.size() == map2.size()) {
//            for (Map.Entry<Symbol, List<Integer>> i : map1.entrySet()) {
//                map2.remove(i.getKey());
//            }
//            return map2.isEmpty();
//        }
//        return false;
//    }
}