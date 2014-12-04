/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Creeps.Creep;
import Model.Creeps.CreepBasic;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author Student
 */
public class BangView extends JComponent {

    public BangView(Creep creep) {
        this.creep = creep;
        setSize(new Dimension(32, 32));
        try {
            sprite = ImageIO.read(new File("bang.png"));
        } catch (IOException ex) {
            Logger.getLogger(CreepSprite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(sprite, creep.xloc, creep.yloc, null);
        this.setLocation(creep.xloc, creep.yloc);
    }

    private Creep creep;
    private BufferedImage sprite;
}
