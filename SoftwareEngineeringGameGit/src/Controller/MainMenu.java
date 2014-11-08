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
        newGame = new Button("New Game");
        newGame.addMouseListener(this);
        loadGame = new Button("Load Game");
        loadGame.addMouseListener(this);
        options = new Button("Options");
        options.addMouseListener(this);
        quit = new Button("Quit");
        quit.addMouseListener(this);
        add(tutorial);
        add(newGame);
        add(loadGame);
        add(options);
        add(quit);
        setVisible(true);
    }
    
    @Override
    public void mouseClicked(MouseEvent click){
        if(click.getSource() == tutorial){
            clickedTutorial();
        }else if(click.getSource() == newGame){
            clickedNewGame();
        }else if(click.getSource() == loadGame){
            clickedLoadGame();
        }else if(click.getSource() == options){
            clickedOptions();
        }else if(click.getSource() == quit){
            clickedQuit();
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
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
     
    private Button tutorial;
    private Button newGame;
    private Button loadGame;
    private Button options;
    private Button quit;

    
}
