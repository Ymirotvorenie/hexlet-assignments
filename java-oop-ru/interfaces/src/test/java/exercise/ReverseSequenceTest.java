package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseSequenceTest {
    ReversedSequence reverseText;

    @BeforeEach
    public void setUp() {
        reverseText = new ReversedSequence("abcdef");
    }

    @Test
    public void testToString() {
        String expected = "fedcba";
        assertEquals(reverseText.toString(), expected);
    }

    @Test
    public void testCharAt() {
        char expected = 'e';
        assertEquals(reverseText.charAt(1), expected);
    }

    @Test
    public void testLength() {
        int expected = 6;
        assertEquals(reverseText.length(), expected);
    }

    @Test
    public void testSubSequence() {
        String expected = "edc";
        assertEquals(reverseText.subSequence(1, 4), expected
        );
    }
}
