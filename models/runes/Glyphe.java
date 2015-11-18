package lolsimulation.models.runes;

/**
 * Created by League of Engineers on 11/14/2015.
 */
public abstract class Glyphe extends Rune {
    public Glyphe() {
        this.couleur = "Glyphe";

    }
    public Glyphe(int stat, int bonusType, int value) {
        this.couleur = "Glyphe";
        this.stat = stat;
        this.typeBonus = bonusType;
        this.value = value;

    }


}
