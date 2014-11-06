/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Manager.InGameState;
import Manager.Manager;
import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author Jordan
 */
public class MainMenu extends JPanel implements MouseListener{
    
    public MainMenu(){
        tutorial = new Button("Tutorial");
        tutorial.addMouseListener(this);
        buttons = new Button[5];
        buttons[0] = tutorial;
    }
    
    @Override
    public void mouseClicked(MouseEvent click){
        if(click.getSource() == tutorial){
            clickedTutorial();
        }
    }
    
    private void clickedTutorial(){
        
    }
    
    private void clickedNewGame(){
        Manager.setState(new InGameState());
    }
    
    private void clickedLoadGame(){
        
    }
    
    private void clickedOptions(){
        
    }
    
    private void clickedQuit(){
        System.exit(0);
    }
     
    public Button[] getButtons(){
        return buttons;
    }
    
    private Button[] buttons;
    private Button tutorial;

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
    
}
