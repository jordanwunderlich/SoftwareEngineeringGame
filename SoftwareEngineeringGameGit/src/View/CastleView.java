/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.GridSquare;
import Model.Levels.GridCoordinates;
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
 * @author Jordan
 */
public class CastleView extends JComponent {

    public CastleView(GridCoordinates gridCoordinates) {
        this.gridCoordinates = gridCoordinates;
        setSize(new Dimension(32, 32));
        try {
            sprite = ImageIO.read(new File("newcastle.png"));
        } catch (IOException ex) {
            Logger.getLogger(CreepSprite.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(sprite, gridCoordinates.getX()*32-32, gridCoordinates.getY()*32-32, null);
        this.setLocation(gridCoordinates.getX()*32-32, gridCoordinates.getY()*32-32);
    }

    private GridCoordinates gridCoordinates;
    private BufferedImage sprite;
}
