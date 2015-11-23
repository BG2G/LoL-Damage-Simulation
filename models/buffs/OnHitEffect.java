package lolsimulation.models.buffs;

import lolsimulation.models.Damage;
import lolsimulation.models.DamageScaling;
import lolsimulation.models.Dot;
import lolsimulation.models.champions.Champion;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by League of Engineers on 11/21/2015.
 */
public class OnHitEffect extends Buff{

    private int damageType;
    private DamageScaling scaling;
    private List<Buff> debuffs;
    private List<Dot> dots;

    public OnHitEffect(int damageType, DamageScaling dmgScaling, List<Buff> debuffs, List<Dot> dots){
        this.damageType = damageType;
        this.scaling = dmgScaling;
        this.debuffs = debuffs;
        this.dots = dots;
    }

    public OnHitEffect(int damageType, DamageScaling scaling, List<Buff> debuffs){
        new OnHitEffect(damageType, scaling, debuffs, new LinkedList<Dot>());
    }

    public OnHitEffect(int damageType, DamageScaling dmgScaling){
        new OnHitEffect(damageType, dmgScaling, new LinkedList<Buff>(), new LinkedList<Dot>());
    }

    public Damage getOnHitEffectDamage(Champion source){
        Damage damage = scaling.getDamage(source, damageType);
        damage.setDebuffs(debuffs);
        damage.addDots(dots);
        return damage;
    }

    public List<Dot> getDots(){
        return dots;
    }


}
