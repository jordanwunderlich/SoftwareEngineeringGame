/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author acer
 */
public class BuildTower extends JPopupMenu{
    
    private JMenuItem basicTower;
    private JMenuItem longrangeTower;
    private JMenuItem slowingTower;
    private JMenuItem aoeTower;
    
    public BuildTower(ActionListener a){
        basicTower = new JMenuItem("Basic Tower");
        longrangeTower = new JMenuItem("Long Range Tower");
        slowingTower = new JMenuItem("Slowing Tower");
        aoeTower = new JMenuItem("Area of Effect Tower");
        basicTower.addActionListener(a);
        longrangeTower.addActionListener(a);
        slowingTower.addActionListener(a);
        aoeTower.addActionListener(a);
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
   
}
