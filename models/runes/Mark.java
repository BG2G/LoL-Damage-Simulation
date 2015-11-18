package models.runes;

/**
 * Created by League of Engineers on 11/14/2015.
 */
public abstract class Mark extends Rune {
    public Mark() {
        this.couleur = "Mark";

    }
    public Mark(int stat, int bonusType, int value) {
        this.couleur = "Mark";
        this.stat = stat;
        this.typeBonus = bonusType;
        this.value = value;

    }
}
