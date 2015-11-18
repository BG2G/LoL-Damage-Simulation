package lolsimulation.models.runes;

/**
 * Created by League of Engineers on 11/14/2015.
 */
public abstract class Quintessence extends Rune {
    public Quintessence() {
        this.couleur = "Quint";

    }
    public Quintessence(int stat, int bonusType, int value) {
        this.couleur = "Glyphe";
        this.stat = stat;
        this.typeBonus = bonusType;
        this.value = value;

    }
}
