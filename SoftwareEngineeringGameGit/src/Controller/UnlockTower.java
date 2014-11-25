/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author student
 */
    public class UnlockTower extends JPanel implements MouseListener {

    public UnlockTower() {

        basicTower = new Button("Basic Tower");
        basicTower.addMouseListener(this);
        longRangeTower = new Button("Long Range Tower");
        longRangeTower.addMouseListener(this);
        slowTower = new Button("Slow Tower");
        slowTower.addMouseListener(this);
        areaOfEffectTower = new Button("Area of Effect Tower");
        areaOfEffectTower.addMouseListener(this);
        add(basicTower);
        add(longRangeTower);
        add(slowTower);
        add(areaOfEffectTower);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent click) {
        if (click.getSource() == basicTower) {
            clickedSlowTower();
        } else if (click.getSource() == longRangeTower) {
            clickedLongRangeTower();
        } else if (click.getSource() == slowTower) {
            clickedSlowTower();
        } else if (click.getSource() == areaOfEffectTower) {
            clickedAreaOfEffectTower();
        }
    }
     private void clickedBasicTower () {
        
    }
            
    private void clickedSlowTower () {
        
    }
            
    private void clickedAreaOfEffectTower () {
        
    }
    private void clickedLongRangeTower () {
        
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

    private Button basicTower;
    private Button slowTower;
    private Button longRangeTower;
    private Button areaOfEffectTower;

}

    
    
    
   

