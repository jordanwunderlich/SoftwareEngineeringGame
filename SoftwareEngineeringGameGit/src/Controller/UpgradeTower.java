/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author acer
 */
public class UpgradeTower extends JPanel implements MouseListener {

public UpgradeTower () {
        setSize (new Dimension (600,800));
        setLayout (null);
        sellTower = new Button("Sell Tower");
        sellTower.setBounds (50,50,50,50);
        sellTower.addMouseListener(this);
        upgradeRange = new Button("Upgrade Range");
        upgradeRange.addMouseListener(this);
        upgradeSpeed = new Button("Upgrade Speed");
        upgradeSpeed.addMouseListener(this);
        upgradeDamage = new Button("Upgrade Damage");
        upgradeDamage.addMouseListener(this);
        add(sellTower);
        add(upgradeRange);
        add(upgradeSpeed);
        add(upgradeDamage);
        sellTower.repaint();
        setVisible(true);
    }

@Override
    public void mouseClicked(MouseEvent click) {
        if (click.getSource() == sellTower) {
            clickedSellTower();
        } else if (click.getSource() == upgradeRange) {
            clickedUpgradeRange();
        } else if (click.getSource() == upgradeSpeed) {
            clickedUpgradeSpeed();
        } else if (click.getSource() == upgradeDamage) {
            clickedUpgradeDamage();
        }
    }

     private void clickedSellTower(){
        
    }
    
    private void clickedUpgradeRange(){
       
    }
    
    private void clickedUpgradeSpeed(){
       
    }
    
    private void clickedUpgradeDamage(){
        
    }
    
    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    private Button sellTower;
    private Button upgradeRange;
    private Button upgradeSpeed;
    private Button upgradeDamage;

}

   

