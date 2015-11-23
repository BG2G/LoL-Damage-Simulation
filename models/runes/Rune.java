package lolsimulation.models.runes;

import java.io.File;

public abstract class Rune {
//les runes sont définies par leur couleur, la stat améliorée, le type de bonus(flat, %, scaling) et la valeur de ce bonus.

    //constantes pour les stats améliorables par les runes
    public static final int AD = 0;
    public static final int AP = 1;
    public static final int ARMOR = 2;
    public static final int MR = 3;
    public static final int ARM_PEN = 4;
    public static final int MAG_PEN = 5;
    public static final int MS = 6;
    public static final int CDR = 7;
    public static final int HP = 8;
    public static final int CRIT = 9;
    public static final int SPELLVAMP = 10;
    public static final int LIFESTEAL = 11;
    public static final int CRITRATIO = 12;
    public static final int ENERGY = 13;
    public static final int ENERGY_REG = 14;
    public static final int MANA = 15;
    public static final int MANA_REG = 16;
    public static final int AS = 17;
    //et ainsi de suite, selon les besoins


    //constantes pour les types de bonus
    public static final int FLAT = 0;
    public static final int PERC = 1;
    public static final int SCAL = 2;



    protected String couleur; //Seal, Glyph, Mark, Quint
    protected int stat; //AD, AP, ARMOR...
    protected int typeBonus; //FLAT, PERC, SCAL
    protected float value; //valeur de ce bonus
    protected File icon;


    public void addIcon(File icone){
        this.icon = icone;
    }
    public void setIcon(File icone){ //deux syntaxes, au cas où
        this.icon = icone;
    }
    public File getIcon(){
        return this.icon;
    }


    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }

    public int getTypeBonus() {
        return typeBonus;
    }

    public void setTypeBonus(int typeBonus) {
        this.typeBonus = typeBonus;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String toString(){
        String details = "";
        details = details + couleur;
        details = details + "; statistique : +";
        details = details + this.value + " ";
        switch(this.typeBonus){
            case FLAT:
                switch(this.stat){
                    case AD:
                        details = details+" AD";
                        break;
                    case AP:
                        details = details+" AP";
                        break;
                    case ARMOR:
                        details = details+" Armor";
                        break;
                    case MR:
                        details = details+" MR";
                        break;
                    case ARM_PEN:
                        details = details+" Armor Pen.";
                        break;
                    case MAG_PEN:
                        details = details+" Magic Pen.";
                        break;
                    case MS:
                        details = details+" Movement Speed";
                        break;
                    case CDR:
                        details = details+" CDR";
                        break;
                    case HP:
                        details = details+" HP";
                        break;
                    case CRIT:
                        details = details+" Crit. Chance";
                        break;
                    case SPELLVAMP:
                        details = details+" Spell Vamp";
                        break;
                    case LIFESTEAL:
                        details = details+" LifeSteal";
                        break;
                    case CRITRATIO:
                        details = details+" Crit Damage";


                }
                break;
            case PERC:
                details = details+"%";
                switch(this.stat){
                    case AD:
                        details = details+" AD";
                        break;
                    case AP:
                        details = details+" AP";
                        break;
                    case ARMOR:
                        details = details+" Armor";
                        break;
                    case MR:
                        details = details+" MR";
                        break;
                    case ARM_PEN:
                        details = details+" Armor Pen.";
                        break;
                    case MAG_PEN:
                        details = details+" Magic Pen.";
                        break;
                    case MS:
                        details = details+" Movement Speed";
                        break;
                    case CDR:
                        details = details+" CDR";
                        break;
                    case HP:
                        details = details+" HP";
                        break;
                    case CRIT:
                        details = details+" Crit. Chance";
                        break;
                    case SPELLVAMP:
                        details = details+" Spell Vamp";
                        break;
                    case LIFESTEAL:
                        details = details+" LifeSteal";
                        break;
                    case CRITRATIO:
                        details = details+" Crit Damage";

                }
                break;
            case SCAL:
                switch(this.stat){
                    case AD:
                        details = details+" AD";
                        break;
                    case AP:
                        details = details+" AP";
                        break;
                    case ARMOR:
                        details = details+" Armor";
                        break;
                    case MR:
                        details = details+" MR";
                        break;
                    case ARM_PEN:
                        details = details+" Armor Pen.";
                        break;
                    case MAG_PEN:
                        details = details+" Magic Pen.";
                        break;
                    case MS:
                        details = details+" Movement Speed";
                        break;
                    case CDR:
                        details = details+" CDR";
                        break;
                    case HP:
                        details = details+" HP";
                        break;
                    case CRIT:
                        details = details+" Crit. Chance";
                        break;
                    case SPELLVAMP:
                        details = details+" Spell Vamp";
                        break;
                    case LIFESTEAL:
                        details = details+" LifeSteal";
                        break;
                    case CRITRATIO:
                        details = details+" Crit Damage";

                }
                details = details+"/lvl";
                break;

        }

        return details;
    }
}
