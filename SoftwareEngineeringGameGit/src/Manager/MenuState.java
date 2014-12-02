/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Controller.MainMenu;
import javax.swing.JFrame;

/**
 *
 * @author Jordan
 */
public class MenuState extends State {
    
    public MenuState(JFrame frame){
        this.frame = frame;
        frame.getContentPane().add(new MainMenu());
        frame.repaint();
    }
    
    private void displaylevelSelect(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void load(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private JFrame frame;
    
}
