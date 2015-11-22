package lolsimulation.models.champions;

import lolsimulation.models.Being;
import lolsimulation.models.buffs.Buff;
import lolsimulation.models.Damage;
import lolsimulation.models.buffs.Buffs;
import lolsimulation.models.items.Build;
import lolsimulation.models.masteries.MasteryPage;
import lolsimulation.models.runes.Rune;
import lolsimulation.models.runes.RunePage;

import java.util.List;
import java.util.ListIterator;

public abstract class Champion extends Being {

    //max number of items and other restrictions (gold items etc)


    protected Build items;
    protected RunePage runes;
    protected MasteryPage masteries;
    protected Buffs buffs;

    protected float criticalChance = 0;
    protected float armorPen = 0;
    protected float armorReductionPercentage = 0;
    protected float magicPen = 0;
    protected float magicReductionPercentage = 0;
    protected float spellVamp = 0;
    protected float lifeSteal = 0;
    protected float critRatio = 2;
    protected float cdr = 0;

    public float getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(float criticalChance) {
        this.criticalChance = criticalChance;
    }

    public float getArmorPen() {
        return armorPen;
    }

    public void setArmorPen(float armorPen) {
        this.armorPen = armorPen;
    }

    public float getArmorReductionPercentage() {
        return armorReductionPercentage;
    }

    public void setArmorReductionPercentage(float armorReductionPercentage) {
        this.armorReductionPercentage = armorReductionPercentage;
    }

    public float getMagicPen() {
        return magicPen;
    }

    public void setMagicPen(float magicPen) {
        this.magicPen = magicPen;
    }

    public float getMagicReductionPercentage() {
        return magicReductionPercentage;
    }

    public void setMagicReductionPercentage(float magicReductionPercentage) {
        this.magicReductionPercentage = magicReductionPercentage;
    }

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

    public Buffs getBuffs() {
        return buffs;
    }

    public void setBuffs(Buffs buffs) {
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

    public float getBonusAd(){
        return this.getAd() - this.getBaseAD();
    }

    public float getBonusArmor(){
        return this.getArmor() - this.getBaseArmor();
    }
    public  float getBonusMr(){
        return this.getMr() - this.getBaseMR();
    }
    public float getBonusHp(){
        return this.getHpMax() - this.getBaseHp();
    }


    public void applyRunes(){
        ListIterator<Rune> listeRunes = this.runes.getRunes().listIterator();
        Rune rune;
        int stat; //AD, AP, ARMOR...
        int typeBonus; //FLAT, PERC, SCAL
        int value; //valeur de ce bonus
        while(listeRunes.hasNext()) {
            rune = listeRunes.next();
            stat = rune.getStat();
            typeBonus = rune.getTypeBonus();
            value = rune.getValue();

            switch(typeBonus){
                case Rune.FLAT:
                    switch(stat){
                        case Rune.AD:
                            ad = ad + value;
                            break;
                        case Rune.AP:
                            ap = ap + value;
                            break;
                        case Rune.ARMOR:
                            armor = armor + value;
                            break;
                        case Rune.MR:
                            mr = mr + value;
                            break;
                        case Rune.ARM_PEN:
                            armorPen = armorPen + value;
                            break;
                        case Rune.MAG_PEN:
                            magicPen = magicPen + value;
                            break;
                        case Rune.MS:
                            ms = ms + value;
                            break;
                        case Rune.CDR:
                            cdr = cdr + value; //en pourcents
                            break;
                        case Rune.HP:
                            hpMax = hpMax + value;
                            break;
                        case Rune.CRIT:
                            criticalChance = criticalChance + value;
                            break;
                        case Rune.SPELLVAMP:
                            spellVamp = spellVamp + value;
                            break;
                        case Rune.LIFESTEAL:
                            lifeSteal = lifeSteal + value;
                            break;
                        case Rune.CRITRATIO:
                            critRatio= critRatio + value;
                            break;
                    }

                    break;
                case Rune.PERC:
                    switch(stat){
                        case Rune.AD:
                            ad = ad + baseAD*value/100f;
                            break;
                        case Rune.ARMOR:
                            armor = armor + baseArmor*value/100f;
                            break;
                        case Rune.MR:
                            mr = mr + baseMR*value/100f;
                            break;
                        case Rune.ARM_PEN:
                            armorReductionPercentage = armorReductionPercentage + value;
                            break;
                        case Rune.MAG_PEN:
                            magicReductionPercentage = magicReductionPercentage + value;
                            break;
                        case Rune.MS:
                            ms = ms + baseMS*value/100f;
                            break;
                        case Rune.CDR:
                            cdr = cdr + value; //en pourcents
                            break;
                        case Rune.HP:
                            hpMax = hpMax + baseHp*value/100f;
                            break;
                        case Rune.CRIT:
                            criticalChance = criticalChance + value;
                            break;
                        case Rune.SPELLVAMP:
                            spellVamp = spellVamp + value;
                            break;
                        case Rune.LIFESTEAL:
                            lifeSteal = lifeSteal + value;
                            break;
                        case Rune.CRITRATIO:
                            critRatio= critRatio + value;
                            break;
                    }



                    break;
                case Rune.SCAL:
                    switch(stat){
                        case Rune.AD:
                            ad = ad + value*level;
                            break;
                        case Rune.AP:
                            ap = ap + value*level;
                            break;
                        case Rune.ARMOR:
                            armor = armor + value*level;
                            break;
                        case Rune.MR:
                            mr = mr + value*level;
                            break;
                        case Rune.ARM_PEN:
                            armorPen = armorPen + value*level;
                            break;
                        case Rune.MAG_PEN:
                            magicPen = magicPen + value*level;
                            break;
                        case Rune.MS:
                            ms = ms + value*level;
                            break;
                        case Rune.CDR:
                            cdr = cdr + value*level; //en pourcents
                            break;
                        case Rune.HP:
                            hpMax = hpMax + value*level;
                            break;
                        case Rune.CRIT:
                            criticalChance = criticalChance + value*level;
                            break;
                        case Rune.SPELLVAMP:
                            spellVamp = spellVamp + value*level;
                            break;
                        case Rune.LIFESTEAL:
                            lifeSteal = lifeSteal + value*level;
                            break;
                        case Rune.CRITRATIO:
                            critRatio= critRatio + value*level;
                            break;
                    }

                    break;
            }
        }
    }

    public Damage basicAttack(Being target){

        Damage damage = new Damage();
        float physicalDamage =  this.getAd();
        if(Math.random() < this.criticalChance){
            physicalDamage *= 2;
        }
        //TODO: buffs, hit effect ...

        float targetArmor = target.getArmor();
        //TODO : Last whisper
        targetArmor = targetArmor*(1- this.getArmorReductionPercentage()) - this.getArmorPen();
        physicalDamage = Damage.applyResistance(physicalDamage, targetArmor);
        // TODO: special reduction from the Target side, defensive mastery, Braum's e, Alistar's r...

        damage.addDamage(Damage.PHYSICAL_DAMAGE, (int)physicalDamage);

        return damage;
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
