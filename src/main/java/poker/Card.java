package poker;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@AllArgsConstructor
public class Card {
    private Suit suit;  //カードのマーク（スート）
    private Rank rank;  //  カードの数字（ランク）

    //カード表示用
    @Override
    public String toString() {
        return suit + "-" + rank;
    }
}
