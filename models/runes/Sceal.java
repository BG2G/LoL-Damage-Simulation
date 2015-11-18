package lolsimulation.models.runes;

import lolsimulation.models.runes.Rune;

/**
 * Created by League of Engineers on 11/14/2015.
 */
public abstract class Sceal extends Rune {
    public Sceal() {
        this.couleur = "Sceal";

    }
    public Sceal(int stat, int bonusType, int value) {
        this.couleur = "Sceal";
        this.stat = stat;
        this.typeBonus = bonusType;
        this.value = value;

    }
}
