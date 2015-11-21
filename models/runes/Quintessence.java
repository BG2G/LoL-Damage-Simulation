package lolsimulation.models.runes;

/**
 * Created by League of Engineers on 11/14/2015.
 */
public class Quintessence extends Rune {
    public Quintessence() {
        this.couleur = "Quint";

    }
    public Quintessence(int stat, int bonusType, int value) {
        this.couleur = "Glyph";
        this.stat = stat;
        this.typeBonus = bonusType;
        this.value = value;

    }
}
