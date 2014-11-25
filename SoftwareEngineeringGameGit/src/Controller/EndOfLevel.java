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
public class EndOfLevel extends JPanel implements MouseListener {

public EndOfLevel () {
    
        restartRound = new Button("Restart Round");
        restartRound.addMouseListener(this);
        levelSelect = new Button("Level Select");
        levelSelect.addMouseListener(this);
        quit = new Button("Quit");
        quit.addMouseListener(this);
        add(restartRound);
        add(levelSelect);
        add(quit);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent click) {
        if (click.getSource() == restartRound) {
            clickedRestartRound();
        } else if (click.getSource() == levelSelect) {
            clickedLevelSelect();
        } else if (click.getSource() == quit) {
            clickedQuit();
        }
    }
    
    private void clickedRestartRound () {
        
    }
    private void clickedLevelSelect () {
        
    }
    private void clickedQuit () {
        
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

    private Button restartRound;
    private Button levelSelect;
    private Button quit;

}

   



    
   
    
    
    
    

