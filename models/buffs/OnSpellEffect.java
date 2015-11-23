package lolsimulation.models.buffs;

import lolsimulation.models.Damage;
import lolsimulation.models.DamageScaling;
import lolsimulation.models.Dot;
import lolsimulation.models.champions.Champion;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by League of Engineers on 11/22/2015.
 */
public class OnSpellEffect extends Buff {

    private int damageType;
    private DamageScaling scaling;
    private List<Buff> debuffs;
    private List<Dot> dots;

    public OnSpellEffect(int damageType, DamageScaling dmgScaling, List<Buff> debuffs, List<Dot> dots){
        this.damageType = damageType;
        this.scaling = dmgScaling;
        this.debuffs = debuffs;
        this.dots = dots;
    }
    public OnSpellEffect(int damageType, DamageScaling dmgScaling, List<Buff> buffs){
        new OnSpellEffect(damageType, dmgScaling, buffs, new LinkedList<Dot>());
    }
    public OnSpellEffect(int damageType, DamageScaling dmgScaling){
        new OnSpellEffect(damageType, dmgScaling, new LinkedList<Buff>(), new LinkedList<Dot>());
    }

    public Damage getOnSpellEffectDamage(Champion source){
        Damage damage = scaling.getDamage(source, damageType);
        damage.setDebuffs(debuffs);
        damage.addDots(dots);
        return damage;
    }

    public List<Dot> getDots(){
        return dots;
    }


}
