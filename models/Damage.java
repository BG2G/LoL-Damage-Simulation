package lolsimulation.models;

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

}
