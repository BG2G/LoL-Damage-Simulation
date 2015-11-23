package lolsimulation.models;

import lolsimulation.models.buffs.Buff;

import java.util.LinkedList;
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

    private List<Dot> dots = new LinkedList<>();
    private List<Buff> debuffs = new LinkedList<>();

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

    public void setDot(String name, int repetitions, float dotInterval, int damageType, float value){

        Dot dot = new Dot(name, repetitions, dotInterval, damageType, value);
        dots.add(dot);

    }

    public int getTotalDamage(){
        return this.physicalDamage + this.magicalDamage + this.trueDamage;
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

    public void setDebuffs(List<Buff> debuffs) {
        this.debuffs = debuffs;
    }

    public List<Dot> getDots() {
        return dots;
    }

    public void addDot(Dot newDot){
        dots.add(newDot);
    }

    public void addDots(List<Dot> dotsToAdd){
        dots.addAll(dotsToAdd);
    }

    public List<Buff> getDebuffs() {
        return debuffs;
    }

    public static float applyResistance(float trueDamage, float resistance){
        return trueDamage*(100/(100 + resistance));
    }


}
