package lolsimulation.models.items;

import lolsimulation.models.buffs.Buff;

import java.util.List;

/**
 * Created by League of Engineers on 11/14/2015.
 */
public abstract class Item {

    //constantes: ad, ap ...
    private final static int NUMBER_OF_STATS_OPTIONS = 15;

    public final static int AD = 1;
    //...

    private boolean activable = false;
    private float cooldown;
    private float[] stats = new float[NUMBER_OF_STATS_OPTIONS];
    private List<Buff> buffs;

}
