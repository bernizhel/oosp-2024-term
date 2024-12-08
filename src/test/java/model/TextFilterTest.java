package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextFilterTest {
    @Test
    public void testRemovePunctuation() {
        TextFilter textFilter = new TextFilter();

        String input = "Hello, world! This is a test.";
        String expected = "Hello world This is a test";
        String actual = textFilter.removePunctuation(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemovePunctuationWithEmptyString() {
        TextFilter textFilter = new TextFilter();

        String input = "";
        String expected = "";
        String actual = textFilter.removePunctuation(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemovePunctuationFromTextConsistingSolelyOutOfPunctuation() {
        TextFilter textFilter = new TextFilter();

        String input = "!\"#$%&'()*+,-./:;<=>?@[]^_\\`{|}~";
        String expected = "";
        String actual = textFilter.removePunctuation(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testDoNotChangeTextWithoutPunctuation() {
        TextFilter textFilter = new TextFilter();

        String input = "Text without punctuation";
        String expected = "Text without punctuation";
        String actual = textFilter.removePunctuation(input);

        assertEquals(expected, actual);
    }
}