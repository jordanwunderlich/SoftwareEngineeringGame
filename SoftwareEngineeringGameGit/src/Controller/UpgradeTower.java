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
public class UpgradeTower extends JPopupMenu implements ActionListener{
    
    private JMenuItem sellTower;
    private JMenuItem upgradeRange;
    private JMenuItem upgradeSpeed;
    private JMenuItem upgradeDamage;
    private GridSquare gridsquare;
    
    public UpgradeTower(GridSquare gridsquare){
        this.gridsquare = gridsquare;
        sellTower = new JMenuItem("Sell Tower");
        upgradeRange = new JMenuItem("Upgrade Range");
        upgradeSpeed = new JMenuItem("Upgrade Speed");
        upgradeDamage = new JMenuItem("Upgrade Damage");
        sellTower.addActionListener(this);
        upgradeRange.addActionListener(this);
        upgradeSpeed.addActionListener(this);
        upgradeDamage.addActionListener(this);
        add(sellTower);
        add(upgradeRange);
        add(upgradeSpeed);
        add(upgradeDamage);
    }
    
    private void sellTower(){
        
    }
    
    private void upgradeRange(){
        
    }
    
    private void upgradeSpeed(){
        
    }
    
    private void upgradeDamage(){
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == sellTower){
            sellTower();
        } else if (ae.getSource() == upgradeRange){
            upgradeRange();
        } else if (ae.getSource() == upgradeSpeed){
            upgradeSpeed();
        } else if (ae.getSource() == upgradeDamage){
            upgradeDamage();
        }
    }
   
}
