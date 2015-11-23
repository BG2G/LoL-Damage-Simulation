package lolsimulation.ui;

import javax.swing.*;

/**
 * Created by Guillaume on 22/11/2015.
 */
public class Panel extends JPanel {

    private JComponent elements[];



    public Panel(JComponent ele[], String lay){
        this.elements = ele;

        // Add the components to the panel

        for (int i = 0; i < this.elements.length; i++){
            this.add(this.elements[i]);
        }

    }

}
