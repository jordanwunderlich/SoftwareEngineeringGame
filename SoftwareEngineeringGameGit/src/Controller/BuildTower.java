/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GridSquare;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author acer
 */
public class BuildTower extends JPopupMenu implements ActionListener{
    
    private JMenuItem basicTower;
    private JMenuItem longrangeTower;
    private JMenuItem slowingTower;
    private JMenuItem aoeTower;
    private GridSquare gridsquare;
    
    public BuildTower(GridSquare gridsquare){
        this.gridsquare = gridsquare;
        basicTower = new JMenuItem("Basic Tower");
        longrangeTower = new JMenuItem("Long Range Tower");
        slowingTower = new JMenuItem("Slowing Tower");
        aoeTower = new JMenuItem("Area of Effect Tower");
        add(basicTower);
        add(longrangeTower);
        add(slowingTower);
        add(aoeTower);
    }
    
    private void basicTower(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void longrangeTower(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void slowingTower(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void aoeTower(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //if (ae == basicTower){
            
        //}
    }
   
}
