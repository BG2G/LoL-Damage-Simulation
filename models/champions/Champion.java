package lolsimulation.models.champions;

import lolsimulation.models.Being;
import lolsimulation.models.Buff;
import lolsimulation.models.items.Build;
import lolsimulation.models.masteries.MasteryPage;
import lolsimulation.models.runes.RunePage;

import java.util.List;

public class Champion extends Being {

    //max number of items and other restrictions (gold items etc)


    protected Build items;
    protected RunePage runes;
    protected MasteryPage masteries;
    protected List<Buff> buffs;

    protected int qLevel;
    protected int zLevel;
    protected int eLevel;
    protected int rLevel;

    protected float qCooldown;
    protected float zCooldown;
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

    public int getzLevel() {
        return zLevel;
    }

    public void setzLevel(int zLevel) {
        this.zLevel = zLevel;
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

    public float getzCooldown() {
        return zCooldown;
    }

    public void setzCooldown(float zCooldown) {
        this.zCooldown = zCooldown;
    }

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
}
