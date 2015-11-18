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
    //et ainsi de suite, selon les besoins


    //constantes pour les types de bonus
    public static final int FLAT = 0;
    public static final int PERC = 1;
    public static final int SCAL = 2;



    protected String couleur; //Sceal, Glyphe, Mark, Quint
    protected int stat; //AD, AP, ARMOR...
    protected int typeBonus; //FLAT, PERC, SCAL
    protected int value; //valeur de ce bonus
    protected File icone;


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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        String details = "";
        details = details + couleur;
        details = details + "; statistique : ";
        switch
        return details;
    }
}
