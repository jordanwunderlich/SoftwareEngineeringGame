/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GridSquare;
import Model.Towers.TowerAoE;
import Model.Towers.TowerBasic;
import Model.Towers.TowerLong;
import Model.Towers.TowerSlow;
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
        basicTower.addActionListener(this);
        longrangeTower.addActionListener(this);
        slowingTower.addActionListener(this);
        aoeTower.addActionListener(this);
        add(basicTower);
        add(longrangeTower);
        add(slowingTower);
        add(aoeTower);
    }
    
    private void basicTower(){
        gridsquare.setTower(new TowerBasic());
    }
    
    private void longrangeTower(){
        gridsquare.setTower(new TowerLong());
        System.out.println("Long Range Tower clicked");
    }
    
    private void slowingTower(){
        gridsquare.setTower(new TowerSlow());
        System.out.println("Slowing Tower clicked");
    }
    
    private void aoeTower(){
        gridsquare.setTower(new TowerAoE());
        System.out.println("AOE Tower clicked");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == basicTower){
            basicTower();
        } else if (ae.getSource() == longrangeTower){
            longrangeTower();
        } else if (ae.getSource() == slowingTower){
            slowingTower();
        } else if (ae.getSource() == aoeTower){
            aoeTower();
        }
    }
   
}
