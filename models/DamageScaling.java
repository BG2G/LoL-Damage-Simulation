package lolsimulation.models;

import lolsimulation.models.champions.Champion;

import java.util.HashMap;

/**
 * Created by League of Engineers on 11/21/2015.
 */
public class DamageScaling {

    private float[] scaling = new float[DIFFERENT_BONUS];
    //Constantes
    private static final int DIFFERENT_BONUS = 14;

    public static final int BASE_AD = 0;
    public static final int BASE_ARMOR = 1;
    public static final int BASE_MR = 2;
    public static final int BONUS_AD = 3;
    public static final int BONUS_ARMOR = 4;
    public static final int BONUS_MR = 5;
    public static final int BONUS_HP = 6;
    public static final int AD = 7;
    public static final int AP = 8;
    public static final int ARMOR = 9;
    public static final int MR = 10;
    public static final int HP_MAX = 11;


    public DamageScaling(){
    }

    public void addScaling(int type, float value){
        if(type >= DIFFERENT_BONUS){
            return;
        }
        scaling[type] = scaling[type] + value;
    }

    public Damage getDamage(Champion source, int damageType){
        float dmg = 0;

        dmg = dmg + scaling[BASE_AD]*source.getBaseAD();
        dmg = dmg + scaling[BASE_ARMOR]*source.getBaseArmor();
        dmg = dmg + scaling[BASE_MR]*source.getBaseMR();
        dmg = dmg + scaling[BONUS_AD]*source.getBonusAd();
        dmg = dmg + scaling[BONUS_ARMOR]*source.getBonusArmor();
        dmg = dmg + scaling[BONUS_MR]*source.getBonusMr();
        dmg = dmg + scaling[BONUS_HP]*source.getBonusHp();
        dmg = dmg + scaling[AD]*source.getAd();
        dmg = dmg + scaling[AP]*source.getAp();
        dmg = dmg + scaling[ARMOR]*source.getArmor();
        dmg = dmg + scaling[MR]*source.getMr();
        dmg = dmg + scaling[HP_MAX]*source.getHpMax();


        return new Damage(damageType, dmg);
    }


}
