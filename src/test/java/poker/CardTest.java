package poker;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    @Test
    public void toStringOfCard() {
        assertEquals("S-2", new Card(Suit.S, new Rank(2)).toString());
        assertEquals("H-3", new Card(Suit.H, new Rank(3)).toString());
        assertEquals("D-4", new Card(Suit.D, new Rank(4)).toString());
        assertEquals("C-A", new Card(Suit.C, new Rank(1)).toString());
    }
}
