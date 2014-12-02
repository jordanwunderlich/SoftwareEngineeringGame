/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Manager.InGameState;
import Manager.Manager;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author Jordan
 */
public class MainMenu extends JPanel implements MouseListener{
    
    public MainMenu(){
        setSize(new Dimension (600, 800));
        setLayout (null);
        tutorial = new Button("Tutorial");
        tutorial.setBounds (150,375,75,50);
        tutorial.addMouseListener(this);
        newGame = new Button("New Game");
        newGame.setBounds (250,375,75,50);
        newGame.addMouseListener(this);
        loadGame = new Button("Load Game");
        loadGame.setBounds (350,375,75,50);
        loadGame.addMouseListener(this);
        options = new Button("Options");
        options.setBounds (450,375,75,50);
        options.addMouseListener(this);
        quit = new Button("Quit");
        quit.setBounds (550,375,75,50);
        quit.addMouseListener(this);
        add(tutorial);
        add(newGame);
        add(loadGame);
        add(options);
        add(quit);
        tutorial.repaint();
        newGame.repaint();
        loadGame.repaint();
        options.repaint();
        quit.repaint();
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
