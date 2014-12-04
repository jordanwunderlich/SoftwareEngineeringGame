/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.GridSquare;
import Model.Towers.TowerBasic;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author Jordan
 */
public class GridView extends JComponent {

    public GridView(GridSquare gridSquare) {
        this.gridsquare = gridSquare;

        setSize(new Dimension(32, 32));
        if (gridSquare.getType() == GridSquare.Type.EMPTY) {
            if (gridSquare.getTower() instanceof TowerBasic) {
                try {
                    towerimg = ImageIO.read(new File("basictowertrans.png"));
                } catch (IOException e) {
                }
            }
            try {
                img = ImageIO.read(new File("EmptyGridSquare.png"));
            } catch (IOException e) {
            }
        } else if (gridSquare.getType() == GridSquare.Type.PATH) {
            try {
                img = ImageIO.read(new File("PathGridSquare.png"));
            } catch (IOException e) {
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, gridsquare.xloc, gridsquare.yloc, null);
        if(towerimg == null && gridsquare.getTower() != null){
            if(gridsquare.getTower() instanceof TowerBasic){
                try {
                    towerimg = ImageIO.read(new File("basictowertrans.png"));
                } catch (IOException e) {
                }
            }
        }
        if(towerimg != null){
            g.drawImage(towerimg, gridsquare.xloc, gridsquare.yloc, null);
        }
    }

    GridSquare gridsquare;
    BufferedImage img;
    BufferedImage towerimg = null;

}
