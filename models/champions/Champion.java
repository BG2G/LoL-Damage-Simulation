package lolsimulation.models.champions;

import lolsimulation.models.Being;
import lolsimulation.models.Buff;
import lolsimulation.models.Damage;
import lolsimulation.models.items.Build;
import lolsimulation.models.masteries.MasteryPage;
import lolsimulation.models.runes.RunePage;

import java.util.List;

public abstract class Champion extends Being {

    //max number of items and other restrictions (gold items etc)


    protected Build items;
    protected RunePage runes;
    protected MasteryPage masteries;
    protected List<Buff> buffs;

    protected int qLevel;
    protected int wLevel;
    protected int eLevel;
    protected int rLevel;

    protected float qCooldown;
    protected float wCooldown;
    protected float eCooldown;
    protected float rCooldown;
    protected float passiveCooldown;



    public Build getItems() {
        return items;
    }

    public void setItems(Build items) {
        this.items = items;
    }

    public RunePage getRunes() {
        return runes;
    }

    public void setRunes(RunePage runes) {
        this.runes = runes;
    }

    public MasteryPage getMasteries() {
        return masteries;
    }

    public void setMasteries(MasteryPage masteries) {
        this.masteries = masteries;
    }

    public List<Buff> getBuffs() {
        return buffs;
    }

    public void setBuffs(List<Buff> buffs) {
        this.buffs = buffs;
    }

    public int getqLevel() {
        return qLevel;
    }

    public void setqLevel(int qLevel) {
        this.qLevel = qLevel;
    }

    public int getwLevel() {
        return wLevel;
    }

    public void setwLevel(int wLevel) {
        this.wLevel = wLevel;
    }

    public int geteLevel() {
        return eLevel;
    }

    public void seteLevel(int eLevel) {
        this.eLevel = eLevel;
    }

    public int getrLevel() {
        return rLevel;
    }

    public void setrLevel(int rLevel) {
        this.rLevel = rLevel;
    }

    public float getqCooldown() {
        return qCooldown;
    }

    public void setqCooldown(float qCooldown) {
        this.qCooldown = qCooldown;
    }

    public float getwCooldown() {
        return wCooldown;
    }

    public void setwCooldown(float wCooldown) { this.wCooldown = wCooldown; }

    public float geteCooldown() {
        return eCooldown;
    }

    public void seteCooldown(float eCooldown) {
        this.eCooldown = eCooldown;
    }

    public float getrCooldown() {
        return rCooldown;
    }

    public void setrCooldown(float rCooldown) {
        this.rCooldown = rCooldown;
    }

    public float getPassiveCooldown() {
        return passiveCooldown;
    }

    public void setPassiveCooldown(float passiveCooldown) {
        this.passiveCooldown = passiveCooldown;
    }

    public void applyRunes(){
        //TODO
    }

    public abstract Damage qSpell(Being target);
    public abstract Damage wSpell(Being target);
    public abstract Damage eSpell(Being target);
    public abstract Damage rSpell(Being target);

    public String toString(){

        StringBuilder description = new StringBuilder(super.toString());
        description.append("Runes : \n").append(runes.toString());
        description.append("Masteries : \n").append(masteries.toString());
        description.append("Build : \n").append(items.toString());
        description.append("Buffs/Debuffs : \n").append(buffs.toString());
        description.append("\nQ spell : level ").append(qLevel).append(", cooldown ").append(qCooldown);
        description.append("\nW spell : level ").append(wLevel).append(", cooldown ").append(wCooldown);
        description.append("\nE spell : level ").append(eLevel).append(", cooldown ").append(eCooldown);
        description.append("\nR spell : level ").append(rLevel).append(", cooldown ").append(rCooldown);

        return description.toString();
    }
}
