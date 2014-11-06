/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Manager.InGameState;
import Manager.Manager;
import java.awt.Button;
import java.awt.event.ActionEvent;

/**
 *
 * @author Jordan
 */
public class MainMenu extends Menu{
    
    public MainMenu(){
        tutorial = new Button("Tutorial");
        tutorial.addActionListener(this);
        buttons = new Button[5];
        buttons[0] = tutorial;
    }
    
    @Override
    public void actionPerformed(ActionEvent click){
        if(click.getActionCommand().equals("tutorial")){
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
    
    @Override
    public Button[] getButtons(){
        return buttons;
    }
    
    private Button[] buttons;
    private Button tutorial;
    
}
