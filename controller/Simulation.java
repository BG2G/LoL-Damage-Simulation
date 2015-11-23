package lolsimulation.controller;

import lolsimulation.models.Being;
import lolsimulation.models.ChampionPool;
import lolsimulation.models.RuneShop;
import lolsimulation.models.Shop;

/**
 * Created by League of Engineers on 11/22/2015.
 */
public class Simulation {

    private static Simulation instance = null;

    private Shop shop;
    private ChampionPool championPool;
    private RuneShop runeShop;
    private Being attacker;
    private Being target;
    private float time;

    private Simulation(){
        shop = Shop.getShop();
        championPool = ChampionPool.getChampionPool();
        runeShop = RuneShop.getRuneShop();
        time = 0;

    }

    public static Simulation getSimulation(){
        if(instance == null){
            instance = new Simulation();
        }
        return instance;
    }

    public Shop getShop() {
        return shop;
    }

    public ChampionPool getChampionPool() {
        return championPool;
    }

    public Being getAttacker() {

        return attacker;
    }

    public void setAttacker(Being attacker) {
        this.attacker = attacker;
    }

    public Being getTarget() {
        return target;
    }

    public void setTarget(Being target) {
        this.target = target;
    }

    public float getTime(){
        return time;
    }




}

