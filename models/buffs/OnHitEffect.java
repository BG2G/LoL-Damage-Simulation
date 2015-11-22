package lolsimulation.models.buffs;

import lolsimulation.models.Damage;
import lolsimulation.models.DamageScaling;
import lolsimulation.models.champions.Champion;


import java.util.List;

/**
 * Created by League of Engineers on 11/21/2015.
 */
public class OnHitEffect extends Buff{

    private int damageType;
    private DamageScaling scaling;
    private List<Buff> debuffs;

    public OnHitEffect(int damageType, DamageScaling dmgScaling, List<Buff> debuffs){
        this.damageType = damageType;
        this.scaling = dmgScaling;
        this.debuffs = debuffs;
    }

    public OnHitEffect(int damageType, DamageScaling dmgScaling){
        new OnHitEffect(damageType, dmgScaling, null);
    }

    public Damage getOnHitEffectDamage(Champion source){
        Damage damage = scaling.getDamage(source, damageType);
        damage.setDebuffs(debuffs);
        return damage;
    }


}
