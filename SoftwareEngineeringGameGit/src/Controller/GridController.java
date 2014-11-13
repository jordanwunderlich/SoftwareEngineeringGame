/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GridSquare;
import View.GridView;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Jordan
 */
public class GridController implements MouseListener {
    
    GridSquare gridSquare;
    
    public GridController(GridSquare gridSquare, GridView gridView){
        this.gridSquare = gridSquare;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(gridSquare.getType() == GridSquare.Type.EMPTY
                && gridSquare.getTower() == null){
            BuildTower buildTower = new BuildTower(gridSquare);
            buildTower.show(e.getComponent(), e.getX(), e.getY());
        }
        if(gridSquare.getType() == GridSquare.Type.EMPTY
                && gridSquare.getTower() != null){
            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
}
