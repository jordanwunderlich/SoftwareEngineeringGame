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
 * @author student
 */
public class PauseMenu extends JPanel implements MouseListener {

    public PauseMenu() {

        setSize(new Dimension (600, 800));
        setLayout (null);
        resume = new Button("Resume");
        resume.setBounds (357,162,85,50);
        resume.addMouseListener(this);
        restartRound = new Button("Restart Level");
        restartRound.setBounds (357,237,85,50);
        restartRound.addMouseListener(this);
        returntoLevelSelect = new Button("Level Select");
        returntoLevelSelect.setBounds (357,312,85,50);
        returntoLevelSelect.addMouseListener(this);
        quit = new Button("Quit");
        quit.setBounds (357,387,85,50);
        quit.addMouseListener(this);
        add(resume);
        add(restartRound);
        add(returntoLevelSelect);
        add(quit);
        resume.repaint();
        restartRound.repaint();
        returntoLevelSelect.repaint();
        quit.repaint();
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent click) {
        if (click.getSource() == pause) {
            clickedPause();
        } else if (click.getSource() == resume) {
            clickedResume();
        } else if (click.getSource() == returntoLevelSelect) {
            clickedReturnToLevelSelect();
        } else if (click.getSource() == quit) {
            clickedQuit();
        }
    }

    private void clickedPause() {

    }

    private void clickedResume() {

    }

    private void clickedReturnToLevelSelect() {

    }

    private void clickedQuit() {
        System.exit(0);
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

    private Button pause;
    private Button resume;
    private Button restartRound;
    private Button returntoLevelSelect;
    private Button quit;

}
