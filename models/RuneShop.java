package lolsimulation.models;

import lolsimulation.models.items.Item;
import lolsimulation.models.runes.Rune;

/**
 * Created by League of Engineers on 11/22/2015.
 */
public class RuneShop {

    private static int NUMBER_OF_RUNES = 1;

    private static RuneShop instance;
    private Rune[] runes = new Rune[NUMBER_OF_RUNES];

    public static RuneShop getRuneShop(){
        if (instance == null){
            instance = new RuneShop();
        }
        return instance;

    }

    private RuneShop(){
        //TODO : generate all runes
    }

    //TODO : methods to sort and search the runeShop for specific runes, get seals, glyphs. ...

}
