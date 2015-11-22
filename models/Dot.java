package lolsimulation.models;

/**
 * Created by League of Engineers on 11/22/2015.
 */
public class Dot {

    //Dot name constants

    //For DOT
    private String name;
    private int dotNumber;
    private float dotInterval;
    private float dotPhysicalDamage;
    private float dotMagicalDamage;
    private float dotTrueDamage;

    public Dot(String name, int repetitions, float timeInterval,
               float dotPhysicalDamage, float dotMagicalDamage, float dotTrueDamage){
        this.name = name;
        this.dotNumber = repetitions;
        this.dotInterval = timeInterval;
        this.dotPhysicalDamage = dotPhysicalDamage;
        this.dotMagicalDamage = dotMagicalDamage;
        this.dotTrueDamage = dotTrueDamage;
    }

    public Dot(String name, int repetitions, float timeInterval,
               int damageType, float value){
        this.name = name;
        this.dotNumber = repetitions;
        this.dotInterval = timeInterval;

        switch (damageType){
            case Damage.PHYSICAL_DOT:
                this.dotPhysicalDamage = value;
                break;
            case Damage.MAGICAL_DOT:
                this.dotMagicalDamage = value;
                break;
            case Damage.TRUE_DOT:
                this.dotTrueDamage = value;
                break;
        }

    }



}
