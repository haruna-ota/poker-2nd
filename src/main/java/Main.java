import poker.Card;
import poker.Hand;
import poker.Rank;

import java.util.Arrays;
import java.util.List;

import static poker.Suit.*;

public class Main {
    public static void main(String[] args) {
        List<Card> cards = Arrays.asList(
                new Card(S, new Rank(1)),
                new Card(S, new Rank(2)),
                new Card(S, new Rank(3)),
                new Card(S, new Rank(4)),
                new Card(S, new Rank(5))
        );
        System.out.println(cards.toString());

        //手札生成
        Hand hand = new Hand(cards);

        //役を聞きに行く
        System.out.println("この手札の役名は：" + hand.askHandOfName());
    }
}
