package lolsimulation.ui;

import lolsimulation.ui.backgroundImage.PrincipalBackground;

import java.awt.*;

/**
 * Created by Guillaume on 21/11/2015.
 */
public class Testeur {

    public static void main(String[] args) {
        Window maFenetre = new Window();
        PrincipalBackground fond = new PrincipalBackground();
        //fond.setSize(fond.getPreferredSize());
        maFenetre.setContentPane(fond);
        System.out.println(fond.getHeight());
        System.out.println(fond.getWidth());
        maFenetre.pack();
        maFenetre.validate();


    }

}
