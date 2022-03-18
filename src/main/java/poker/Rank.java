package poker;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
//@AllArgsConstructor
public class Rank {
    private int displayNumber;      //表記上のカードのランクを数字変換したもの（1~13）
    private String displayName;     //カードのランクの名前（表示用：A,2~10,J〜K）
    private int calculationNumber;  //計算上のカードのランクの数字(Aは14(最強)としてのみ考える)

    //コンストラクタ
    public Rank(int displayNumber) {

        this.displayNumber = displayNumber;

        //表示用（1,11〜13は英字に変換）
        if (displayNumber == 1) {
            this.displayName = "A";
        } else if (displayNumber == 11) {
            this.displayName = "J";
        } else if (displayNumber == 12) {
            this.displayName = "Q";
        } else if (displayNumber == 13) {
            this.displayName = "K";
        } else {
            this.displayName = String.valueOf(displayNumber);
        }

        //計算用(Aは14として計算する)
        if (displayNumber == 1) {
            this.calculationNumber = 14;
        } else {
            this.calculationNumber = displayNumber;
        }
    }

    //カード表示用
    @Override
    public String toString() {
        return displayName;
    }
}