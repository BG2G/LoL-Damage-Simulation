package lolsimulation.models;

import lolsimulation.models.buffs.Buff;

import java.util.List;

/**
 * Created by League of Engineers on 11/17/2015.
 */
public class Damage {

    public static final int PHYSICAL_DAMAGE = 1;
    public static final int MAGICAL_DAMAGE = 2;
    public static final int TRUE_DAMAGE = 3;
    public static final int PHYSICAL_DOT = 4;
    public static final int MAGICAL_DOT = 5;
    public static final int TRUE_DOT = 6;

    private int physicalDamage;
    private int magicalDamage;
    private int trueDamage;
    //For DOT
    //TODO : split the DOTs (for damage addition)
    private int dotNumber;
    private float dotInterval;
    private float dotPhysicalDamage;
    private float dotMagicalDamage;
    private float dotTrueDamage;

    private List<Buff> debuffs;

    public Damage(){}

    public Damage(int damageType, float value){
        this.addDamage(damageType, value);
    }

    public void addDamage(Damage otherDmg){
        this.physicalDamage += otherDmg.physicalDamage;
        this.magicalDamage += otherDmg.magicalDamage;
        this.trueDamage += otherDmg.trueDamage;
    }

    public void addDamage(int damageType, float value){
        switch (damageType){
            case PHYSICAL_DAMAGE:
                this.physicalDamage += value;
                break;
            case MAGICAL_DAMAGE:
                this.magicalDamage += value;
                break;
            case TRUE_DAMAGE:
                this.trueDamage += value;
                break;
        }
    }

    public void setDot(int repetitions, float dotInterval, int damageType, float value){
        this.dotInterval = dotInterval;
        this.dotNumber = repetitions;
        switch (damageType){
            case PHYSICAL_DOT:
                this.dotPhysicalDamage = value;
                break;
            case MAGICAL_DOT:
                this.dotMagicalDamage = value;
                break;
            case TRUE_DOT:
                this.dotTrueDamage = value;
                break;
        }
    }

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public int getMagicalDamage() {
        return magicalDamage;
    }

    public int getTrueDamage() {
        return trueDamage;
    }

    public int getDotNumber() {
        return dotNumber;
    }

    public float getDotInterval() {
        return dotInterval;
    }

    public float getDotPhysicalDamage() {
        return dotPhysicalDamage;
    }

    public float getDotMagicalDamage() {
        return dotMagicalDamage;
    }

    public List<Buff> getDebuffs() {
        return debuffs;
    }

    public void setDebuffs(List<Buff> debuffs) {
        this.debuffs = debuffs;
    }

    public float getDotTrueDamage() {
        return dotTrueDamage;
    }


    public static float applyResistance(float trueDamage, float resistance){
        return trueDamage*(100/(100 + resistance));
    }


}
