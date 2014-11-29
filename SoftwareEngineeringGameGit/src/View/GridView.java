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
            if(gridSquare.getTower() instanceof TowerBasic){
                try {
                    img = ImageIO.read(new File("EmptyGridSquare.png"));
                } catch (IOException e) {
                }
            } else {
                try {
                    img = ImageIO.read(new File("EmptyGridSquare.png"));
                } catch (IOException e) {
                }
            }
        } else if (gridSquare.getType() == GridSquare.Type.PATH) {
            try {
                img = ImageIO.read(new File("PathGridSquare.png"));
            } catch (IOException e) {
            }
        }
    }
    
    public int getX(){
        return gridsquare.xloc;
    }
    
    public int getY(){
        return gridsquare.yloc;
    }
    
    public void setX(int x){
        gridsquare.xloc = x;
    }
    
    public void setY(int y){
        gridsquare.yloc = y;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, gridsquare.xloc, gridsquare.yloc, null);
    }
    
    GridSquare gridsquare;
    BufferedImage img;

}
