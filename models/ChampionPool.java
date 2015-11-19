package lolsimulation.models;

import lolsimulation.models.champions.Champion;
import lolsimulation.models.champions.Warwick;

/**
 * Created by League of Engineers on 11/17/2015.
 */
public class ChampionPool {

    private static int NUMBER_OF_CHAMPIONS = 1;

    private static ChampionPool instance;
    private Champion[] champions = new Champion[NUMBER_OF_CHAMPIONS];

    public static ChampionPool getChampionPool(){
        if(instance == null){
            instance = new ChampionPool();
        }
        return instance;
    }

    private ChampionPool(){
        champions[0] = new Warwick();
        //TODO: generate all Champions
    }

    //TODO: methods to sort and search champions

}
