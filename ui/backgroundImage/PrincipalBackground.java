package lolsimulation.ui.backgroundImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Guillaume on 22/11/2015.
 */
public class PrincipalBackground extends JPanel{


    private BufferedImage img;

    public PrincipalBackground(){
        try {
            this.img =  ImageIO.read(getClass().getResource("../../../lolsimulation/ressources/wallpapers/FondLoLSim.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.setPreferredSize(new Dimension(this.img.getWidth(),this.img.getHeight()));
        this.setSize(new Dimension(this.img.getWidth(),this.img.getHeight()));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.img, 0, 0,this.getWidth(),this.getHeight(), null);
    }


    public BufferedImage getImg() {
        return img;
    }

}
