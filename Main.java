/**
 * Created by amr on 18.11.2015.
 */
package lolsimulation;

import lolsimulation.models.runes.Glyph;
import lolsimulation.models.runes.Mark;
import lolsimulation.models.runes.RunePage;

public class Main {

    public static void main(String[] args){
        System.out.println("haha");
        Glyph a = new Glyph(1,2,3);
        Mark b = new Mark(5,1,4);
        Mark c = new Mark(0,0,7);
        //System.out.println(a.toString());
        //System.out.println(b.toString());

        RunePage pageRunes = new RunePage();
        for(int i=0;i<9;i++){
            pageRunes.addRune(a); //on ajoute 9 glyphes
        }
        pageRunes.addRune(c); //on ajoute une première marque
        for(int j=0;j<9;j++){
            pageRunes.addRune(b); //on ajoute 9 marques pour voir
        }

        System.out.println(pageRunes.toString());

        //on vérifie bien qu'on peut pas dépasser le nombre maximum de runes par type

    }
}
