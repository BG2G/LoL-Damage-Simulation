package lolsimulation.models;

import lolsimulation.models.items.Item;

import java.util.List;

/**
 * Created by League of Engineers on 11/17/2015.
 */
public class Shop {

    private static int NUMBER_OF_ITEMS = 1;

    private static Shop instance;
    private Item[] items = new Item[NUMBER_OF_ITEMS];

    public static Shop getShop(){
        if (instance == null){
            instance = new Shop();
        }
        return instance;

    }

    private Shop(){
        //TODO : generate all the objects
    }

    //TODO : methods to sort and search the shop for specific items

}
