package poker;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
@AllArgsConstructor
public class Hand {
    private List<Card> cards;


    //手札一覧表示用
    @Override
    public String toString() {
        return cards.toString();
    }

    //手札に役を聞くメソッド
    public HandOfPoker askHandOfName() {
        //1つずつ該当役がないか確認していく（各役判定メソッドに聞く形）
        return HandOfPoker.FLUSH;   //TODO 一旦フラッシュ固定
    }
}
