package poker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static poker.Suit.*;

public class HandTest {
    private List<Card> cards = Arrays.asList(
            new Card(S, new Rank(2)),
            new Card(H, new Rank(3)),
            new Card(D, new Rank(4)),
            new Card(C, new Rank(1)),
            new Card(S, new Rank(13))
    );

    private Hand hand = new Hand(cards);

    //手札一覧表示テスト
    @Test
    public void toStringOfHand() {
        assertEquals("[S-2, H-3, D-4, C-A, S-K]", hand.toString());
    }

    //役名表示用テスト
    @Test
    public void toStringOfHandOfPoker() {
        assertEquals("フラッシュ", hand.askHandOfName().toString()); //TODO 一旦フラッシュ固定
    }
}