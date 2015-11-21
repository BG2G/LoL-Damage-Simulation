package lolsimulation.models;

import lolsimulation.models.buffs.Buff;

import java.util.List;

/**
 * Created by League of Engineers on 11/17/2015.
 */
public class Damage {

    private int physicalDamage;
    private int magicalDamage;
    private int trueDamage;
    //For DOT
    private int dotNumber;
    private float dotInterval;
    private int dotPhysicalDamage;
    private int dotMagicalDamage;
    private int dotTrueDamage;

    private List<Buff> debuffs;

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public void setPhysicalDamage(int physicalDamage) {
        this.physicalDamage = physicalDamage;
    }

    public int getMagicalDamage() {
        return magicalDamage;
    }

    public void setMagicalDamage(int magicalDamage) {
        this.magicalDamage = magicalDamage;
    }

    public int getTrueDamage() {
        return trueDamage;
    }

    public void setTrueDamage(int trueDamage) {
        this.trueDamage = trueDamage;
    }

    public int getDotNumber() {
        return dotNumber;
    }

    public void setDotNumber(int dotNumber) {
        this.dotNumber = dotNumber;
    }

    public float getDotInterval() {
        return dotInterval;
    }

    public void setDotInterval(float dotInterval) {
        this.dotInterval = dotInterval;
    }

    public int getDotPhysicalDamage() {
        return dotPhysicalDamage;
    }

    public void setDotPhysicalDamage(int dotPhysicalDamage) {
        this.dotPhysicalDamage = dotPhysicalDamage;
    }

    public int getDotMagicalDamage() {
        return dotMagicalDamage;
    }

    public void setDotMagicalDamage(int dotMagicalDamage) {
        this.dotMagicalDamage = dotMagicalDamage;
    }

    public List<Buff> getDebuffs() {
        return debuffs;
    }

    public void setDebuffs(List<Buff> debuffs) {
        this.debuffs = debuffs;
    }

    public int getDotTrueDamage() {

        return dotTrueDamage;
    }

    public void setDotTrueDamage(int dotTrueDamage) {
        this.dotTrueDamage = dotTrueDamage;
    }

    public static float applyResistance(float trueDamage, float resistance){
        return trueDamage*(100/(100 + resistance));
    }

}
