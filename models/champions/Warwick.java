package lolsimulation.models.champions;

import lolsimulation.models.Being;
import lolsimulation.models.Damage;

/**
 * Created by amr on 17.11.2015.
 */
public class Warwick extends Champion {

    public Warwick(){
        this.name = "Warwick";

        //set base stats (niveau 1 sans bonus)
        this.baseAD = 62.43f;
        this.baseArmor = 25.88f;
        this.baseAS = 0.679f;
        this.baseHp = 592.64f;
        this.baseMana = 240.4f;
        this.baseMR = 32.1f;
        this.baseMS = 345f;
        this.baseRange = 125f;
        this.baseRegenHp = 8.39f;
        this.baseRegenMana = 8.105f;

        //set growth of stats
        this.growthAD = 3.375f;
        this.growthArmor = 3.5f;
        this.growthAS = 2.88f;
        this.growthHp = 98f;
        this.growthMana = 30f;
        this.growthMR = 1.25f;
        this.growthRegenHp = 0.8f;
        this.growthRegenMana = 0.6f;

    }


    @Override
    public Damage qSpell(Being target) {
        return null;
    }

    @Override
    public Damage wSpell(Being target) {
        return null;
    }

    @Override
    public Damage eSpell(Being target) {
        return null;
    }

    @Override
    public Damage rSpell(Being target) {
        return null;
    }
}
