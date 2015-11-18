package models;

public abstract class Being {

    protected String name;
    protected int level;
    //stats de base actuelles
    //stats de niveau 1
    protected float baseHp;
    protected float baseRegenHp;
    protected float baseMana;
    protected float baseRegenMana;
    protected float baseAD;
    protected float baseAS;
    protected float baseArmor;
    protected float baseMR;
    protected float baseRange;
    protected float baseMS;

    //croissance par niveau
    protected float growthHp;
    protected float growthRegenHp;
    protected float growthMana;
    protected float growthRegenMana;
    protected float growthAD;
    protected float growthAS;
    protected float growthArmor;
    protected float growthMR;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(float baseHp) {
        this.baseHp = baseHp;
    }

    public float getBaseMana() {
        return baseMana;
    }

    public void setBaseMana(float baseMana) {
        this.baseMana = baseMana;
    }

    public float getBaseRegenHp() {
        return baseRegenHp;
    }

    public void setBaseRegenHp(float baseRegenHp) {
        this.baseRegenHp = baseRegenHp;
    }

    public float getBaseRegenMana() {
        return baseRegenMana;
    }

    public void setBaseRegenMana(float baseRegenMana) {
        this.baseRegenMana = baseRegenMana;
    }

    public float getBaseAD() {
        return baseAD;
    }

    public void setBaseAD(float baseAD) {
        this.baseAD = baseAD;
    }

    public float getBaseAS() {
        return baseAS;
    }

    public void setBaseAS(float baseAS) {
        this.baseAS = baseAS;
    }

    public float getBaseArmor() {
        return baseArmor;
    }

    public void setBaseArmor(float baseArmor) {
        this.baseArmor = baseArmor;
    }

    public float getBaseMR() {
        return baseMR;
    }

    public void setBaseMR(float baseMR) {
        this.baseMR = baseMR;
    }

    public float getBaseRange() {
        return baseRange;
    }

    public void setBaseRange(float baseRange) {
        this.baseRange = baseRange;
    }

    public float getBaseMS() {
        return baseMS;
    }

    public void setBaseMS(float baseMS) {
        this.baseMS = baseMS;
    }

    public float getGrowthHp() {
        return growthHp;
    }

    public void setGrowthHp(float growthHp) {
        this.growthHp = growthHp;
    }

    public float getGrowthRegenHp() {
        return growthRegenHp;
    }

    public void setGrowthRegenHp(float growthRegenHp) {
        this.growthRegenHp = growthRegenHp;
    }

    public float getGrowthMana() {
        return growthMana;
    }

    public void setGrowthMana(float growthMana) {
        this.growthMana = growthMana;
    }

    public float getGrowthRegenMana() {
        return growthRegenMana;
    }

    public void setGrowthRegenMana(float growthRegenMana) {
        this.growthRegenMana = growthRegenMana;
    }

    public float getGrowthAD() {
        return growthAD;
    }

    public void setGrowthAD(float growthAD) {
        this.growthAD = growthAD;
    }

    public float getGrowthAS() {
        return growthAS;
    }

    public void setGrowthAS(float growthAS) {
        this.growthAS = growthAS;
    }

    public float getGrowthArmor() {
        return growthArmor;
    }

    public void setGrowthArmor(float growthArmor) {
        this.growthArmor = growthArmor;
    }

    public float getGrowthMR() {
        return growthMR;
    }

    public void setGrowthMR(float growthMR) {
        this.growthMR = growthMR;
    }
}
