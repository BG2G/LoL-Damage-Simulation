package lolsimulation.models.runes;

import lolsimulation.models.runes.Rune;

/**
 * Created by League of Engineers on 11/14/2015.
 */
public class Seal extends Rune {
    public Seal() {
        this.couleur = "Seal";

    }
    public Seal(int stat, int bonusType, int value) {
        this.couleur = "Seal";
        this.stat = stat;
        this.typeBonus = bonusType;
        this.value = value;

    }
}
